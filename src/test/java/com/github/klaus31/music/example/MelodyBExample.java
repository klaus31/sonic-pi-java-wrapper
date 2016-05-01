package com.github.klaus31.music.example;

import static com.github.klaus31.command.Sleep.HALF_BEAT;

import java.util.ArrayList;
import java.util.List;

import com.github.klaus31.command.Play;
import com.github.klaus31.command.Sleep;
import com.github.klaus31.command.params.Pan;
import com.github.klaus31.music.Songline;
import com.github.klaus31.theme.Theme;

public class MelodyBExample implements Theme {

	@Override
	public List<Songline> getSonglines() {
		final List<Songline> songlines = new ArrayList<>();
		int note = 55;
		final Play play = new Play(note);
		play.getCtrl().setPan(Pan.LEFT);
		while (note++ < 65) {
			songlines.add(play.getSongline());
			songlines.add(HALF_BEAT.getSongline());
			play.getCtrl().togglePan();
			play.setNote(note);
		}
		return songlines;
	}

	@Override
	public Sleep getTotalBeats() {
		return new Sleep(5);
	}

}
