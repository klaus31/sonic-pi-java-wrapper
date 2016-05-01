package com.github.klaus31.music;

import java.util.ArrayList;

import com.github.klaus31.command.Command;
import com.github.klaus31.command.Sleep;
import com.github.klaus31.theme.Theme;
import com.github.klaus31.theme.ThemeThreaded;

public class SonglineList extends ArrayList<Songline> {
	private static final long serialVersionUID = 1L;

	private double totalBeats = 0;

	public void add(final Command command) {
		add(command.getSongline());
	}

	public void add(final Sleep sleep) {
		totalBeats += sleep.getBeats();
		add(sleep.getSongline());
	}

	public void add(final Theme theme) {
		addAll(theme.getSonglines());
		add(theme.getTotalBeats());
	}

	public void add(final ThemeThreaded themeThreaded) {
		addAll(themeThreaded.getSonglines());
	}

	/**
	 * @return the total duration of all songlines, where the sum of all beats
	 *         are used from all {@link #add(Sleep)} calls. if you are not using
	 *         this method for all your sleeps in the songlines, the result is
	 *         incorrect!
	 */
	public Sleep getTotalBeats() {
		return new Sleep(totalBeats);
	}
}
