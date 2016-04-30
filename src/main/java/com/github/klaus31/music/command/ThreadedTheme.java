package com.github.klaus31.music.command;

import java.util.ArrayList;
import java.util.List;

import com.github.klaus31.music.theme.Theme;

public class ThreadedTheme implements Theme {

	private final Theme theme;

	public ThreadedTheme(final Theme theme) {
		this.theme = theme;
	}

	@Override
	public List<Command> getSonglines() {
		final List<Command> songlines = new ArrayList<>();
		songlines.add(Command.IN_THREAD_DO);
		songlines.addAll(theme.getSonglines());
		songlines.add(Command.END);
		return songlines;
	}
}
