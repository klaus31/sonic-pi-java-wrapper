package com.github.klaus31.music.command;

import static com.github.klaus31.music.util.Rubyalizer.colonize;

import com.github.klaus31.music.command.params.PlayParamsCtrl;

public class PlayNoteFactory {
	private final String tonic, name;
	private final PlayParamsCtrl ctrl;

	public PlayNoteFactory(final String tonic, final String name, final PlayParamsCtrl ctrl) {
		this.tonic = colonize(tonic);
		this.name = colonize(name);
		this.ctrl = ctrl;
	}

	public Play createPlay(final int number) {
		return new Play(String.format("scale(%s, %s)[%d]", tonic, name, number % 9), ctrl);
	}

	public Play createPlayChord(final int number) {
		return createPlayChord(number, name);
	}

	public Play createPlayChord(final int number, final String name) {
		return new Play(String.format("chord(scale(%s, %s)[%d], %s)", tonic, name, number % 9, colonize(name)), ctrl);
	}

}
