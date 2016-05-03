package klaus31.music.demo;

import klaus31.music.SonglineList;
import klaus31.music.command.UseBpm;
import klaus31.music.theme.Song;
import klaus31.music.theme.Theme;

public class SongDemo implements Song {

	Theme themeA = new ThemeA();
	Theme themeB = new ThemeB();
	Theme themeC = new ThemeC();

	@Override
	public UseBpm getBpmCommand() {
		return new UseBpm(80);
	}

	@Override
	public SonglineList getSonglines() {
		final SonglineList songlines = new SonglineList();
		songlines.add(themeA);
		songlines.add(themeB);
		songlines.add(themeA);
		songlines.add(themeC);
		songlines.add(themeA);
		return songlines;
	}

}