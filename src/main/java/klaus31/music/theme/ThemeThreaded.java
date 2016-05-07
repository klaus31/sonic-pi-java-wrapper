package klaus31.music.theme;

import klaus31.music.Songline;
import klaus31.music.SonglineList;
import klaus31.music.command.Sleep;

public class ThemeThreaded implements Theme {

	private final Theme theme;
	final SonglineList songlines = new SonglineList();

	public ThemeThreaded(final Theme theme) {
		this.theme = theme;
		songlines.add(Songline.create("in_thread do"));
		songlines.addAll(theme.getSonglines());
		songlines.add(Songline.create("end"));
	}

	@Override
	public SonglineList getSonglines() {
		return songlines;
	}

	@Override
	public Sleep getTotalBeats() {
		return theme.getTotalBeats();
	}
}
