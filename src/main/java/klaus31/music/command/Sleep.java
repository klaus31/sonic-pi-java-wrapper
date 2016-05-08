package klaus31.music.command;

/**
 * @author smart
 *
 */
public class Sleep implements Command {

	public static final Sleep FOUR_BEATS = new Sleep(4);
	public static final Sleep THREE_BEATS = new Sleep(3);
	public static final Sleep TWO_BEATS = new Sleep(2);
	public static final Sleep ONE_BEAT = new Sleep(1);
	public static final Sleep HALF_BEAT = new Sleep(1D / 2D);
	public static final Sleep QUARTER_BEAT = new Sleep(1D / 4D);
	public static final Sleep FOURTH_BEAT = QUARTER_BEAT;
	public static final Sleep EIGHTH_BEAT = new Sleep(1D / 8D);
	public static final Sleep SIXTEENTH_BEAT = new Sleep(1D / 18D);
	private final double beats;

	public Sleep(final double beats) {
		this.beats = beats;
	}

	@Override
	public String format() {
		return String.format("sleep %s", beats);
	}

	public double getBeats() {
		return beats;
	}
}
