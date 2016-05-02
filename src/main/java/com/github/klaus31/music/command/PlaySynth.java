package com.github.klaus31.music.command;

import com.github.klaus31.music.Songline;
import com.github.klaus31.music.Synth;
import com.github.klaus31.music.command.params.ParamsCtrlCommon;
import com.github.klaus31.music.command.params.PlayParamsCtrl;

public class PlaySynth implements Command {

	private String note;
	private ParamsCtrlCommon ctrl;
	private Synth synth;

	public PlaySynth(final int note) {
		this(note + "");
	}

	public PlaySynth(final String note) {
		this(note, PlayParamsCtrl.createDefault());
	}

	public PlaySynth(final String note, final ParamsCtrlCommon ctrl) {
		this(note, ctrl, Synth.DEFAULT);

	}

	public PlaySynth(final String note, final ParamsCtrlCommon ctrl, final Synth synth) {
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

	public PlaySynth setSynth(final Synth synth) {
		this.synth = synth;
		return this;
	}

}
