package com.github.klaus31.command;

class Rubyalizer {
	public static String colonize(final String arg) {
		return arg.matches("^:.+") ? arg : ":" + arg;
	}

	private Rubyalizer() {
	}
}
