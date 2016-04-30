package com.github.klaus31.music.theme;

import java.util.List;

import com.github.klaus31.music.command.Command;

/**
 * a theme or in other words "something, that can be played"
 */
public interface Theme {

	List<Command> getSonglines();

}
