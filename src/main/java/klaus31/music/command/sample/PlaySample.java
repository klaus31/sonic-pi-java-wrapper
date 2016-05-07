package klaus31.music.command.sample;

import klaus31.music.command.Command;
import klaus31.music.command.params.SampleParamsCtrl;
import klaus31.music.theme.Songline;

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
	public Songline createSongline() {
		return Songline.create("sample " + sample.getName() + ctrl.toApplyString());
	}

}
