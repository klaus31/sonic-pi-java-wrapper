package com.github.klaus31.command.params;

public class ParamsCtrlCommon {

	private Amp amp = Amp.DEFAULT;
	private Pan pan = Pan.DEFAULT;

	public void changeAmp(final double factor) {
		this.amp = amp.createChanged(factor);
	}

	public void setPan(final Pan newPan) {
		this.pan = newPan;
	}

	public String toApplyString() {
		return amp.toApplyString() + pan.toApplyString();
	}

	public void togglePan() {
		this.pan = this.pan.createToggled();
	}

}
