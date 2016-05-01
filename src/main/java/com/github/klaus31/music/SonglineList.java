package com.github.klaus31.music;

import java.util.ArrayList;

import com.github.klaus31.command.Command;
import com.github.klaus31.theme.Theme;
import com.github.klaus31.theme.ThemeThreaded;

public class SonglineList extends ArrayList<Songline> {
	private static final long serialVersionUID = 1L;

	public void add(final Command command) {
		add(command.getSongline());
	}

	public void add(final Theme theme) {
		addAll(theme.getSonglines());
		add(theme.getTotalBeats());
	}

	public void add(final ThemeThreaded themeThreaded) {
		addAll(themeThreaded.getSonglines());
	}
}
