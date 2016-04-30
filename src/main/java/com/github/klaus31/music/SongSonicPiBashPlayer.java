package com.github.klaus31.music;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import com.github.klaus31.theme.Theme;

public class SongSonicPiBashPlayer implements Player {

	@Override
	public void play(final Theme theme) {
		try {
			final File songfile = File.createTempFile("songfile", ".tmp");
			System.out.println("Songfile: " + songfile.toPath());

			final StringBuilder songlines = new StringBuilder();
			theme.getSonglines().forEach(songline -> songlines.append(String.format("%s%n", songline.getSongLine())));

			FileUtils.writeStringToFile(songfile, songlines.toString());

			final ProcessBuilder pb = new ProcessBuilder("/bin/sh", "-c", "cat " + songfile.getName() + " | sonic_pi");
			pb.inheritIO();
			pb.directory(songfile.getParentFile());
			pb.start();
		} catch (NullPointerException | IOException e) {
			e.printStackTrace();
		}
	}
}
