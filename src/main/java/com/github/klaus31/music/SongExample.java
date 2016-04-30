package com.github.klaus31.music;

import java.util.ArrayList;
import java.util.List;

public class SongExample extends SongSonicPiBash {

	@Override
	public List<String> getSonglines() {
		List<String> songlines = new ArrayList<>();
		int i = 20;
		double sleep = 0.5;
		while (i++ < 80) {
			songlines.add("play " + i);
			songlines.add("sleep " + sleep);
		}
		return songlines;
	}

}
