package klaus31.music.command.params;

public class Params {

	public static String toApplyString(final String key, final Object value) {
		return ", " + key + ": " + value.toString();
	}

	private Params() {
	}
}
