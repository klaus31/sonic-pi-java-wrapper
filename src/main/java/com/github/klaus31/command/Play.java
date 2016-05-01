package com.github.klaus31.command;

import com.github.klaus31.command.params.ParamsCtrlCommon;
import com.github.klaus31.command.params.PlayParamsCtrl;
import com.github.klaus31.music.Songline;

public class Play implements Command {

	private String note;
	private final ParamsCtrlCommon ctrl;

	public Play(final int note) {
		this(note + "");
	}

	public Play(final String note) {
		this(note, PlayParamsCtrl.createDefault());
	}

	public Play(final String note, final ParamsCtrlCommon ctrl) {
		this.note = note;
		this.ctrl = ctrl;
	}

	public ParamsCtrlCommon getCtrl() {
		return ctrl;
	}

	@Override
	public Songline getSongline() {
		return Songline.create("play " + note + ctrl.toApplyString());
	}

	public void setNote(final int note) {
		setNote(note + "");
	}

	public void setNote(final String note) {
		this.note = note;
	}

}
