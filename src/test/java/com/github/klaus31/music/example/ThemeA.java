package com.github.klaus31.music.example;

import com.github.klaus31.command.Sleep;
import com.github.klaus31.music.SonglineList;
import com.github.klaus31.theme.Theme;
import com.github.klaus31.theme.ThemeThreaded;

public class ThemeA implements Theme {

	private final Theme drum = new DrumExample();
	private final Theme melody = new MelodyAExample();

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
