package com.github.klaus31.theme;

import java.util.List;

import com.github.klaus31.command.Sleep;
import com.github.klaus31.music.Songline;

/**
 * a theme or in other words "something, that can be played"
 */
public interface Theme {

	List<Songline> getSonglines();

	Sleep getTotalBeats();
}
