package klaus31.music.theme;

import klaus31.music.command.Sleep;
import klaus31.music.command.sample.PlaySample;

/**
 * a theme or in other words "something, that can be played"
 */
public class Theme {

	private final boolean runsInThread = false;

	private final SonglineList songlines;

	public Theme() {
		songlines = new SonglineList();
	}

	protected void add(final PlaySample command) {
		songlines.add(command);
	}

	protected void add(final Sleep sleep) {
		songlines.add(sleep);
	}

	SonglineList getSonglines() {
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
		songlines.add(0, Songline.create(firstLine));
		songlines.add(Songline.create(lastLine));
	}

}
