package klaus31.music.command.params;

public class Pan implements Param {

	public static final Pan LEFT = new Pan(-1);
	public static final Pan LEFT_ALMOST = new Pan(-0.85);
	public static final Pan LEFT_HALF = new Pan(-0.5);
	public static final Pan DEFAULT = new Pan(0);
	public static final Pan RIGHT_HALF = new Pan(0.5);
	public static final Pan RIGHT_ALMOST = new Pan(0.85);
	public static final Pan RIGHT = new Pan(1);
	private final double value;

	Pan(final double value) {
		this.value = value;
	}

	public Pan createToggled() {
		return new Pan(value * -1);
	}

	@Override
	public String toApplyString() {
		return Params.toApplyString("pan", value);
	}

}
