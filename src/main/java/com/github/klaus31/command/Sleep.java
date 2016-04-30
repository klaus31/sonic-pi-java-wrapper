package com.github.klaus31.command;

public class Sleep implements Command {

	private final double beats;

	public Sleep(final double beats) {
		this.beats = beats;
	}

	@Override
	public String getSongLine() {
		return String.format("sleep %s", beats);
	}

	public Sleep half() {
		return new Sleep(beats / 2);
	}

}
