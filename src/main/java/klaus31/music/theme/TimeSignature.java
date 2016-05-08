package klaus31.music.theme;

import klaus31.music.command.Sleep;

public enum TimeSignature {
	FOUR_FOUR_TIME, THREE_FOUR_TIME;

	public int split(final Sleep sleep) {
		// TODO method and other cases
		switch (this) {
		case FOUR_FOUR_TIME:
			return split(sleep, 4);
		case THREE_FOUR_TIME:
			return split(sleep, 3);
		default:
			break;
		}
		return 0;
	}

	private int split(final Sleep sleep, final int until) {
		int result = 0;
		double length = sleep.getBeats();
		while (length < until) {
			length += sleep.getBeats();
			result++;
		}
		return result;
	}
}