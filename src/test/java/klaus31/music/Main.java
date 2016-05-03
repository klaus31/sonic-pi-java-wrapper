package klaus31.music;

import java.io.IOException;

import klaus31.music.Player;
import klaus31.music.SongSonicPiBashPlayer;
import klaus31.music.demo.SongDemo;
import klaus31.music.theme.Song;

public class Main {

	public static void main(String... args) throws IOException {
		Song song = new SongDemo();
		Player player = new SongSonicPiBashPlayer();
		player.play(song);
	}
}
