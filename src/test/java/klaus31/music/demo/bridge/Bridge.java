package klaus31.music.demo.bridge;

import klaus31.music.command.Sleep;
import klaus31.music.theme.SonglineList;
import klaus31.music.theme.Theme;
import klaus31.music.theme.ThemeThreaded;

public class Bridge implements Theme {
	private final Theme melody = new MelodyB();
	final SonglineList songlines = new SonglineList();

	public Bridge() {
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
