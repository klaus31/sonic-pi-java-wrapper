package klaus31.music;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import klaus31.music.theme.Song;

public class PlayerSonicPi implements Player {

	private boolean debugMode = false;

	@Override
	public void play(final Song song) {
		try {
			final File songfile = File.createTempFile("songfile", ".tmp");
			System.out.println("Songfile: " + songfile.toPath());

			final StringBuilder songlines = new StringBuilder();
			song.doWithSonglines(songline -> songlines.append(String.format("%s%n", songline.toString())));
			if (debugMode) {
				song.doWithSonglines(System.out::println);
			}

			FileUtils.writeStringToFile(songfile, songlines.toString());

			final ProcessBuilder pb = new ProcessBuilder("/bin/sh", "-c", "cat " + songfile.getName() + " | sonic_pi");
			pb.inheritIO();
			pb.directory(songfile.getParentFile());
			pb.start();
		} catch (NullPointerException | IOException e) {
			e.printStackTrace();
		}
	}

	public Player activateDebugging() {
		debugMode = true;
		return this;
	}
}
