package klaus31.music.theme;

import java.util.ArrayList;

import klaus31.music.command.Command;
import klaus31.music.command.Sleep;

class Songlines extends ArrayList<Command> {
	private static final long serialVersionUID = 1L;

	private double totalBeats = 0;

	void add(final Sleep sleep) {
		add((Command) sleep);
		totalBeats += sleep.getBeats();
	}

	/**
	 * @return the total duration of all songlines, where the sum of all beats
	 *         are used from all {@link #add(Sleep)} calls. if you are not using
	 *         this method for all your sleeps in the songlines, the result is
	 *         incorrect!
	 */
	Sleep getTotalBeats() {
		return new Sleep(totalBeats);
	}

	void multiplyTotalBeats(final int loops) {
		totalBeats *= loops;
	}
}
