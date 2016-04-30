package com.github.klaus31.music;

import java.io.IOException;

import com.github.klaus31.music.example.SongExample;
import com.github.klaus31.music.theme.Player;
import com.github.klaus31.music.theme.Song;
import com.github.klaus31.music.theme.SongSonicPiBashPlayer;

public class Main {

	public static void main(String... args) throws IOException {
		Song song = new SongExample();
		Player player = new SongSonicPiBashPlayer();
		player.play(song);
	}
}
