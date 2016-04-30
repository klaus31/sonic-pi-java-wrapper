package com.github.klaus31.theme;

import java.util.ArrayList;
import java.util.List;

import com.github.klaus31.command.Command;

public class ThemeThreaded implements Theme {

	private final Theme theme;

	public ThemeThreaded(final Theme theme) {
		this.theme = theme;
	}

	@Override
	public List<Command> getSonglines() {
		final List<Command> songlines = new ArrayList<>();
		songlines.add(() -> "in_thread do");
		songlines.addAll(theme.getSonglines());
		songlines.add(() -> "end");
		return songlines;
	}
}
