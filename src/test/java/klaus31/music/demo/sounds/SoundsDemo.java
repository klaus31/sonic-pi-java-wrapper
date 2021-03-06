package klaus31.music.demo.sounds;

import static java.util.Arrays.asList;
import static klaus31.music.command.sample.PredefinedSample.DRUM_CYMBAL_PEDAL;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import klaus31.music.Player;
import klaus31.music.PlayerSonicPi;
import klaus31.music.command.Command;
import klaus31.music.command.Sleep;
import klaus31.music.command.UseBpm;
import klaus31.music.command.params.Pan;
import klaus31.music.command.sample.PlaySample;
import klaus31.music.command.sample.PredefinedSample;
import klaus31.music.command.synth.PlaySynth;
import klaus31.music.demo.sounds.drums.hihat.HiHatBaseTheme;
import klaus31.music.theme.Song;
import klaus31.music.theme.SongListener;
import klaus31.music.theme.Theme;

public class SoundsDemo extends Song {

	public static void main(final String... args) throws IOException {
		final Song song = new SoundsDemo();
		final Player player = new PlayerSonicPi().activateDebugging();
		player.play(song);
	}

	public SoundsDemo() {

		add(new HiHatBaseTheme());
		add(new HiHatBaseTheme(16, DRUM_CYMBAL_PEDAL, Sleep.EIGHTH_BEAT));
		add(new HiHatBaseTheme(32, DRUM_CYMBAL_PEDAL, Sleep.SIXTEENTH_BEAT));

		// some mixins for demo:
		// mixin pan to left
		this.mixin((songline, theme, sizeOfOutputLines) -> {
			if (songline instanceof PlaySample) {
				final PlaySample sample = (PlaySample) songline;
				sample.setPan(Pan.LEFT).changeAmp(0.9);
			}
			return Optional.empty();
		});

		// play a synth on every 5th output line listened
		this.mixin((songline, theme, sizeOfOutputLines) -> {
			if (sizeOfOutputLines % 5 == 0) {
				final PlaySynth playSynth = new PlaySynth(60);
				playSynth.getCtrl().changeAmp(0.3);
				return Optional.of(asList(playSynth));
			} else {
				return Optional.empty();
			}
		});

		// change the sample
		this.mixin(new SongListener() {
			private int count = 0;

			@Override
			public Optional<List<Command>> update(final Command songline, final Theme theme,
					final int sizeOfOutputLines) {
				if (songline instanceof PlaySample) {
					count++;
					if (count % 3 == 0) {
						final PlaySample newSample = new PlaySample(PredefinedSample.DRUM_BASS_SOFT);
						newSample.changeAmp(1);
						final PlaySample originalSample = (PlaySample) songline;
						originalSample.mute();
						return Optional.of(asList(newSample));
					}
				}
				return Optional.empty();
			}
		});

		add(new HiHatBaseTheme());
		add(new HiHatBaseTheme(16, DRUM_CYMBAL_PEDAL, Sleep.EIGHTH_BEAT));
		add(new HiHatBaseTheme(32, DRUM_CYMBAL_PEDAL, Sleep.SIXTEENTH_BEAT));
	}

	@Override
	protected UseBpm getBpmCommand() {
		return new UseBpm(80);
	}

}
