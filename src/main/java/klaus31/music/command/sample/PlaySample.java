package klaus31.music.command.sample;

import klaus31.music.command.Command;
import klaus31.music.command.params.Pan;
import klaus31.music.command.params.ParamsCtrl;

public class PlaySample implements Command {

	private final ParamsCtrl ctrl;
	private final Sample sample;

	public PlaySample(final Sample sample) {
		this(sample, ParamsCtrl.createDefault());
	}

	public PlaySample(final Sample sample, final ParamsCtrl ctrl) {
		this.sample = sample;
		this.ctrl = ctrl;
	}

	public PlaySample createCopy(final Pan newPan) {
		return new PlaySample(sample, ctrl.createWithChangedPan(newPan));
	}

	public PlaySample createCopyWithChangedAmp(final double factor) {
		return new PlaySample(sample, ctrl.createWithChangedAmp(factor));
	}

	public PlaySample createCopyWithSample(final Sample sample) {
		return new PlaySample(sample, ctrl);
	}

	@Override
	public String format() {
		return "sample " + sample.getName() + ctrl.toApplyString();
	}

	public Sample getSample() {
		return sample;
	}
}
