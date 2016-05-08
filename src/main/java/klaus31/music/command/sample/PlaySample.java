package klaus31.music.command.sample;

import klaus31.music.command.Command;
import klaus31.music.command.params.Pan;
import klaus31.music.command.params.SampleParamsCtrl;

public class PlaySample implements Command {

	private final SampleParamsCtrl ctrl;
	private Sample sample;

	public PlaySample(final Sample sample) {
		this(sample, SampleParamsCtrl.createDefault());
	}

	public PlaySample(final Sample sample, final SampleParamsCtrl ctrl) {
		this.sample = sample;
		this.ctrl = ctrl;
	}

	public PlaySample changeAmp(final double factor) {
		ctrl.changeAmp(factor);
		return this;
	}

	@Override
	public String format() {
		return "sample " + sample.getName() + ctrl.toApplyString();
	}

	public Sample getSample() {
		return sample;
	}

	public PlaySample mute() {
		ctrl.mute();
		return this;
	}

	public PlaySample setPan(final Pan newPan) {
		ctrl.setPan(newPan);
		return this;
	}

	public PlaySample setSample(final Sample sample) {
		this.sample = sample;
		return this;
	}
}
