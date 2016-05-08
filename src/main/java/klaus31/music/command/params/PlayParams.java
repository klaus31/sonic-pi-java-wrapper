package klaus31.music.command.params;

public class PlayParams extends UniversalParams {

	public static PlayParams createDefault() {
		return new PlayParams(Amp.DEFAULT, Pan.DEFAULT);
	}

	private final Amp amp;
	private final Pan pan;

	public PlayParams(final Amp amp, final Pan pan) {
		this.amp = amp;
		this.pan = pan;
	}

	public PlayParams createWithChangedAmp(final double factor) {
		return new PlayParams(amp.createChanged(factor), pan);
	}

	public PlayParams createWithChangedPan(final Pan newPan) {
		return new PlayParams(amp, newPan);
	}

	public PlayParams createWithToggledPan() {
		return new PlayParams(amp, this.pan.createToggled());
	}

	@Override
	public String toApplyString() {
		return super.toApplyString() + amp.toApplyString() + pan.toApplyString();
	}

}
