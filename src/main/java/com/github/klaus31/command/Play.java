package com.github.klaus31.command;

import com.github.klaus31.command.params.Amp;

public class Play implements Command {

	private final String note;
	private final Amp amp;

	public Play(final int note) {
		this(note + "", Amp.DEFAULT);
	}

	public Play(final String note, final Amp amp) {
		this.note = note;
		this.amp = amp;
	}

	@Override
	public String getSongLine() {
		return String.format("play %s", note) + amp.toApplyString();
	}

}
