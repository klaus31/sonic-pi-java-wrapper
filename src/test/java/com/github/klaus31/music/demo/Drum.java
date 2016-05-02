package com.github.klaus31.music.demo;

import static com.github.klaus31.music.command.Sleep.HALF_BEAT;
import static com.github.klaus31.music.command.Sleep.QUARTER_BEAT;

import com.github.klaus31.music.Sample;
import com.github.klaus31.music.SonglineList;
import com.github.klaus31.music.command.Command;
import com.github.klaus31.music.command.PlaySample;
import com.github.klaus31.music.command.Sleep;
import com.github.klaus31.music.theme.Theme;

public class Drum implements Theme {

	@Override
	public SonglineList getSonglines() {
		final SonglineList drums = new SonglineList();
		final Command bass = new PlaySample(Sample.DRUM_BASS_SOFT);
		final PlaySample snare = new PlaySample(Sample.DRUM_SNARE_SOFT);
		snare.getCtrl().changeAmp(2);
		final Command cymbal = new PlaySample(Sample.DRUM_CYMBAL_CLOSED);
		final PlaySample cowbell = new PlaySample(Sample.DRUM_COWBELL);
		cowbell.getCtrl().changeAmp(0.2);
		int i = 0;
		while (i++ < 10) {
			drums.add(bass);
			drums.add(cymbal);
			drums.add(HALF_BEAT);
			drums.add(cymbal);
			drums.add(HALF_BEAT);
			if (i != 4 && i != 9) {
				drums.add(snare);
			}
			drums.add(cymbal);
			drums.add(HALF_BEAT);
			drums.add(cymbal);
			if (i % 3 == 0) {
				drums.add(QUARTER_BEAT);
				drums.add(cowbell);
				cowbell.getCtrl().changeAmp(2);
				drums.add(QUARTER_BEAT);
			} else {
				drums.add(HALF_BEAT);
			}
		}
		return drums;
	}

	@Override
	public Sleep getTotalBeats() {
		return new Sleep(20);
	}

}