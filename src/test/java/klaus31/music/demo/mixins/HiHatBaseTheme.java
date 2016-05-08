package klaus31.music.demo.mixins;

import static klaus31.music.command.sample.PredefinedSample.DRUM_CYMBAL_CLOSED;

import klaus31.music.command.Sleep;
import klaus31.music.command.sample.PlaySample;
import klaus31.music.command.sample.Sample;
import klaus31.music.theme.Theme;

class HiHatBaseTheme extends Theme {

	private final PlaySample playCommand;

	public HiHatBaseTheme() {
		this(4, DRUM_CYMBAL_CLOSED, Sleep.QUARTER_BEAT);
	}

	public HiHatBaseTheme(final int loops, final PlaySample playCommand, final Sleep sleep) {
		this.playCommand = playCommand;
		add(playCommand);
		add(sleep);
		loop(loops);
	}

	public HiHatBaseTheme(final int loops, final Sample cymbal, final Sleep sleep) {
		this(loops, new PlaySample(cymbal), sleep);
	}

	public void setSample(final Sample sample) {
		this.playCommand.createCopyWithSample(sample);
	}

}
