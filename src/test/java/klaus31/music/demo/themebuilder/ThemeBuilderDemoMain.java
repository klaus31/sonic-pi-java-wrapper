package klaus31.music.demo.themebuilder;

import klaus31.music.PlayerSonicPi;

public class ThemeBuilderDemoMain {
	public static void main(final String... args) {
		new PlayerSonicPi().activateDebugging().play(new ThemeBuilderDemoSong());
	}
}
