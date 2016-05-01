package com.github.klaus31.command;

import com.github.klaus31.command.params.SampleParamsCtrl;
import com.github.klaus31.music.Songline;

public class Sample implements Command {

	private final String name;
	private final SampleParamsCtrl ctrl;

	public Sample(final String name) {
		this(name, SampleParamsCtrl.createDefault());
	}

	public Sample(final String name, final SampleParamsCtrl ctrl) {
		this.name = name.matches("^:.+") ? name : ":" + name;
		this.ctrl = ctrl;
	}

	public SampleParamsCtrl getCtrl() {
		return ctrl;
	}

	@Override
	public Songline getSongline() {
		return Songline.create("sample " + name + ctrl.toApplyString());
	}

}
