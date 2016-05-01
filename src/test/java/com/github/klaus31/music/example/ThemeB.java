package com.github.klaus31.music.example;

import com.github.klaus31.command.Sleep;
import com.github.klaus31.music.SonglineList;
import com.github.klaus31.theme.Theme;
import com.github.klaus31.theme.ThemeThreaded;

public class ThemeB implements Theme {
	private final Theme otherMelodyExample = new MelodyBExample();

	@Override
	public SonglineList getSonglines() {
		final SonglineList songlines = new SonglineList();
		songlines.add(new ThemeThreaded(otherMelodyExample));
		return songlines;
	}

	@Override
	public Sleep getTotalBeats() {
		return otherMelodyExample.getTotalBeats();
	}

}
