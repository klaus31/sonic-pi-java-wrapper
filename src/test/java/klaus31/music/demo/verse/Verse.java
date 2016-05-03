package klaus31.music.demo.verse;

import klaus31.music.SonglineList;
import klaus31.music.command.Sleep;
import klaus31.music.theme.Theme;
import klaus31.music.theme.ThemeThreaded;

public class Verse implements Theme {

	private final Theme drum = new Drum();
	private final Theme melody = new MelodyA();

	@Override
	public SonglineList getSonglines() {
		final SonglineList songlines = new SonglineList();
		songlines.add(new ThemeThreaded(drum));
		songlines.add(new ThemeThreaded(melody));
		return songlines;
	}

	@Override
	public Sleep getTotalBeats() {
		return drum.getTotalBeats();
	}

}
