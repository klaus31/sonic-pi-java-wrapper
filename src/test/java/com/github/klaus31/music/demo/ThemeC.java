package com.github.klaus31.music.demo;

import com.github.klaus31.music.SonglineList;
import com.github.klaus31.music.command.Sleep;
import com.github.klaus31.music.theme.Theme;
import com.github.klaus31.music.theme.ThemeThreaded;

public class ThemeC implements Theme {
	private final Theme melody = new MelodyC();

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
