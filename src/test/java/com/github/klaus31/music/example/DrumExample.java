package com.github.klaus31.music.example;

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
		final Sleep sleep = new Sleep(0.2); // TODO woher kommen die?!
		int i = 20; // woher kommen die
		while (i-- > 0) {
			drums.add(bass);
			drums.add(cymbal);
			drums.add(sleep);
			drums.add(cymbal);
			drums.add(sleep);
			drums.add(snare);
			drums.add(cymbal);
			drums.add(sleep);
			drums.add(cymbal);
			drums.add(sleep.half());
			drums.add(cowbell);
			drums.add(sleep.half());
		}
		return drums;
	}

}
