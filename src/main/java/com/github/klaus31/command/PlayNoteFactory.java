package com.github.klaus31.command;

import static com.github.klaus31.command.Rubyalizer.colonize;

import com.github.klaus31.command.params.PlayParamsCtrl;

public class PlayNoteFactory {
	private final String tonic, name;
	private final PlayParamsCtrl ctrl;

	public PlayNoteFactory(final String tonic, final String name, final PlayParamsCtrl ctrl) {
		this.tonic = colonize(tonic);
		this.name = colonize(name);
		this.ctrl = ctrl;
	}

	public Play createPlay() {
		return new Play(String.format("scale(%s, %s)", tonic, name), ctrl);
	}

	public Play createPlay(final int number) {
		return new Play(String.format("scale(%s, %s)[%d]", tonic, name, number % 9), ctrl);
	}

}
