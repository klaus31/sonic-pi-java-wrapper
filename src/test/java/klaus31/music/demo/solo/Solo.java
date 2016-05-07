package klaus31.music.demo.solo;

import klaus31.music.SonglineList;
import klaus31.music.command.Sleep;
import klaus31.music.theme.Theme;
import klaus31.music.theme.ThemeThreaded;

public class Solo implements Theme {

	private final Theme melody = new MelodyC();
	private final Theme drum = new Drum();

	@Override
	public SonglineList createSonglines() {
		final SonglineList songlines = new SonglineList();
		songlines.add(new ThemeThreaded(melody));
		songlines.add(new ThemeThreaded(drum));
		return songlines;
	}

	@Override
	public Sleep getTotalBeats() {
		return melody.getTotalBeats();
	}

}
