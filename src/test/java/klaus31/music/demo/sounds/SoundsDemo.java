package klaus31.music.demo.sounds;

import static klaus31.music.command.sample.PredefinedSample.DRUM_CYMBAL_PEDAL;

import java.io.IOException;

import klaus31.music.Player;
import klaus31.music.PlayerSonicPi;
import klaus31.music.command.Sleep;
import klaus31.music.command.UseBpm;
import klaus31.music.demo.sounds.drums.hihat.HiHatBaseTheme;
import klaus31.music.theme.Song;

public class SoundsDemo extends Song {

	public static void main(final String... args) throws IOException {
		final Song song = new SoundsDemo();
		final Player player = new PlayerSonicPi().activateDebugging();
		player.play(song);
	}

	public SoundsDemo() {
		add(new HiHatBaseTheme());
		add(Sleep.TWO_BEATS);
		add(new HiHatBaseTheme(16, DRUM_CYMBAL_PEDAL, Sleep.EIGHTH_BEAT));
		add(Sleep.TWO_BEATS);
		add(new HiHatBaseTheme(32, DRUM_CYMBAL_PEDAL, Sleep.SIXTEENTH_BEAT));
	}

	@Override
	protected UseBpm getBpmCommand() {
		return new UseBpm(80);
	}

}
