package klaus31.music.instruments;

import klaus31.music.command.sample.PlaySample;
import klaus31.music.command.sample.PredefinedSample;

public class DrumkitSoft implements Drumkit {

	@Override
	public PlaySample getBass() {
		return new PlaySample(PredefinedSample.DRUM_BASS_SOFT);
	}

	@Override
	public PlaySample getCymbal() {
		return new PlaySample(PredefinedSample.DRUM_CYMBAL_SOFT);
	}

	@Override
	public PlaySample getCymbalOpen() {
		return new PlaySample(PredefinedSample.DRUM_CYMBAL_OPEN);
	}

	@Override
	public PlaySample getCymbalPedal() {
		return new PlaySample(PredefinedSample.DRUM_CYMBAL_PEDAL);
	}

	@Override
	public PlaySample getSnare() {
		return new PlaySample(PredefinedSample.DRUM_SNARE_SOFT);
	}

	@Override
	public PlaySample getSplash() {
		return new PlaySample(PredefinedSample.DRUM_SPLASH_SOFT);
	}

	@Override
	public PlaySample getTomHi() {
		return new PlaySample(PredefinedSample.DRUM_TOM_HI_SOFT);
	}

	@Override
	public PlaySample getTomLo() {
		return new PlaySample(PredefinedSample.DRUM_TOM_LO_SOFT);
	}

	@Override
	public PlaySample getTomMid() {
		return new PlaySample(PredefinedSample.DRUM_TOM_MID_SOFT);
	}
}
