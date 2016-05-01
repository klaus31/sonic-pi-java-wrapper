package com.github.klaus31.command.params;

public abstract class ParamCommon implements Param {
	private final String value;

	ParamCommon(final String value) {
		this.value = value;
	}

	abstract String getKey();

	@Override
	public String toApplyString() {
		return ", " + getKey() + ": " + value;
	}
}
