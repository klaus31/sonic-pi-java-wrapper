package com.github.klaus31.theme;

import com.github.klaus31.command.Sleep;
import com.github.klaus31.music.SonglineList;

/**
 * a theme or in other words "something, that can be played"
 */
public interface Theme {

	SonglineList getSonglines();

	Sleep getTotalBeats();
}
