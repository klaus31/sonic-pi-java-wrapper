package com.github.klaus31.command;

import static com.github.klaus31.command.Rubyalizer.colonize;

public class PlayNoteFactory {
	private final String tonic, name;

	public PlayNoteFactory(final String tonic, final String name) {
		this.tonic = colonize(tonic);
		this.name = colonize(name);
	}

	public Play createPlay() {
		return new Play(String.format("scale(%s, %s)", tonic, name));
	}

	public Play createPlay(final int number) {
		return new Play(String.format("scale(%s, %s)[%d]", tonic, name, number % 9));
	}

}
