package klaus31.music.command.synth;

import static klaus31.music.Rubyalizer.colonize;

public enum Synth {

	CHIPNOISE("chipnoise"),

	CNOISE("cnoise"),

	DARK_AMBIENCE("dark_ambience"),

	DPULSE("dpulse"),

	DSAW("dsaw"),

	DTRI("dtri"),

	DULL_BELL("dull_bell"),

	FM("fm"),

	GNOISE("gnoise"),

	GROWL("growl"),

	HOLLOW("hollow"),

	HOOVER("hoover"),

	MOD_BEEP("mod_beep"),

	MOD_DSAW("mod_dsaw"),

	MOD_FM("mod_fm"),

	MOD_PULSE("mod_pulse"),

	MOD_SAW("mod_saw"),

	MOD_SINE("mod_sine"),

	MOD_TRI("mod_tri"),

	NOISE("noise"),

	PIANO("piano"),

	PLUCK("pluck"),

	PNOISE("pnoise"),

	PRETTY_BELL("pretty_bell"),

	PROPHET("prophet"),

	PULSE("pulse"),

	SAW("saw"),

	SINE("sine"),

	SQUARE("square"),

	SUBPULSE("subpulse"),

	SUPERSAW("supersaw"),

	TB303("tb303"),

	TRI("tri"),

	ZAWA("zawa");

	public static final Synth DEFAULT = PIANO;

	private String name;

	Synth(final String name) {
		this.name = colonize(name);
	}

	public String getName() {
		return name;
	}
}
