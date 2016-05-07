package klaus31.music.command.sample;

import klaus31.music.command.Command;
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

	@Override
	public String format() {
		return "sample " + sample.getName() + ctrl.toApplyString();
	}

	public SampleParamsCtrl getCtrl() {
		return ctrl;
	}

	public Sample getSample() {
		return sample;
	}

	public void mute() {
		getCtrl().mute();

	}

	public void setSample(final Sample sample) {
		this.sample = sample;
	}
}
