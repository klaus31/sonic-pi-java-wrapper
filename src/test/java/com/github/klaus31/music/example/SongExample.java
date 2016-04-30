package com.github.klaus31.music.example;

import java.util.ArrayList;
import java.util.List;

import com.github.klaus31.music.command.Command;
import com.github.klaus31.music.command.ThreadedTheme;
import com.github.klaus31.music.theme.Song;
import com.github.klaus31.music.theme.Theme;

public class SongExample implements Song {

	Theme themeA = new ThemeA();
	Theme themeB = new ThemeB();

	@Override
	public List<Command> getSonglines() {
		final List<Command> songlines = new ArrayList<>();
		songlines.addAll(new ThreadedTheme(themeA).getSonglines());
		songlines.addAll(new ThreadedTheme(themeB).getSonglines());
		return songlines;
	}
}
