package com.github.klaus31.music.command;

public class Play implements Command {

	private String note;

	public Play(int note) {
		this(note + "");
	}

	public Play(String note) {
		this.note = note;
	}

	@Override
	public String getSongLine() {
		return String.format("play %s", note);
	}

}
