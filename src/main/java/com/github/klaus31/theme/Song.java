package com.github.klaus31.theme;

import com.github.klaus31.command.UseBpm;
import com.github.klaus31.music.SonglineList;

public interface Song {
	UseBpm getBpmCommand();

	SonglineList getSonglines();
}
