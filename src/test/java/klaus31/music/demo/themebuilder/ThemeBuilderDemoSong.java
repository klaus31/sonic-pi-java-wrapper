package klaus31.music.demo.themebuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import klaus31.music.command.Command;
import klaus31.music.command.Sleep;
import klaus31.music.command.UseBpm;
import klaus31.music.command.sample.PlaySample;
import klaus31.music.command.sample.PredefinedSample;
import klaus31.music.theme.BarBuilder;
import klaus31.music.theme.Song;
import klaus31.music.theme.ThemeBuilder;
import klaus31.music.theme.TimeSignature;

public class ThemeBuilderDemoSong extends Song {

	public ThemeBuilderDemoSong() {

		final PlaySample drumCymbal = new PlaySample(PredefinedSample.DRUM_CYMBAL_SOFT);
		final PlaySample drumBass = new PlaySample(PredefinedSample.DRUM_BASS_HARD);
		final PlaySample drumSnare = new PlaySample(PredefinedSample.DRUM_SNARE_HARD);

		// @formatter:off
		final BarBuilder drumBarBuilder = BarBuilder.create()
			.action(i -> {
				final List<Command> commands = new ArrayList<>();
				if(i % 3 == 0) {
					commands.add(drumCymbal.createCopyWithChangedAmp(0.2));
				}
				if(i % 3 == 2) {
					commands.add(drumCymbal.createCopyWithChangedAmp(0.4));
				}
				if (Arrays.asList(0).contains(i % 6)) {
					commands.add(drumBass);
				}
				if (Arrays.asList(3).contains(i % 6)) {
					commands.add(drumSnare);
				}
				if (Arrays.asList(8).contains(i % 12)) {
					commands.add(drumSnare.createCopyWithChangedAmp(0.2));
				}
				return commands;
			})
			.sleep(Sleep.QUARTER_TRIOLA)
			.timeSignature(TimeSignature.FOUR_FOUR_TIME);

		final ThemeBuilder themeBuilder = ThemeBuilder.create()
				.addBar(drumBarBuilder.build());
		// @formatter:on
		add(themeBuilder.build());
	}

	@Override
	protected UseBpm getBpmCommand() {
		return new UseBpm(60);
	}

}
