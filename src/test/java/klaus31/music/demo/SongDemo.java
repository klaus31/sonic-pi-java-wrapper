package klaus31.music.demo;

import java.io.IOException;

import klaus31.music.Player;
import klaus31.music.PlayerSonicPi;
import klaus31.music.SonglineList;
import klaus31.music.command.UseBpm;
import klaus31.music.demo.bridge.Bridge;
import klaus31.music.demo.solo.Solo;
import klaus31.music.demo.verse.Verse;
import klaus31.music.theme.Song;
import klaus31.music.theme.Theme;

public class SongDemo implements Song {

	public static void main(final String... args) throws IOException {
		final Song song = new SongDemo();
		final Player player = new PlayerSonicPi();
		player.play(song);
	}

	private final Theme verse1 = new Verse();
	private final Theme verse2 = new Verse();
	private final Theme verse3 = new Verse();
	private final Theme bridge = new Bridge();
	private final Theme solo = new Solo();

	@Override
	public UseBpm getBpmCommand() {
		return new UseBpm(80);
	}

	@Override
	public SonglineList getSonglines() {
		final SonglineList songlines = new SonglineList();
		songlines.add(verse1);
		songlines.add(bridge);
		songlines.add(verse2);
		songlines.add(solo);
		songlines.add(verse3);
		return songlines;
	}

}
