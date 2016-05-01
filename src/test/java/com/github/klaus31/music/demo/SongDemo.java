package com.github.klaus31.music.demo;

import com.github.klaus31.command.UseBpm;
import com.github.klaus31.music.Songline;
import com.github.klaus31.music.SonglineList;
import com.github.klaus31.theme.Song;
import com.github.klaus31.theme.Theme;

public class SongDemo implements Song {

	Theme themeA = new ThemeA();
	Theme themeB = new ThemeB();
	Theme themeC = new ThemeC();

	@Override
	public UseBpm getBpmCommand() {
		return new UseBpm(40);
	}

	@Override
	public SonglineList getSonglines() {
		final SonglineList songlines = new SonglineList();
		songlines.add(themeA);
		songlines.add(themeB);
		songlines.add(themeA);
		songlines.add(themeC);
		songlines.add(Songline.create("use_octave 0.5"));
		songlines.add(themeA);
		return songlines;
	}

}
