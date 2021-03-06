package klaus31.music.command.sample;

import static klaus31.music.Rubyalizer.colonize;

public class PredefinedSample implements Sample {

	public static final Sample AMBI_CHOIR = new PredefinedSample("ambi_choir");
	public static final Sample AMBI_DARK_WOOSH = new PredefinedSample("ambi_dark_woosh");
	public static final Sample AMBI_DRONE = new PredefinedSample("ambi_drone");
	public static final Sample AMBI_GLASS_HUM = new PredefinedSample("ambi_glass_hum");
	public static final Sample AMBI_GLASS_RUB = new PredefinedSample("ambi_glass_rub");
	public static final Sample AMBI_HAUNTED_HUM = new PredefinedSample("ambi_haunted_hum");
	public static final Sample AMBI_LUNAR_LAND = new PredefinedSample("ambi_lunar_land");
	public static final Sample AMBI_PIANO = new PredefinedSample("ambi_piano");
	public static final Sample AMBI_SOFT_BUZZ = new PredefinedSample("ambi_soft_buzz");
	public static final Sample AMBI_SWOOSH = new PredefinedSample("ambi_swoosh");
	public static final Sample BASS_DNB_F = new PredefinedSample("bass_dnb_f");
	public static final Sample BASS_DROP_C = new PredefinedSample("bass_drop_c");
	public static final Sample BASS_HARD_C = new PredefinedSample("bass_hard_c");
	public static final Sample BASS_HIT_C = new PredefinedSample("bass_hit_c");
	public static final Sample BASS_THICK_C = new PredefinedSample("bass_thick_c");
	public static final Sample BASS_TRANCE_C = new PredefinedSample("bass_trance_c");
	public static final Sample BASS_VOXY_C = new PredefinedSample("bass_voxy_c");
	public static final Sample BASS_VOXY_HIT_C = new PredefinedSample("bass_voxy_hit_c");
	public static final Sample BASS_WOODSY_C = new PredefinedSample("bass_woodsy_c");
	public static final Sample BD_808 = new PredefinedSample("bd_808");
	public static final Sample BD_ADA = new PredefinedSample("bd_ada");
	public static final Sample BD_BOOM = new PredefinedSample("bd_boom");
	public static final Sample BD_FAT = new PredefinedSample("bd_fat");
	public static final Sample BD_GAS = new PredefinedSample("bd_gas");
	public static final Sample BD_HAUS = new PredefinedSample("bd_haus");
	public static final Sample BD_KLUB = new PredefinedSample("bd_klub");
	public static final Sample BD_PURE = new PredefinedSample("bd_pure");
	public static final Sample BD_SONE = new PredefinedSample("bd_sone");
	public static final Sample BD_TEK = new PredefinedSample("bd_tek");
	public static final Sample BD_ZOME = new PredefinedSample("bd_zome");
	public static final Sample BD_ZUM = new PredefinedSample("bd_zum");
	public static final Sample DRUM_BASS_HARD = new PredefinedSample("drum_bass_hard");
	public static final Sample DRUM_BASS_SOFT = new PredefinedSample("drum_bass_soft");
	public static final Sample DRUM_COWBELL = new PredefinedSample("drum_cowbell");
	public static final Sample DRUM_CYMBAL_CLOSED = new PredefinedSample("drum_cymbal_closed");
	public static final Sample DRUM_CYMBAL_HARD = new PredefinedSample("drum_cymbal_hard");
	public static final Sample DRUM_CYMBAL_OPEN = new PredefinedSample("drum_cymbal_open");
	public static final Sample DRUM_CYMBAL_PEDAL = new PredefinedSample("drum_cymbal_pedal");
	public static final Sample DRUM_CYMBAL_SOFT = new PredefinedSample("drum_cymbal_soft");
	public static final Sample DRUM_HEAVY_KICK = new PredefinedSample("drum_heavy_kick");
	public static final Sample DRUM_ROLL = new PredefinedSample("drum_roll");
	public static final Sample DRUM_SNARE_HARD = new PredefinedSample("drum_snare_hard");
	public static final Sample DRUM_SNARE_SOFT = new PredefinedSample("drum_snare_soft");
	public static final Sample DRUM_SPLASH_HARD = new PredefinedSample("drum_splash_hard");
	public static final Sample DRUM_SPLASH_SOFT = new PredefinedSample("drum_splash_soft");
	public static final Sample DRUM_TOM_HI_HARD = new PredefinedSample("drum_tom_hi_hard");
	public static final Sample DRUM_TOM_HI_SOFT = new PredefinedSample("drum_tom_hi_soft");
	public static final Sample DRUM_TOM_LO_HARD = new PredefinedSample("drum_tom_lo_hard");
	public static final Sample DRUM_TOM_LO_SOFT = new PredefinedSample("drum_tom_lo_soft");
	public static final Sample DRUM_TOM_MID_HARD = new PredefinedSample("drum_tom_mid_hard");
	public static final Sample DRUM_TOM_MID_SOFT = new PredefinedSample("drum_tom_mid_soft");
	public static final Sample ELEC_BEEP = new PredefinedSample("elec_beep");
	public static final Sample ELEC_BELL = new PredefinedSample("elec_bell");
	public static final Sample ELEC_BLIP2 = new PredefinedSample("elec_blip2");
	public static final Sample ELEC_BLIP = new PredefinedSample("elec_blip");
	public static final Sample ELEC_BLUP = new PredefinedSample("elec_blup");
	public static final Sample ELEC_BONG = new PredefinedSample("elec_bong");
	public static final Sample ELEC_CHIME = new PredefinedSample("elec_chime");
	public static final Sample ELEC_CYMBAL = new PredefinedSample("elec_cymbal");
	public static final Sample ELEC_FILT_SNARE = new PredefinedSample("elec_filt_snare");
	public static final Sample ELEC_FLIP = new PredefinedSample("elec_flip");
	public static final Sample ELEC_FUZZ_TOM = new PredefinedSample("elec_fuzz_tom");
	public static final Sample ELEC_HI_SNARE = new PredefinedSample("elec_hi_snare");
	public static final Sample ELEC_HOLLOW_KICK = new PredefinedSample("elec_hollow_kick");
	public static final Sample ELEC_LO_SNARE = new PredefinedSample("elec_lo_snare");
	public static final Sample ELEC_MID_SNARE = new PredefinedSample("elec_mid_snare");
	public static final Sample ELEC_PING = new PredefinedSample("elec_ping");
	public static final Sample ELEC_PLIP = new PredefinedSample("elec_plip");
	public static final Sample ELEC_POP = new PredefinedSample("elec_pop");
	public static final Sample ELEC_SNARE = new PredefinedSample("elec_snare");
	public static final Sample ELEC_SOFT_KICK = new PredefinedSample("elec_soft_kick");
	public static final Sample ELEC_TICK = new PredefinedSample("elec_tick");
	public static final Sample ELEC_TRIANGLE = new PredefinedSample("elec_triangle");
	public static final Sample ELEC_TWANG = new PredefinedSample("elec_twang");
	public static final Sample ELEC_TWIP = new PredefinedSample("elec_twip");
	public static final Sample ELEC_WOOD = new PredefinedSample("elec_wood");
	public static final Sample GUIT_E_FIFTHS = new PredefinedSample("guit_e_fifths");
	public static final Sample GUIT_EM9 = new PredefinedSample("guit_em9");
	public static final Sample GUIT_E_SLIDE = new PredefinedSample("guit_e_slide");
	public static final Sample GUIT_HARMONICS = new PredefinedSample("guit_harmonics");
	public static final Sample LOOP_AMEN = new PredefinedSample("loop_amen");
	public static final Sample LOOP_AMEN_FULL = new PredefinedSample("loop_amen_full");
	public static final Sample LOOP_BREAKBEAT = new PredefinedSample("loop_breakbeat");
	public static final Sample LOOP_COMPUS = new PredefinedSample("loop_compus");
	public static final Sample LOOP_GARZUL = new PredefinedSample("loop_garzul");
	public static final Sample LOOP_INDUSTRIAL = new PredefinedSample("loop_industrial");
	public static final Sample LOOP_MIKA = new PredefinedSample("loop_mika");
	public static final Sample LOOP_SAFARI = new PredefinedSample("loop_safari");
	public static final Sample LOOP_TABLA = new PredefinedSample("loop_tabla");
	public static final Sample MISC_BURP = new PredefinedSample("misc_burp");
	public static final Sample MISC_CINEBOOM = new PredefinedSample("misc_cineboom");
	public static final Sample MISC_CROW = new PredefinedSample("misc_crow");
	public static final Sample PERC_BELL = new PredefinedSample("perc_bell");
	public static final Sample PERC_SNAP2 = new PredefinedSample("perc_snap2");
	public static final Sample PERC_SNAP = new PredefinedSample("perc_snap");
	public static final Sample PERC_SWASH = new PredefinedSample("perc_swash");
	public static final Sample PERC_TILL = new PredefinedSample("perc_till");
	public static final Sample SN_DOLF = new PredefinedSample("sn_dolf");
	public static final Sample SN_DUB = new PredefinedSample("sn_dub");
	public static final Sample SN_ZOME = new PredefinedSample("sn_zome");
	public static final Sample TABLA_DHEC = new PredefinedSample("tabla_dhec");
	public static final Sample TABLA_GHE1 = new PredefinedSample("tabla_ghe1");
	public static final Sample TABLA_GHE2 = new PredefinedSample("tabla_ghe2");
	public static final Sample TABLA_GHE3 = new PredefinedSample("tabla_ghe3");
	public static final Sample TABLA_GHE4 = new PredefinedSample("tabla_ghe4");
	public static final Sample TABLA_GHE5 = new PredefinedSample("tabla_ghe5");
	public static final Sample TABLA_GHE6 = new PredefinedSample("tabla_ghe6");
	public static final Sample TABLA_GHE7 = new PredefinedSample("tabla_ghe7");
	public static final Sample TABLA_GHE8 = new PredefinedSample("tabla_ghe8");
	public static final Sample TABLA_KE1 = new PredefinedSample("tabla_ke1");
	public static final Sample TABLA_KE2 = new PredefinedSample("tabla_ke2");
	public static final Sample TABLA_KE3 = new PredefinedSample("tabla_ke3");
	public static final Sample TABLA_NA = new PredefinedSample("tabla_na");
	public static final Sample TABLA_NA_O = new PredefinedSample("tabla_na_o");
	public static final Sample TABLA_NA_S = new PredefinedSample("tabla_na_s");
	public static final Sample TABLA_RE = new PredefinedSample("tabla_re");
	public static final Sample TABLA_TAS1 = new PredefinedSample("tabla_tas1");
	public static final Sample TABLA_TAS2 = new PredefinedSample("tabla_tas2");
	public static final Sample TABLA_TAS3 = new PredefinedSample("tabla_tas3");
	public static final Sample TABLA_TE1 = new PredefinedSample("tabla_te1");
	public static final Sample TABLA_TE2 = new PredefinedSample("tabla_te2");
	public static final Sample TABLA_TE_M = new PredefinedSample("tabla_te_m");
	public static final Sample TABLA_TE_NE = new PredefinedSample("tabla_te_ne");
	public static final Sample TABLA_TUN1 = new PredefinedSample("tabla_tun1");
	public static final Sample TABLA_TUN2 = new PredefinedSample("tabla_tun2");
	public static final Sample TABLA_TUN3 = new PredefinedSample("tabla_tun3");
	public static final Sample VINYL_BACKSPIN = new PredefinedSample("vinyl_backspin");
	public static final Sample VINYL_HISS = new PredefinedSample("vinyl_hiss");
	public static final Sample VINYL_REWIND = new PredefinedSample("vinyl_rewind");
	public static final Sample VINYL_SCRATCH = new PredefinedSample("vinyl_scratch");

	private final String name;

	PredefinedSample(final String name) {
		this.name = colonize(name);
	}

	@Override
	public String getName() {
		return name;
	}
}
