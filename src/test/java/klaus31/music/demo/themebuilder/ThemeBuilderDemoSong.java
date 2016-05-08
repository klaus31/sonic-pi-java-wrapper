package klaus31.music.demo.themebuilder;

import static klaus31.music.theme.TimeSignature.FOUR_FOUR_TIME;

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

public class ThemeBuilderDemoSong extends Song {

	public ThemeBuilderDemoSong() {

		final PlaySample drumCymbal = new PlaySample(PredefinedSample.DRUM_CYMBAL_SOFT);
		final PlaySample drumBass = new PlaySample(PredefinedSample.DRUM_BASS_HARD);
		final PlaySample drumSnare = new PlaySample(PredefinedSample.DRUM_SNARE_HARD);

		// @formatter:off
		final BarBuilder drumBarBuilder = BarBuilder.create()
			.action(i -> {
				final List<Command> commands = new ArrayList<>();
				commands.add(drumCymbal);
				if (Arrays.asList(0).contains(i % 8)) {
					commands.add(drumBass);
				}
				if (Arrays.asList(4).contains(i % 8)) {
					commands.add(drumSnare);
				}
				return commands;
			})
			.sleep(Sleep.QUARTER_BEAT)
			.timeSignature(FOUR_FOUR_TIME);

		final ThemeBuilder builder = ThemeBuilder.create()
				.addBar(drumBarBuilder.build())
				.addBar(drumBarBuilder.build())
				.addBar(drumBarBuilder.build())
				.addBar(drumBarBuilder.build());
		// @formatter:on
		add(builder.build());
	}

	@Override
	protected UseBpm getBpmCommand() {
		return new UseBpm(60);
	}

}
