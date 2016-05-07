package klaus31.music.demo.song.solo;

import klaus31.music.command.Sleep;
import klaus31.music.theme.SonglineList;
import klaus31.music.theme.Theme;
import klaus31.music.theme.ThemeThreaded;

public class Solo implements Theme {

	private final Theme melody = new MelodyC();
	private final Theme drum = new Drum();
	final SonglineList songlines = new SonglineList();

	public Solo() {
		songlines.add(new ThemeThreaded(melody));
		songlines.add(new ThemeThreaded(drum));
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
