package klaus31.music.demo.themebuilder;

import klaus31.music.command.UseBpm;
import klaus31.music.instruments.DrumkitSoft;
import klaus31.music.theme.Song;

public class ThemeBuilderDemoSong extends Song {

	public ThemeBuilderDemoSong() {
		add(new DrumTheme(new DrumkitSoft()));
	}

	@Override
	protected UseBpm getBpmCommand() {
		return new UseBpm(60);
	}

}
