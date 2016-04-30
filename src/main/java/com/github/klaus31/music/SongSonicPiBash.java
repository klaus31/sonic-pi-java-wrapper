package com.github.klaus31.music;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public abstract class SongSonicPiBash implements Song {

	public abstract List<String> getSonglines();

	@Override
	public void play() {
		try {
			File songfile = File.createTempFile("songfile", ".tmp");
			System.out.println("Songfile: " + songfile.toPath());

			StringBuilder songlines = new StringBuilder();
			getSonglines().forEach(songline -> songlines.append(String.format("%s%n", songline)));

			FileUtils.writeStringToFile(songfile, songlines.toString());

			ProcessBuilder pb = new ProcessBuilder("/bin/sh", "-c", "cat "+songfile.getName()+" | sonic_pi");
			pb.inheritIO();
			pb.directory(songfile.getParentFile());
			pb.start();
		} catch (NullPointerException | IOException e) {
			e.printStackTrace();
		}
	}
}
