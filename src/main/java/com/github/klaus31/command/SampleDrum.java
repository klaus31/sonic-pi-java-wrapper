package com.github.klaus31.command;

public class SampleDrum extends SampleDefault {

	public SampleDrum(final String name) {
		super(name.matches("^:drum_.+") ? name : ":drum_" + name);
	}

}
