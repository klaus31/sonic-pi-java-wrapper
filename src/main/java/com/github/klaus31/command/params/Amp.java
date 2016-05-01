package com.github.klaus31.command.params;

public class Amp extends ParamCommon {

	public static final Amp DEFAULT = new Amp("1");

	Amp(final String value) {
		super(value);
	}

	@Override
	String getKey() {
		return "amp";
	}

}
