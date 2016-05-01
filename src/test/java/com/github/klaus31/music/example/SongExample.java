package com.github.klaus31.music.example;

import java.util.ArrayList;
import java.util.List;

import com.github.klaus31.command.UseBpm;
import com.github.klaus31.music.Songline;
import com.github.klaus31.theme.Song;
import com.github.klaus31.theme.Theme;

public class SongExample implements Song {

	Theme themeA = new ThemeA();
	Theme themeB = new ThemeB();

	@Override
	public UseBpm getBpmCommand() {
		return new UseBpm(80);
	}

	@Override
	public List<Songline> getSonglines() {
		final List<Songline> songlines = new ArrayList<>();
		songlines.addAll(themeA.getSonglines());
		songlines.add(themeA.getTotalBeats().getSongline());
		songlines.addAll(themeB.getSonglines());
		songlines.add(themeB.getTotalBeats().getSongline());
		songlines.addAll(themeA.getSonglines());
		return songlines;
	}

}
