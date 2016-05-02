package com.github.klaus31.music.demo;

import static com.github.klaus31.music.Sample.AMBI_PIANO;
import static com.github.klaus31.music.Sample.AMBI_SWOOSH;
import static com.github.klaus31.music.command.Sleep.ONE_BEAT;
import static com.github.klaus31.music.command.Sleep.TWO_BEATS;

import com.github.klaus31.music.SonglineList;
import com.github.klaus31.music.Synth;
import com.github.klaus31.music.command.PlaySample;
import com.github.klaus31.music.command.PlaySynth;
import com.github.klaus31.music.command.Sleep;
import com.github.klaus31.music.command.params.Pan;
import com.github.klaus31.music.theme.Theme;

public class MelodyA implements Theme {

	@Override
	public SonglineList getSonglines() {
		final SonglineList songlines = new SonglineList();
		final PlaySynth bing = new PlaySynth(55).setSynth(Synth.HOLLOW);
		bing.getCtrl().changeAmp(2).setPan(Pan.RIGHT_HALF);
		for (int i = 0; i < 3; i++) {
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
		return songlines;
	}

	@Override
	public Sleep getTotalBeats() {
		return new Sleep((6 + 4) * 2);
	}

}
