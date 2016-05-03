package klaus31.music.command.params;

public class Amp implements Param {

	public static final Amp VERY_QUIET = new Amp(0.1);
	public static final Amp QUIET = new Amp(0.5);
	public static final Amp DEFAULT = new Amp(1);
	public static final Amp LOUD = new Amp(2);
	public static final Amp VERY_LOUD = new Amp(3);
	private final double value;

	Amp(final double value) {
		this.value = value;
	}

	Amp createChanged(final double factor) {
		return new Amp(value * factor);

	}

	@Override
	public String toApplyString() {
		return Params.toApplyString("amp", value);
	}
}
