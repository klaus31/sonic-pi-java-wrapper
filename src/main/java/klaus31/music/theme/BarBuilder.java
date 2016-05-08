package klaus31.music.theme;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import klaus31.music.command.Command;
import klaus31.music.command.Sleep;

public class BarBuilder {

	public static BarBuilder create() {
		return new BarBuilder();
	}

	private Function<Integer, List<Command>> action;
	private Sleep sleep;
	private int beats;

	private BarBuilder() {
		beats = 1;
		sleep = Sleep.ONE_BEAT;
		action = (i) -> {
			return new ArrayList<>();
		};
	}

	public BarBuilder action(final Function<Integer, List<Command>> action) {
		this.action = action;
		return this;
	}

	public BarBuilder beats(final int beats) {
		this.beats = beats;
		return this;
	}

	public Bar build() {
		return new Bar(sleep, action, beats);
	}

	public BarBuilder sleep(final Sleep sleep) {
		this.sleep = sleep;
		return this;
	}
}
