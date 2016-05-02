package com.github.klaus31.music.theme;

import com.github.klaus31.music.SonglineList;
import com.github.klaus31.music.command.UseBpm;

public interface Song {
	UseBpm getBpmCommand();

	SonglineList getSonglines();
}
