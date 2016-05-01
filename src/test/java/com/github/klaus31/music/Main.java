package com.github.klaus31.music;

import java.io.IOException;

import com.github.klaus31.music.demo.SongDemo;
import com.github.klaus31.theme.Song;

public class Main {

	public static void main(String... args) throws IOException {
		Song song = new SongDemo();
		Player player = new SongSonicPiBashPlayer();
		player.play(song);
	}
}
