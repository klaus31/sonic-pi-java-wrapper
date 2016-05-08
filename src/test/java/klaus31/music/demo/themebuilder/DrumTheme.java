package klaus31.music.demo.themebuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import klaus31.music.command.Command;
import klaus31.music.command.Sleep;
import klaus31.music.instruments.Drumkit;
import klaus31.music.theme.BarBuilder;
import klaus31.music.theme.Theme;
import klaus31.music.theme.ThemeBuilder;

public class DrumTheme extends Theme {

	public DrumTheme(final Drumkit drumkit) {

		// @formatter:off
		final BarBuilder drumBarBuilder = BarBuilder.create()
			.action(i -> {
				// TODO fix the salad of magic numbers!
				final List<Command> commands = new ArrayList<>();
				if(i % 3 == 0) {
					commands.add(drumkit.getCymbal().createCopyWithChangedAmp(0.2));
				}
				if(i % 3 == 2) {
					commands.add(drumkit.getCymbal().createCopyWithChangedAmp(0.4));
				}
				if (Arrays.asList(0).contains(i % 6)) {
					commands.add(drumkit.getBass());
				}
				if (Arrays.asList(4).contains(i % 24)) {
					commands.add(drumkit.getBass().createCopyWithChangedAmp(0.5));
				}
				if (Arrays.asList(3).contains(i % 6)) {
					commands.add(drumkit.getSnare());
				}
				if (Arrays.asList(8).contains(i % 12)) {
					commands.add(drumkit.getSnare().createCopyWithChangedAmp(0.5));
				}
				if (Arrays.asList(17).contains(i % 24)) {
					commands.add(drumkit.getSnare().createCopyWithChangedAmp(1.5));
				}
				return commands;
			})
			.sleep(Sleep.QUARTER_TRIOLA)
			.beats(12);

		final ThemeBuilder themeBuilder = ThemeBuilder.create()
				.addBar(drumBarBuilder.build());
		// @formatter:on
		add(themeBuilder.build());
	}

}
