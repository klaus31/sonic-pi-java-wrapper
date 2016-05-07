package klaus31.music.demo.verse;

import static klaus31.music.command.Sleep.ONE_BEAT;
import static klaus31.music.command.Sleep.TWO_BEATS;
import static klaus31.music.command.sample.PredefinedSample.AMBI_PIANO;
import static klaus31.music.command.sample.PredefinedSample.AMBI_SWOOSH;

import klaus31.music.command.Sleep;
import klaus31.music.command.params.Pan;
import klaus31.music.command.sample.PlaySample;
import klaus31.music.command.synth.PlaySynth;
import klaus31.music.command.synth.PredefinedSynth;
import klaus31.music.theme.SonglineList;
import klaus31.music.theme.Theme;

class MelodyA implements Theme {

	private final SonglineList songlines = new SonglineList();

	public MelodyA(final int loops) {
		final PlaySynth bing = new PlaySynth(55).setSynth(PredefinedSynth.HOLLOW);
		bing.getCtrl().changeAmp(2).setPan(Pan.RIGHT_HALF);
		for (int i = 0; i < loops; i++) {
			songlines.add(bing);
			songlines.add(new PlaySample(AMBI_PIANO));
			songlines.add(ONE_BEAT);
			songlines.add(new PlaySample(AMBI_SWOOSH));
			songlines.add(TWO_BEATS);
			songlines.add(bing);
			songlines.add(new PlaySample(AMBI_PIANO));
			songlines.add(ONE_BEAT);
			songlines.add(new PlaySample(AMBI_SWOOSH));
			songlines.add(TWO_BEATS);
			songlines.add(new Sleep(4));
			bing.getCtrl().togglePan();
		}
	}

	@Override
	public SonglineList getSonglines() {
		return songlines;
	}

	@Override
	public Sleep getTotalBeats() {
		return songlines.getTotalBeats();
	}

}
