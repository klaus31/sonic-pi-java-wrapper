package com.github.klaus31.music.command;

import com.github.klaus31.music.Songline;
import com.github.klaus31.music.Synth;
import com.github.klaus31.music.command.params.ParamsCtrlCommon;
import com.github.klaus31.music.command.params.PlayParamsCtrl;

public class Play implements Command {

	private String note;
	private ParamsCtrlCommon ctrl;
	private Synth synth;

	public Play(final int note) {
		this(note + "");
	}

	public Play(final String note) {
		this(note, PlayParamsCtrl.createDefault());
	}

	public Play(final String note, final ParamsCtrlCommon ctrl) {
		this(note, ctrl, Synth.DEFAULT);

	}

	public Play(final String note, final ParamsCtrlCommon ctrl, final Synth synth) {
		this.note = note;
		this.ctrl = ctrl;
		this.synth = synth;
	}

	public ParamsCtrlCommon getCtrl() {
		return ctrl;
	}

	@Override
	public Songline getSongline() {
		return Songline.create(String.format("use_synth %s%nplay %s%s", synth.getName(), note, ctrl.toApplyString()));
	}

	public Play setCtrl(final ParamsCtrlCommon ctrl) {
		this.ctrl = ctrl;
		return this;
	}

	public Play setNote(final int note) {
		return setNote(note + "");
	}

	public Play setNote(final String note) {
		this.note = note;
		return this;
	}

	public Play setSynth(final Synth synth) {
		this.synth = synth;
		return this;
	}

}
