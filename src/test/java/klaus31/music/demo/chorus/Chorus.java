package klaus31.music.demo.chorus;

import klaus31.music.SonglineList;
import klaus31.music.command.Sleep;
import klaus31.music.theme.Theme;
import klaus31.music.theme.ThemeThreaded;

public class Chorus implements Theme {

	private final Theme melody = new Melody();
	final SonglineList songlines = new SonglineList();

	public Chorus() {
		songlines.add(new ThemeThreaded(melody));
	}

	@Override
	public SonglineList getSonglines() {
		return songlines;
	}

	@Override
	public Sleep getTotalBeats() {
		return melody.getTotalBeats();
	}

}
