package klaus31.music;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import klaus31.music.theme.Song;

public class SongSonicPiBashPlayer implements Player {

	@Override
	public void play(final Song song) {
		try {
			final File songfile = File.createTempFile("songfile", ".tmp");
			System.out.println("Songfile: " + songfile.toPath());

			final StringBuilder songlines = new StringBuilder();
			songlines.append(String.format("%s%n", song.getBpmCommand().getSongline()));
			song.getSonglines().forEach(songline -> songlines.append(String.format("%s%n", songline.toString())));

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