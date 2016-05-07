package klaus31.music.demo.verse;

import klaus31.music.command.Sleep;
import klaus31.music.theme.SonglineList;
import klaus31.music.theme.Theme;
import klaus31.music.theme.ThemeThreaded;

public class Verse implements Theme {

	private final Theme drum = new Drum(10);
	private final Theme melody = new MelodyA(3);
	final SonglineList songlines = new SonglineList();

	public Verse() {
		songlines.add(new ThemeThreaded(drum));
		songlines.add(new ThemeThreaded(melody));
	}

	@Override
	public SonglineList getSonglines() {
		return songlines;
	}

	@Override
	public Sleep getTotalBeats() {
		return drum.getTotalBeats();
	}

}
