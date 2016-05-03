package klaus31.music.util;

public class Rubyalizer {
	public static String colonize(final String arg) {
		return arg.matches("^:.+") ? arg : ":" + arg;
	}

	private Rubyalizer() {
	}
}
