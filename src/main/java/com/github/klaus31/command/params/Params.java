package com.github.klaus31.command.params;

public class Params {

	public static String toApplyString(final String key, final Object value) {
		return ", " + key + ": " + value.toString();
	}

	private Params() {
	}
}
