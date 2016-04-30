package com.github.klaus31.music.example;

import java.util.ArrayList;
import java.util.List;

import com.github.klaus31.command.Command;
import com.github.klaus31.command.Sleep;
import com.github.klaus31.theme.Theme;
import com.github.klaus31.theme.ThemeThreaded;

public class ThemeB implements Theme {
	private final Theme otherMelodyExample = new OtherMelodyExample();

	@Override
	public List<Command> getSonglines() {
		final List<Command> songlines = new ArrayList<>();
		songlines.addAll(new ThemeThreaded(otherMelodyExample).getSonglines());
		return songlines;
	}

	@Override
	public Sleep getTotalBeats() {
		return otherMelodyExample.getTotalBeats();
	}

}
