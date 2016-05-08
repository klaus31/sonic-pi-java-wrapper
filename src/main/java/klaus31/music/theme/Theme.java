package klaus31.music.theme;

import static klaus31.music.Rubyalizer.colonize;

import klaus31.music.command.Command;
import klaus31.music.command.Sleep;
import klaus31.music.command.params.UniversalParams;

/**
 * a theme or in other words "something, that can be played"
 */
public class Theme {

	private final boolean runsInThread = false;

	private final Songlines songlines;

	public Theme() {
		songlines = new Songlines();
	}

	protected void add(final Command command) {
		if (command instanceof Sleep) {
			songlines.add((Sleep) command);
		} else {
			songlines.add(command);
		}
	}

	protected void add(final Theme theme) {
		theme.getSonglines().forEach(this::add);
	}

	Songlines getSonglines() {
		return songlines;
	}

	protected void loop(final int loops) {
		wrap(loops + ".times do");
		songlines.multiplyTotalBeats(loops);
	}

	protected void runInThread() {
		if (runsInThread) {
			throw new AssertionError("threaded themes must not run in thread");
		}
		wrap("in_thread do");
	}

	protected void wrap(final String firstLine) {
		wrap(firstLine, "end");
	}

	protected void wrap(final String firstLine, final String lastLine) {
		songlines.add(0, () -> firstLine);
		songlines.add(() -> lastLine);
	}

	public void wrapFx(final String name) {
		wrap(String.format("with_fx %s do", colonize(name)));
	}

	public void wrapFx(final String name, final UniversalParams params) {
		wrap(String.format("with_fx %s%s do", colonize(name), params.toApplyString()));
	}

}
