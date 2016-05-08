package klaus31.music.theme;

import java.util.ArrayList;
import java.util.List;

public class ThemeBuilder {

	public static ThemeBuilder create() {
		return new ThemeBuilder();
	}

	private final List<Bar> bars;

	private ThemeBuilder() {

		bars = new ArrayList<>();
	}

	public ThemeBuilder addBar(final Bar bar) {
		bars.add(bar);
		return this;
	}

	public Theme build() {
		final Theme theme = new Theme();
		for (final Bar bar : bars) {
			bar.getCommands().forEach(theme::add);
		}
		return theme;
	}

}
