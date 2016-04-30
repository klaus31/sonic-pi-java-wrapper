package com.github.klaus31.music.example;

import java.util.List;

import com.github.klaus31.music.command.Command;
import com.github.klaus31.music.theme.Theme;

public class ThemeA implements Theme {

	private final DrumTheme drum = new DrumExample();

	@Override
	public List<Command> getSonglines() {
		return drum.getSonglines();
	}

}
