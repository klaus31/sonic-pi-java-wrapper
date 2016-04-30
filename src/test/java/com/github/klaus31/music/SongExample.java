package com.github.klaus31.music;

import java.util.ArrayList;
import java.util.List;

import com.github.klaus31.music.command.Command;
import com.github.klaus31.music.command.Play;
import com.github.klaus31.music.command.Sleep;
import com.github.klaus31.music.song.SongSonicPiBash;

public class SongExample extends SongSonicPiBash {

	@Override
	public List<Command> getSonglines() {
		List<Command> songlines = new ArrayList<>();
		int note = 40;
		double beats = 0.5;
		while (note++ < 80) {
			songlines.add(new Play(note));
			songlines.add(new Sleep(beats));
		}
		return songlines;
	}

}
