package klaus31.music.demo.song;

import java.io.IOException;

import klaus31.music.Player;
import klaus31.music.PlayerSonicPi;
import klaus31.music.command.UseBpm;
import klaus31.music.demo.song.bridge.Bridge;
import klaus31.music.demo.song.chorus.Chorus;
import klaus31.music.demo.song.solo.Solo;
import klaus31.music.demo.song.verse.Verse;
import klaus31.music.theme.Song;
import klaus31.music.theme.SonglineList;
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
	private final Theme chorus1 = new Chorus();
	private final Theme chorus2 = new Chorus();
	private final Theme solo = new Solo();
	private final SonglineList songlines = new SonglineList();

	public SongDemo() {
		songlines.add(verse1);
		// songlines.add(chorus2); // FIXME not playing on my bot :(
		songlines.add(bridge);
		songlines.add(verse2);
		// songlines.add(chorus2); // FIXME not playing on my bot :(
		songlines.add(solo);
		songlines.add(verse3);
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
