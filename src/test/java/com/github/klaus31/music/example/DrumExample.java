package com.github.klaus31.music.example;

import java.util.ArrayList;
import java.util.List;

import com.github.klaus31.music.command.Command;
import com.github.klaus31.music.command.DrumSample;
import com.github.klaus31.music.command.Sleep;

public class DrumExample implements DrumTheme {

	@Override
	public List<Command> getSonglines() {
		final List<Command> drums = new ArrayList<>();
		final Command bass = new DrumSample("bass_soft");
		final Command snare = new DrumSample("snare_soft");
		final Command cymbal = new DrumSample(":drum_cymbal_closed");
		final Command cowbell = new DrumSample("drum_cowbell");
		final Command sleep = new Sleep(0.2); // TODO woher kommen die?!
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
			drums.add(sleep);
		}
		return drums;
	}

}
