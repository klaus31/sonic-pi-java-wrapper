package com.github.klaus31.command;

public class SampleDefault implements Sample {

	public final String name;

	public SampleDefault(final String name) {
		this.name = name;
	}

	@Override
	public String getSongLine() {
		return "sample " + name;
	}

}
