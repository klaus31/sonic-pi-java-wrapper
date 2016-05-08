package klaus31.music.theme;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import org.apache.commons.lang3.Validate;

import klaus31.music.command.Command;
import klaus31.music.command.Sleep;

public class Bar {

	private final List<Command> commands;

	public Bar(final Sleep sleep, final Function<Integer, List<Command>> action, final int beats) {
		this.commands = new ArrayList<>();
		final int times = split(sleep, beats);
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

	private int split(final Sleep sleep, final int beats) {
		int result = 0;
		double length = sleep.getBeats() + sleep.getBeats() / 2;
		while (length < Sleep.ONE_BEAT.getBeats() * beats) {
			length += sleep.getBeats();
			result++;
		}
		return result;
	}

}
