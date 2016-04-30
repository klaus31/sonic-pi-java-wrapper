package com.github.klaus31.theme;

import java.util.List;

import com.github.klaus31.command.Command;
import com.github.klaus31.command.UseBpm;

public interface Song {
	UseBpm getBpmCommand();

	List<Command> getSonglines();
}
