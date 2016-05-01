package com.github.klaus31.music.demo;

import static com.github.klaus31.command.Sleep.HALF_BEAT;

import com.github.klaus31.command.Play;
import com.github.klaus31.command.Sleep;
import com.github.klaus31.command.params.Pan;
import com.github.klaus31.music.SonglineList;
import com.github.klaus31.theme.Theme;

public class MelodyB implements Theme {

	@Override
	public SonglineList getSonglines() {
		final SonglineList songlines = new SonglineList();
		int note = 55;
		final Play play = new Play(note);
		play.getCtrl().setPan(Pan.LEFT_ALMOST);
		while (note++ < 65) {
			songlines.add(play);
			songlines.add(HALF_BEAT);
			play.setNote(note).getCtrl().togglePan();
		}
		return songlines;
	}

	@Override
	public Sleep getTotalBeats() {
		return new Sleep(5);
	}

}
