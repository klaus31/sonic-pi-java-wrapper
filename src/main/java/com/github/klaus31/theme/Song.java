package com.github.klaus31.theme;

import java.util.List;

import com.github.klaus31.command.UseBpm;
import com.github.klaus31.music.Songline;

public interface Song {
	UseBpm getBpmCommand();

	List<Songline> getSonglines();
}
