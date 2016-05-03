package com.github.klaus31.music.command;

import com.github.klaus31.music.Songline;
import com.github.klaus31.music.command.params.SampleParamsCtrl;
import com.github.klaus31.music.sample.Sample;

public class PlaySample implements Command {

	private final Sample sample;
	private final SampleParamsCtrl ctrl;

	public PlaySample(final Sample sample) {
		this(sample, SampleParamsCtrl.createDefault());
	}

	public PlaySample(final Sample sample, final SampleParamsCtrl ctrl) {
		this.sample = sample;
		this.ctrl = ctrl;
	}

	public SampleParamsCtrl getCtrl() {
		return ctrl;
	}

	@Override
	public Songline getSongline() {
		return Songline.create("sample " + sample.getName() + ctrl.toApplyString());
	}

}
