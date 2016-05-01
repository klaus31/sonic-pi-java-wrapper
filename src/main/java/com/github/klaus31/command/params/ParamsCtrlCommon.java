package com.github.klaus31.command.params;

public class ParamsCtrlCommon {

	private Amp amp = Amp.DEFAULT;
	private Pan pan = Pan.DEFAULT;

	public ParamsCtrlCommon changeAmp(final double factor) {
		this.amp = amp.createChanged(factor);
		return this;
	}

	public ParamsCtrlCommon setPan(final Pan newPan) {
		this.pan = newPan;
		return this;
	}

	public String toApplyString() {
		return amp.toApplyString() + pan.toApplyString();
	}

	public ParamsCtrlCommon togglePan() {
		this.pan = this.pan.createToggled();
		return this;
	}

}
