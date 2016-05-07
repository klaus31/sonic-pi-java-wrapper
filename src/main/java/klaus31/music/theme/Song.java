package klaus31.music.theme;

import klaus31.music.SonglineList;
import klaus31.music.command.UseBpm;

public interface Song {
	UseBpm getBpmCommand();

	SonglineList getSonglines();
}
