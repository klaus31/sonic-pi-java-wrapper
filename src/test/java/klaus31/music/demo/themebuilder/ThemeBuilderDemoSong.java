package klaus31.music.demo.themebuilder;

import static java.util.Arrays.asList;

import klaus31.music.command.UseBpm;
import klaus31.music.instruments.BassDefault;
import klaus31.music.instruments.DrumkitSoft;
import klaus31.music.theme.Song;
import klaus31.music.theme.Theme;

public class ThemeBuilderDemoSong extends Song {

	public ThemeBuilderDemoSong() {
		final Theme drumLine = new DrumTheme(new DrumkitSoft());
		final Theme bassLine = new BassTheme(new BassDefault());
		add(asList(drumLine, bassLine));
	}

	@Override
	protected UseBpm getBpmCommand() {
		return new UseBpm(60);
	}

}
