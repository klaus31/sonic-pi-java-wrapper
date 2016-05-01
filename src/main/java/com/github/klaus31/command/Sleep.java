package com.github.klaus31.command;

import com.github.klaus31.music.Songline;

public class Sleep implements Command {

	public static final Sleep QUARTER_BEAT = new Sleep(1D / 4D);
	public static final Sleep HALF_BEAT = new Sleep(1D / 2D);
	public static final Sleep ONE_BEAT = new Sleep(1);
	public static final Sleep TWO_BEATS = new Sleep(2);
	public static final Sleep THREE_BEATS = new Sleep(3);
	public static final Sleep FOUR_BEATS = new Sleep(4);
	private final double beats;

	public Sleep(final double beats) {
		this.beats = beats;
	}

	public double getBeats() {
		return beats;
	}

	@Override
	public Songline getSongline() {
		return Songline.create(String.format("sleep %s", beats));
	}

}
