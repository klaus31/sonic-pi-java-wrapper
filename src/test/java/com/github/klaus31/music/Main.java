package com.github.klaus31.music;

import java.io.IOException;

import com.github.klaus31.music.song.Song;

public class Main {

	public static void main(String... args) throws IOException {
		Song song = new SongExample();
		song.play();
	}
}
