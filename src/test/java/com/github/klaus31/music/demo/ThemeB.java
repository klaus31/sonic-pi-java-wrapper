package com.github.klaus31.music.demo;

import com.github.klaus31.command.Sleep;
import com.github.klaus31.music.SonglineList;
import com.github.klaus31.theme.Theme;
import com.github.klaus31.theme.ThemeThreaded;

public class ThemeB implements Theme {
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
