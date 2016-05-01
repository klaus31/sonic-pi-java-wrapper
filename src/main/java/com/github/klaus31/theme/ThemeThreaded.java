package com.github.klaus31.theme;

import java.util.ArrayList;
import java.util.List;

import com.github.klaus31.command.Sleep;
import com.github.klaus31.music.Songline;

public class ThemeThreaded implements Theme {

	private final Theme theme;

	public ThemeThreaded(final Theme theme) {
		this.theme = theme;
	}

	@Override
	public List<Songline> getSonglines() {
		final List<Songline> songlines = new ArrayList<>();
		songlines.add(Songline.create("in_thread do"));
		songlines.addAll(theme.getSonglines());
		songlines.add(Songline.create("end"));
		return songlines;
	}

	@Override
	public Sleep getTotalBeats() {
		return theme.getTotalBeats();
	}
}
