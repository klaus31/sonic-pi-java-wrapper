package com.github.klaus31.command;

import com.github.klaus31.music.Songline;

public class UseBpm implements Command {

	private final int number;

	public UseBpm(final int number) {
		this.number = number;
	}

	@Override
	public Songline getSongline() {
		return Songline.create(String.format("use_bpm %d", number));
	}
}