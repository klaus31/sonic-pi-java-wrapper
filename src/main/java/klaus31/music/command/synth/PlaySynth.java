package klaus31.music.command.synth;

import klaus31.music.Songline;
import klaus31.music.command.Command;
import klaus31.music.command.params.ParamsCtrlCommon;
import klaus31.music.command.params.PlayParamsCtrl;

public class PlaySynth implements Command {

	private String note;
	private ParamsCtrlCommon ctrl;
	private PredefinedSynth synth;

	public PlaySynth(final int note) {
		this(note + "");
	}

	public PlaySynth(final String note) {
		this(note, PlayParamsCtrl.createDefault());
	}

	public PlaySynth(final String note, final ParamsCtrlCommon ctrl) {
		this(note, ctrl, PredefinedSynth.DEFAULT);

	}

	public PlaySynth(final String note, final ParamsCtrlCommon ctrl, final PredefinedSynth synth) {
		this.note = note;
		this.ctrl = ctrl;
		this.synth = synth;
	}

	public ParamsCtrlCommon getCtrl() {
		return ctrl;
	}

	@Override
	public Songline createSongline() {
		return Songline.create(String.format("use_synth %s%nplay %s%s", synth.getName(), note, ctrl.toApplyString()));
	}

	public PlaySynth setCtrl(final ParamsCtrlCommon ctrl) {
		this.ctrl = ctrl;
		return this;
	}

	public PlaySynth setNote(final int note) {
		return setNote(note + "");
	}

	public PlaySynth setNote(final String note) {
		this.note = note;
		return this;
	}

	public PlaySynth setSynth(final PredefinedSynth synth) {
		this.synth = synth;
		return this;
	}

}
