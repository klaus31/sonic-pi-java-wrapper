package klaus31.music.command.synth;

import static klaus31.music.Rubyalizer.colonize;

public class PredefinedSynth implements Synth {

	public static final PredefinedSynth CHIPNOISE = new PredefinedSynth("chipnoise");
	public static final PredefinedSynth CNOISE = new PredefinedSynth("cnoise");
	public static final PredefinedSynth DARK_AMBIENCE = new PredefinedSynth("dark_ambience");
	public static final PredefinedSynth DPULSE = new PredefinedSynth("dpulse");
	public static final PredefinedSynth DSAW = new PredefinedSynth("dsaw");
	public static final PredefinedSynth DTRI = new PredefinedSynth("dtri");
	public static final PredefinedSynth DULL_BELL = new PredefinedSynth("dull_bell");
	public static final PredefinedSynth FM = new PredefinedSynth("fm");
	public static final PredefinedSynth GNOISE = new PredefinedSynth("gnoise");
	public static final PredefinedSynth GROWL = new PredefinedSynth("growl");
	public static final PredefinedSynth HOLLOW = new PredefinedSynth("hollow");
	public static final PredefinedSynth HOOVER = new PredefinedSynth("hoover");
	public static final PredefinedSynth MOD_BEEP = new PredefinedSynth("mod_beep");
	public static final PredefinedSynth MOD_DSAW = new PredefinedSynth("mod_dsaw");
	public static final PredefinedSynth MOD_FM = new PredefinedSynth("mod_fm");
	public static final PredefinedSynth MOD_PULSE = new PredefinedSynth("mod_pulse");
	public static final PredefinedSynth MOD_SAW = new PredefinedSynth("mod_saw");
	public static final PredefinedSynth MOD_SINE = new PredefinedSynth("mod_sine");
	public static final PredefinedSynth MOD_TRI = new PredefinedSynth("mod_tri");
	public static final PredefinedSynth NOISE = new PredefinedSynth("noise");
	public static final PredefinedSynth PIANO = new PredefinedSynth("piano");
	public static final PredefinedSynth PLUCK = new PredefinedSynth("pluck");
	public static final PredefinedSynth PNOISE = new PredefinedSynth("pnoise");
	public static final PredefinedSynth PRETTY_BELL = new PredefinedSynth("pretty_bell");
	public static final PredefinedSynth PROPHET = new PredefinedSynth("prophet");
	public static final PredefinedSynth PULSE = new PredefinedSynth("pulse");
	public static final PredefinedSynth SAW = new PredefinedSynth("saw");
	public static final PredefinedSynth SINE = new PredefinedSynth("sine");
	public static final PredefinedSynth SQUARE = new PredefinedSynth("square");
	public static final PredefinedSynth SUBPULSE = new PredefinedSynth("subpulse");
	public static final PredefinedSynth SUPERSAW = new PredefinedSynth("supersaw");
	public static final PredefinedSynth TB303 = new PredefinedSynth("tb303");
	public static final PredefinedSynth TRI = new PredefinedSynth("tri");
	public static final PredefinedSynth ZAWA = new PredefinedSynth("zawa");
	public static final PredefinedSynth DEFAULT = PIANO;

	private final String name;

	PredefinedSynth(final String name) {
		this.name = colonize(name);
	}

	@Override
	public String getName() {
		return name;
	}
}
