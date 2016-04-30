package com.github.klaus31.music.example;

import java.util.ArrayList;
import java.util.List;

import com.github.klaus31.command.Command;
import com.github.klaus31.command.Sleep;
import com.github.klaus31.theme.Theme;
import com.github.klaus31.theme.ThemeThreaded;

public class ThemeA implements Theme {

	private final Theme drum = new DrumExample();
	private final Theme melody = new MelodyExample();

	@Override
	public List<Command> getSonglines() {
		final List<Command> songlines = new ArrayList<>();
		songlines.addAll(new ThemeThreaded(drum).getSonglines());
		songlines.addAll(new ThemeThreaded(melody).getSonglines());
		return songlines;
	}

	@Override
	public Sleep getTotalBeats() {
		return drum.getTotalBeats();
	}

}
