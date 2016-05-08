package klaus31.music.theme;

import klaus31.music.command.Sleep;

public enum TimeSignature {
	FOUR_FOUR_TIME, THREE_FOUR_TIME;

	public int split(final Sleep sleep) {
		// TODO method and other cases
		switch (this) {
		case FOUR_FOUR_TIME:
			int result = 0;
			double length = 0;
			while (length < 4) {
				length += sleep.getBeats();
				result++;
			}
			return result;
		default:
			break;
		}
		return 0;
	}
}