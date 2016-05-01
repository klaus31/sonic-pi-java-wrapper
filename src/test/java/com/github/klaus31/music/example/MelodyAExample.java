package com.github.klaus31.music.example;

import static com.github.klaus31.command.Sleep.ONE_BEAT;
import static com.github.klaus31.command.Sleep.TWO_BEATS;

import com.github.klaus31.command.Play;
import com.github.klaus31.command.Sample;
import com.github.klaus31.command.Sleep;
import com.github.klaus31.music.SonglineList;
import com.github.klaus31.theme.Theme;

public class MelodyAExample implements Theme {

	@Override
	public SonglineList getSonglines() {
		final SonglineList songlines = new SonglineList();
		final Play bing = new Play(55);
		bing.getCtrl().changeAmp(0.5);
		for (int i = 0; i < 3; i++) {
			songlines.add(bing);
			songlines.add(new Sample(":ambi_piano"));
			songlines.add(ONE_BEAT);
			songlines.add(new Sample(":ambi_swoosh"));
			songlines.add(TWO_BEATS);
			songlines.add(bing);
			songlines.add(new Sample(":ambi_piano"));
			songlines.add(ONE_BEAT);
			songlines.add(new Sample(":ambi_swoosh"));
			songlines.add(TWO_BEATS);
			songlines.add(new Sleep(4));
		}
		return songlines;
	}

	@Override
	public Sleep getTotalBeats() {
		return new Sleep((6 + 4) * 2);
	}

}
