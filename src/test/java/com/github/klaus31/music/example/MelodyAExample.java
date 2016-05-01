package com.github.klaus31.music.example;

import static com.github.klaus31.command.Sleep.ONE_BEAT;
import static com.github.klaus31.command.Sleep.TWO_BEATS;

import java.util.ArrayList;
import java.util.List;

import com.github.klaus31.command.Play;
import com.github.klaus31.command.Sample;
import com.github.klaus31.command.Sleep;
import com.github.klaus31.music.Songline;
import com.github.klaus31.theme.Theme;

public class MelodyAExample implements Theme {

	@Override
	public List<Songline> getSonglines() {
		final List<Songline> songlines = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			songlines.add(new Play(55).getSongline());
			songlines.add(new Sample(":ambi_piano").getSongline());
			songlines.add(ONE_BEAT.getSongline());
			songlines.add(new Sample(":ambi_swoosh").getSongline());
			songlines.add(TWO_BEATS.getSongline());
			songlines.add(new Play(55).getSongline());
			songlines.add(new Sample(":ambi_piano").getSongline());
			songlines.add(ONE_BEAT.getSongline());
			songlines.add(new Sample(":ambi_swoosh").getSongline());
			songlines.add(TWO_BEATS.getSongline());
			songlines.add(new Sleep(4).getSongline());
		}
		return songlines;
	}

	@Override
	public Sleep getTotalBeats() {
		return new Sleep((6 + 4) * 2);
	}

}
