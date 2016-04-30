package com.github.klaus31.music.example;

import java.util.ArrayList;
import java.util.List;

import com.github.klaus31.command.Command;
import com.github.klaus31.command.Play;
import com.github.klaus31.command.Sleep;
import com.github.klaus31.theme.Theme;

public class ThemeB implements Theme {

	@Override
	public List<Command> getSonglines() {
		final List<Command> songlines = new ArrayList<>();
		int note = 40;
		final double beats = 0.5;
		while (note++ < 80) {
			songlines.add(new Play(note));
			songlines.add(new Sleep(beats));
		}
		return songlines;
	}

}
