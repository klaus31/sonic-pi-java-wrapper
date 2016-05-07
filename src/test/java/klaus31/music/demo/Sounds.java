package klaus31.music.demo;

import java.io.IOException;

import klaus31.music.Player;
import klaus31.music.PlayerSonicPi;
import klaus31.music.SonglineList;
import klaus31.music.command.UseBpm;
import klaus31.music.drums.hihat.HiHatBase;
import klaus31.music.theme.Song;

public class Sounds implements Song {

	public static void main(final String... args) throws IOException {
		final Song song = new Sounds();
		final Player player = new PlayerSonicPi();
		player.play(song);
	}

	final SonglineList songlines = new SonglineList();

	public Sounds() {
		songlines.add(new HiHatBase());
	}

	@Override
	public UseBpm getBpmCommand() {
		return new UseBpm(80);
	}

	@Override
	public SonglineList getSonglines() {
		return songlines;
	}

}
