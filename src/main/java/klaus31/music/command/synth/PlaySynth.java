package klaus31.music.command.synth;

import klaus31.music.command.Command;
import klaus31.music.command.params.PlayParams;

public class PlaySynth implements Command {

	private final PlayParams ctrl;
	private final String note;
	private final PredefinedSynth synth;

	public PlaySynth(final int note) {
		this(note + "");
	}

	public PlaySynth(final String note) {
		this(note, PlayParams.createDefault());
	}

	public PlaySynth(final String note, final PlayParams ctrl) {
		this(note, ctrl, PredefinedSynth.DEFAULT);
	}

	public PlaySynth(final String note, final PlayParams ctrl, final PredefinedSynth synth) {
		this.note = note;
		this.ctrl = ctrl;
		this.synth = synth;
	}

	public PlaySynth createCopyWithChangedAmp(final double factor) {
		return new PlaySynth(note, ctrl.createWithChangedAmp(factor), synth);
	}

	@Override
	public String format() {
		return String.format("use_synth %s%nplay %s%s", synth.getName(), note, ctrl.toApplyString());
	}

}
