package com.github.klaus31.music.demo;

import static com.github.klaus31.music.Synth.DULL_BELL;
import static com.github.klaus31.music.Synth.FM;
import static com.github.klaus31.music.command.Sleep.HALF_BEAT;

import com.github.klaus31.music.SonglineList;
import com.github.klaus31.music.command.Play;
import com.github.klaus31.music.command.Sleep;
import com.github.klaus31.music.command.params.Pan;
import com.github.klaus31.music.theme.Theme;

public class MelodyB implements Theme {

	@Override
	public SonglineList getSonglines() {
		final SonglineList songlines = new SonglineList();
		int note = 55;
		final Play play = new Play(note);
		play.getCtrl().setPan(Pan.LEFT_ALMOST);
		while (note++ < 65) {
			songlines.add(play.setSynth(note % 2 == 0 ? DULL_BELL : FM));
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
