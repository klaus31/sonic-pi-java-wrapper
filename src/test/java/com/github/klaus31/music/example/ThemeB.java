package com.github.klaus31.music.example;

import static com.github.klaus31.command.Sleep.HALF_BEAT;

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
		int note = 55;
		while (note++ < 65) {
			songlines.add(new Play(note));
			songlines.add(HALF_BEAT);
		}
		return songlines;
	}

	@Override
	public Sleep getTotalBeats() {
		return new Sleep(5);
	}

}
