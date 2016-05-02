package com.github.klaus31.music.command;

import static com.github.klaus31.music.util.Rubyalizer.colonize;

import com.github.klaus31.music.Songline;
import com.github.klaus31.music.command.params.SampleParamsCtrl;

public class Sample implements Command {

	private final String name;
	private final SampleParamsCtrl ctrl;

	public Sample(final String name) {
		this(name, SampleParamsCtrl.createDefault());
	}

	public Sample(final String name, final SampleParamsCtrl ctrl) {
		this.name = colonize(name);
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
