package klaus31.music.demo.sounds;

import static klaus31.music.command.sample.PredefinedSample.DRUM_CYMBAL_PEDAL;

import java.io.IOException;

import klaus31.music.Player;
import klaus31.music.PlayerSonicPi;
import klaus31.music.command.Sleep;
import klaus31.music.command.UseBpm;
import klaus31.music.demo.sounds.drums.hihat.HiHatBase;
import klaus31.music.theme.Song;
import klaus31.music.theme.SonglineList;

public class SoundsDemo implements Song {

	public static void main(final String... args) throws IOException {
		final Song song = new SoundsDemo();
		final Player player = new PlayerSonicPi();
		player.play(song);
	}

	final SonglineList songlines = new SonglineList();

	public SoundsDemo() {
		songlines.add(new HiHatBase());
		songlines.add(Sleep.TWO_BEATS);
		songlines.add(new HiHatBase(16, DRUM_CYMBAL_PEDAL, Sleep.EIGHTH_BEAT));
		songlines.add(Sleep.TWO_BEATS);
		songlines.add(new HiHatBase(32, DRUM_CYMBAL_PEDAL, Sleep.SIXTEENTH_BEAT));
	}

	@Override
	public UseBpm getBpmCommand() {
		return new UseBpm(80);
	}

	@Override
	public SonglineList getSonglines() {
		return songlines;
	}

}
