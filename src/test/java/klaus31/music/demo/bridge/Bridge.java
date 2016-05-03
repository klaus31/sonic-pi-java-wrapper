package klaus31.music.demo.bridge;

import klaus31.music.SonglineList;
import klaus31.music.command.Sleep;
import klaus31.music.theme.Theme;
import klaus31.music.theme.ThemeThreaded;

public class Bridge implements Theme {
	private final Theme melody = new MelodyB();

	@Override
	public SonglineList getSonglines() {
		final SonglineList songlines = new SonglineList();
		songlines.add(new ThemeThreaded(melody));
		return songlines;
	}

	@Override
	public Sleep getTotalBeats() {
		return melody.getTotalBeats();
	}

}
