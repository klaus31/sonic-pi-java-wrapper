package com.github.klaus31.music.example;

import static com.github.klaus31.command.Sleep.ONE_BEAT;
import static com.github.klaus31.command.Sleep.TWO_BEATS;

import java.util.ArrayList;
import java.util.List;

import com.github.klaus31.command.Command;
import com.github.klaus31.command.SampleDefault;
import com.github.klaus31.theme.Theme;

public class MelodyExample implements Theme {

	@Override
	public List<Command> getSonglines() {
		final List<Command> songlines = new ArrayList<>();
		songlines.add(new SampleDefault(":ambi_piano"));
		songlines.add(ONE_BEAT);
		songlines.add(new SampleDefault(":ambi_swoosh"));
		songlines.add(TWO_BEATS);
		songlines.add(new SampleDefault(":ambi_piano"));
		songlines.add(ONE_BEAT);
		songlines.add(new SampleDefault(":ambi_swoosh"));
		songlines.add(TWO_BEATS);
		return songlines;
	}

}
