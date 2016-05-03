package klaus31.music.command.synth;

import static klaus31.music.Rubyalizer.colonize;

import klaus31.music.command.params.PlayParamsCtrl;

public class PlayNoteFactory {
	private final String tonic, name;
	private final PlayParamsCtrl ctrl;

	public PlayNoteFactory(final String tonic, final String name, final PlayParamsCtrl ctrl) {
		this.tonic = colonize(tonic);
		this.name = colonize(name);
		this.ctrl = ctrl;
	}

	public PlaySynth createPlay(final int number) {
		return new PlaySynth(String.format("scale(%s, %s)[%d]", tonic, name, number % 9), ctrl);
	}

	public PlaySynth createPlayChord(final int number) {
		return createPlayChord(number, name);
	}

	public PlaySynth createPlayChord(final int number, final String name) {
		return new PlaySynth(String.format("chord(scale(%s, %s)[%d], %s)", tonic, name, number % 9, colonize(name)), ctrl);
	}

}
