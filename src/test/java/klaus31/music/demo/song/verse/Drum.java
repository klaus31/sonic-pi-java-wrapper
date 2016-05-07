package klaus31.music.demo.song.verse;

import static klaus31.music.command.Sleep.HALF_BEAT;
import static klaus31.music.command.Sleep.QUARTER_BEAT;

import klaus31.music.command.Command;
import klaus31.music.command.Sleep;
import klaus31.music.command.sample.PlaySample;
import klaus31.music.command.sample.PredefinedSample;
import klaus31.music.theme.SonglineList;
import klaus31.music.theme.Theme;

class Drum implements Theme {

	final SonglineList drums = new SonglineList();

	public Drum(final int loops) {
		final Command bass = new PlaySample(PredefinedSample.DRUM_BASS_SOFT);
		final PlaySample snare = new PlaySample(PredefinedSample.DRUM_SNARE_SOFT);
		snare.getCtrl().changeAmp(2);
		final Command cymbal = new PlaySample(PredefinedSample.DRUM_CYMBAL_CLOSED);
		final PlaySample cowbell = new PlaySample(PredefinedSample.DRUM_COWBELL);
		cowbell.getCtrl().changeAmp(0.2);
		int i = 0;
		while (i++ < loops) {
			drums.add(bass);
			drums.add(cymbal);
			drums.add(HALF_BEAT);
			drums.add(cymbal);
			drums.add(HALF_BEAT);
			if (i != 4 && i != 9) {
				drums.add(snare);
			}
			drums.add(cymbal);
			drums.add(HALF_BEAT);
			drums.add(cymbal);
			if (i % 3 == 0) {
				drums.add(QUARTER_BEAT);
				drums.add(cowbell);
				cowbell.getCtrl().changeAmp(2);
				drums.add(QUARTER_BEAT);
			} else {
				drums.add(HALF_BEAT);
			}
		}
	}

	@Override
	public SonglineList getSonglines() {
		return drums;
	}

	@Override
	public Sleep getTotalBeats() {
		return new Sleep(20);
	}

}
