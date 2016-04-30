package com.github.klaus31.music.command;

import com.github.klaus31.music.Sample;

public class DrumSample implements Sample {

	public final String name;

	public DrumSample(final String name) {
		this.name = name.matches("^:drum_.+") ? name : ":drum_" + name;
	}

	@Override
	public String getSongLine() {
		return "sample " + name;
	}

}
