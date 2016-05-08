package klaus31.music.instruments;

import klaus31.music.command.synth.PlaySynth;

public interface Sound {
	PlaySynth getSound(final String note);
}
