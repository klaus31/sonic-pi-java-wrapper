package klaus31.music.demo.themebuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import klaus31.music.command.Command;
import klaus31.music.command.Sleep;
import klaus31.music.command.params.UniversalParams;
import klaus31.music.command.synth.NoteFactory;
import klaus31.music.instruments.BassDefault;
import klaus31.music.theme.Bar;
import klaus31.music.theme.BarBuilder;
import klaus31.music.theme.Theme;
import klaus31.music.theme.ThemeBuilder;

public class BassTheme extends Theme {

	public BassTheme(final BassDefault bassDefault) {

		final NoteFactory factoryLo = new NoteFactory(":C2", ":minor");
		final NoteFactory factoryMid = new NoteFactory(":F2", ":minor");

		final Function<Integer, List<Command>> bar1action = i -> {
			final List<Command> commands = new ArrayList<>();
			NoteFactory factory = factoryLo;
			if (i % 16 > 8) {
				factory = factoryMid;
			}
			if (i % 8 == 0) {
				commands.add(bassDefault.getSound(factory.createNote(0)).createCopyWithChangedAmp(0.2));
			}
			if (i % 4 == 2) {
				commands.add(bassDefault.getSound(factory.createNote(1)).createCopyWithChangedAmp(0.15));
			}
			if (i % 12 == 1) {
				commands.add(bassDefault.getSound(factory.createNote(3)).createCopyWithChangedAmp(0.3));
			}
			return commands;
		};
		final Bar bar1 = BarBuilder.create().action(bar1action).beats(12).sleep(Sleep.FOURTH_BEAT).build();
		final ThemeBuilder themeBuilder = ThemeBuilder.create().addBar(bar1);
		final Theme theme = themeBuilder.build();
		theme.wrapFx("distortion", new UniversalParams().put("distort", 0.5));
		theme.wrapFx("reverb");
		add(theme);
	}

}
