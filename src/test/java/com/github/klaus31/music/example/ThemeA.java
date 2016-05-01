package com.github.klaus31.music.example;

import java.util.ArrayList;
import java.util.List;

import com.github.klaus31.command.Sleep;
import com.github.klaus31.music.Songline;
import com.github.klaus31.theme.Theme;
import com.github.klaus31.theme.ThemeThreaded;

public class ThemeA implements Theme {

	private final Theme drum = new DrumExample();
	private final Theme melody = new MelodyAExample();

	@Override
	public List<Songline> getSonglines() {
		final List<Songline> songlines = new ArrayList<>();
		songlines.addAll(new ThemeThreaded(drum).getSonglines());
		songlines.addAll(new ThemeThreaded(melody).getSonglines());
		return songlines;
	}

	@Override
	public Sleep getTotalBeats() {
		return drum.getTotalBeats();
	}

}
