package com.github.klaus31.theme;

import com.github.klaus31.command.Sleep;
import com.github.klaus31.music.Songline;
import com.github.klaus31.music.SonglineList;

public class ThemeThreaded implements Theme {

	private final Theme theme;

	public ThemeThreaded(final Theme theme) {
		this.theme = theme;
	}

	@Override
	public SonglineList getSonglines() {
		final SonglineList songlines = new SonglineList();
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
