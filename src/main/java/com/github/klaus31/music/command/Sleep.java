package com.github.klaus31.music.command;

public class Sleep implements Command {

	private double beats;

	public Sleep(double beats) {
		this.beats = beats;
	}

	@Override
	public String getSongLine() {
		return String.format("sleep %s", beats);
	}

}
