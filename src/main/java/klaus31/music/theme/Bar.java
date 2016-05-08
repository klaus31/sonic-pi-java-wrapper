package klaus31.music.theme;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import org.apache.commons.lang3.Validate;

import klaus31.music.command.Command;
import klaus31.music.command.Sleep;

/**
 * ♩ ♪ ♫ ♬ ♭ ♮ ♯
 */
public class Bar {

	private final List<Command> commands;

	public Bar(final TimeSignature timeSignature, final Sleep sleep, final Function<Integer, List<Command>> action) {
		this.commands = new ArrayList<>();
		final int times = timeSignature.split(sleep);
		int i = 0;
		do {
			Validate.isTrue(action.apply(i).stream().noneMatch(Sleep.class::isInstance),
					"A sleep command breaks the concept of the Bar class");
			commands.addAll(action.apply(i));
			commands.add(sleep);
		} while (i++ < times);
	}

	public List<Command> getCommands() {
		return commands;
	}

}
