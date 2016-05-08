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
	private TimeSignature timeSignature;

	private BarBuilder() {
		timeSignature = TimeSignature.FOUR_FOUR_TIME;
		sleep = Sleep.ONE_BEAT;
		action = (i) -> {
			return new ArrayList<>();
		};
	}

	public BarBuilder action(final Function<Integer, List<Command>> action) {
		this.action = action;
		return this;
	}

	public Bar build() {
		return new Bar(timeSignature, sleep, action);
	}

	public BarBuilder sleep(final Sleep sleep) {
		this.sleep = sleep;
		return this;
	}

	public BarBuilder timeSignature(final TimeSignature timeSignature) {
		this.timeSignature = timeSignature;
		return this;
	}

}
