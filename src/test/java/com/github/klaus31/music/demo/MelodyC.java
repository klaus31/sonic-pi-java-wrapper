package com.github.klaus31.music.demo;

import com.github.klaus31.command.PlayNoteFactory;
import com.github.klaus31.command.Sleep;
import com.github.klaus31.command.params.Amp;
import com.github.klaus31.command.params.Pan;
import com.github.klaus31.command.params.PlayParamsCtrl;
import com.github.klaus31.music.SonglineList;
import com.github.klaus31.theme.Theme;

public class MelodyC implements Theme {

	final SonglineList songlines = new SonglineList();

	@Override
	public SonglineList getSonglines() {
		final PlayParamsCtrl ctrlBassline = new PlayParamsCtrl();
		ctrlBassline.setPan(Pan.LEFT_HALF);
		final PlayParamsCtrl ctrlUpperline = new PlayParamsCtrl();
		ctrlUpperline.setPan(Pan.RIGHT_HALF).setAmp(Amp.QUIET);
		final PlayNoteFactory bassline = new PlayNoteFactory("G2", "major", ctrlBassline);
		final PlayNoteFactory upperline = new PlayNoteFactory("G5", "major", ctrlUpperline);
		songlines.add(bassline.createPlayChord(0));
		songlines.add(upperline.createPlay(0));
		songlines.add(Sleep.QUARTER_BEAT);
		songlines.add(upperline.createPlay(0));
		songlines.add(Sleep.QUARTER_BEAT);
		songlines.add(upperline.createPlay(3));
		songlines.add(Sleep.HALF_BEAT);
		songlines.add(bassline.createPlayChord(1));
		songlines.add(upperline.createPlay(1));
		songlines.add(Sleep.QUARTER_BEAT);
		songlines.add(upperline.createPlay(1));
		songlines.add(Sleep.QUARTER_BEAT);
		songlines.add(upperline.createPlay(4));
		songlines.add(Sleep.HALF_BEAT);
		songlines.add(upperline.createPlay(7));
		songlines.add(Sleep.QUARTER_BEAT);
		songlines.add(upperline.createPlay(6));
		songlines.add(Sleep.QUARTER_BEAT);
		songlines.add(upperline.createPlay(3));
		songlines.add(Sleep.QUARTER_BEAT);
		songlines.add(bassline.createPlayChord(4));
		songlines.add(upperline.createPlay(4));
		songlines.add(Sleep.QUARTER_BEAT);
		songlines.add(upperline.createPlay(6));
		songlines.add(Sleep.HALF_BEAT);
		songlines.add(bassline.createPlayChord(4));
		songlines.add(upperline.createPlay(4));
		songlines.add(Sleep.QUARTER_BEAT);
		songlines.add(upperline.createPlay(2));
		songlines.add(Sleep.ONE_BEAT);
		songlines.add(bassline.createPlayChord(0));
		songlines.add(upperline.createPlayChord(0));
		songlines.add(Sleep.ONE_BEAT);
		songlines.add(upperline.createPlay(0));
		songlines.add(Sleep.ONE_BEAT);
		songlines.add(upperline.createPlay(3));
		songlines.add(Sleep.HALF_BEAT);
		songlines.add(Sleep.QUARTER_BEAT);
		songlines.add(bassline.createPlayChord(2));
		songlines.add(upperline.createPlay(2));
		songlines.add(Sleep.HALF_BEAT);
		songlines.add(upperline.createPlay(1));
		songlines.add(Sleep.TWO_BEATS);
		songlines.add(bassline.createPlayChord(0));
		return songlines;
	}

	@Override
	public Sleep getTotalBeats() {
		return songlines.getTotalBeats();
	}

}
