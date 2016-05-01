package com.github.klaus31.music.example;

import com.github.klaus31.command.UseBpm;
import com.github.klaus31.music.SonglineList;
import com.github.klaus31.theme.Song;
import com.github.klaus31.theme.Theme;

public class SongExample implements Song {

	Theme themeA = new ThemeA();
	Theme themeB = new ThemeB();

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
		return songlines;
	}

}
