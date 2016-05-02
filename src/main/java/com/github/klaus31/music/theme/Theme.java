package com.github.klaus31.music.theme;

import com.github.klaus31.music.SonglineList;
import com.github.klaus31.music.command.Sleep;

/**
 * a theme or in other words "something, that can be played"
 */
public interface Theme {

	SonglineList getSonglines();

	Sleep getTotalBeats();
}
