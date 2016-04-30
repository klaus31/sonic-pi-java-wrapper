package com.github.klaus31.music.example;

import java.util.ArrayList;
import java.util.List;

import com.github.klaus31.command.Command;
import com.github.klaus31.command.SampleDefault;
import com.github.klaus31.command.Sleep;
import com.github.klaus31.theme.Theme;

public class MelodyExample implements Theme {

	@Override
	public List<Command> getSonglines() {
		final List<Command> songlines = new ArrayList<>();
		songlines.add(new SampleDefault(":ambi_piano"));
		songlines.add(new Sleep(1));
		songlines.add(new SampleDefault(":ambi_swoosh"));
		songlines.add(new Sleep(2));
		songlines.add(new SampleDefault(":ambi_piano"));
		songlines.add(new Sleep(1));
		songlines.add(new SampleDefault(":ambi_swoosh"));
		songlines.add(new Sleep(2));
		return songlines;
	}

}
