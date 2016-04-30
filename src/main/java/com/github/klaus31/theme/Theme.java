package com.github.klaus31.theme;

import java.util.List;

import com.github.klaus31.command.Command;
import com.github.klaus31.command.Sleep;

/**
 * a theme or in other words "something, that can be played"
 */
public interface Theme {

	List<Command> getSonglines();

	Sleep getTotalBeats();
}
