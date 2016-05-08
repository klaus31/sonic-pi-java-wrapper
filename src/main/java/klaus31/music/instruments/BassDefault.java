package klaus31.music.instruments;

import klaus31.music.command.params.PlayParams;
import klaus31.music.command.synth.PlaySynth;
import klaus31.music.command.synth.PredefinedSynth;

public class BassDefault implements Bass {

	@Override
	public PlaySynth getSound(final String note) {
		final PlaySynth synth = new PlaySynth(note, PlayParams.createDefault(), PredefinedSynth.DPULSE);
		return synth;
	}

}
