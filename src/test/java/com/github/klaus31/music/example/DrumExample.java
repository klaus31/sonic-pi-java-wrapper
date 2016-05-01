package com.github.klaus31.music.example;

import static com.github.klaus31.command.Sleep.HALF_BEAT;
import static com.github.klaus31.command.Sleep.QUARTER_BEAT;

import java.util.ArrayList;
import java.util.List;

import com.github.klaus31.command.Command;
import com.github.klaus31.command.Sample;
import com.github.klaus31.command.Sleep;
import com.github.klaus31.music.Songline;
import com.github.klaus31.theme.Theme;

public class DrumExample implements Theme {

	@Override
	public List<Songline> getSonglines() {
		final List<Songline> drums = new ArrayList<>();
		final Command bass = new Sample("drum_bass_soft");
		final Command snare = new Sample("drum_snare_soft");
		final Command cymbal = new Sample("drum_cymbal_closed");
		final Sample cowbell = new Sample("drum_cowbell");
		cowbell.getCtrl().changeAmp(0.2);
		int i = 10;
		while (i-- > 0) {
			drums.add(bass.getSongline());
			drums.add(cymbal.getSongline());
			drums.add(HALF_BEAT.getSongline());
			drums.add(cymbal.getSongline());
			drums.add(HALF_BEAT.getSongline());
			drums.add(snare.getSongline());
			drums.add(cymbal.getSongline());
			drums.add(HALF_BEAT.getSongline());
			drums.add(cymbal.getSongline());
			drums.add(QUARTER_BEAT.getSongline());
			if (i % 3 == 0) {
				drums.add(cowbell.getSongline());
				cowbell.getCtrl().changeAmp(2);
			}
			drums.add(QUARTER_BEAT.getSongline());
		}
		return drums;
	}

	@Override
	public Sleep getTotalBeats() {
		return new Sleep(20);
	}

}
