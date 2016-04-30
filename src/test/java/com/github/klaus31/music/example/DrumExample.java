package com.github.klaus31.music.example;

import static com.github.klaus31.command.Sleep.HALF_BEAT;
import static com.github.klaus31.command.Sleep.QUARTER_BEAT;

import java.util.ArrayList;
import java.util.List;

import com.github.klaus31.command.Command;
import com.github.klaus31.command.SampleDrum;
import com.github.klaus31.command.Sleep;
import com.github.klaus31.theme.Theme;

public class DrumExample implements Theme {

	@Override
	public List<Command> getSonglines() {
		final List<Command> drums = new ArrayList<>();
		final Command bass = new SampleDrum("bass_soft");
		final Command snare = new SampleDrum("snare_soft");
		final Command cymbal = new SampleDrum(":drum_cymbal_closed");
		final Command cowbell = new SampleDrum("drum_cowbell");
		int i = 10;
		while (i-- > 0) {
			drums.add(bass);
			drums.add(cymbal);
			drums.add(HALF_BEAT);
			drums.add(cymbal);
			drums.add(HALF_BEAT);
			drums.add(snare);
			drums.add(cymbal);
			drums.add(HALF_BEAT);
			drums.add(cymbal);
			drums.add(QUARTER_BEAT);
			drums.add(cowbell);
			drums.add(QUARTER_BEAT);
		}
		return drums;
	}

	@Override
	public Sleep getTotalBeats() {
		return new Sleep(20);
	}

}
