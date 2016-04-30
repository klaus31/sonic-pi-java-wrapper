package com.github.klaus31.command;

public class UseBpm implements Command {

	private final int number;

	public UseBpm(final int number) {
		this.number = number;
	}

	@Override
	public String getSongLine() {
		return String.format("use_bpm %d", number);
	}
}