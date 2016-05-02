package com.github.klaus31.music;

import static com.github.klaus31.music.util.Rubyalizer.colonize;

public enum Sample {

	AMBI_CHOIR("ambi_choir"),

	AMBI_DARK_WOOSH("ambi_dark_woosh"),

	AMBI_DRONE("ambi_drone"),

	AMBI_GLASS_HUM("ambi_glass_hum"),

	AMBI_GLASS_RUB("ambi_glass_rub"),

	AMBI_HAUNTED_HUM("ambi_haunted_hum"),

	AMBI_LUNAR_LAND("ambi_lunar_land"),

	AMBI_PIANO("ambi_piano"),

	AMBI_SOFT_BUZZ("ambi_soft_buzz"),

	AMBI_SWOOSH("ambi_swoosh"),

	BASS_DNB_F("bass_dnb_f"),

	BASS_DROP_C("bass_drop_c"),

	BASS_HARD_C("bass_hard_c"),

	BASS_HIT_C("bass_hit_c"),

	BASS_THICK_C("bass_thick_c"),

	BASS_TRANCE_C("bass_trance_c"),

	BASS_VOXY_C("bass_voxy_c"),

	BASS_VOXY_HIT_C("bass_voxy_hit_c"),

	BASS_WOODSY_C("bass_woodsy_c"),

	BD_808("bd_808"),

	BD_ADA("bd_ada"),

	BD_BOOM("bd_boom"),

	BD_FAT("bd_fat"),

	BD_GAS("bd_gas"),

	BD_HAUS("bd_haus"),

	BD_KLUB("bd_klub"),

	BD_PURE("bd_pure"),

	BD_SONE("bd_sone"),

	BD_TEK("bd_tek"),

	BD_ZOME("bd_zome"),

	BD_ZUM("bd_zum"),

	DRUM_BASS_HARD("drum_bass_hard"),

	DRUM_BASS_SOFT("drum_bass_soft"),

	DRUM_COWBELL("drum_cowbell"),

	DRUM_CYMBAL_CLOSED("drum_cymbal_closed"),

	DRUM_CYMBAL_HARD("drum_cymbal_hard"),

	DRUM_CYMBAL_OPEN("drum_cymbal_open"),

	DRUM_CYMBAL_PEDAL("drum_cymbal_pedal"),

	DRUM_CYMBAL_SOFT("drum_cymbal_soft"),

	DRUM_HEAVY_KICK("drum_heavy_kick"),

	DRUM_ROLL("drum_roll"),

	DRUM_SNARE_HARD("drum_snare_hard"),

	DRUM_SNARE_SOFT("drum_snare_soft"),

	DRUM_SPLASH_HARD("drum_splash_hard"),

	DRUM_SPLASH_SOFT("drum_splash_soft"),

	DRUM_TOM_HI_HARD("drum_tom_hi_hard"),

	DRUM_TOM_HI_SOFT("drum_tom_hi_soft"),

	DRUM_TOM_LO_HARD("drum_tom_lo_hard"),

	DRUM_TOM_LO_SOFT("drum_tom_lo_soft"),

	DRUM_TOM_MID_HARD("drum_tom_mid_hard"),

	DRUM_TOM_MID_SOFT("drum_tom_mid_soft"),

	ELEC_BEEP("elec_beep"),

	ELEC_BELL("elec_bell"),

	ELEC_BLIP2("elec_blip2"),

	ELEC_BLIP("elec_blip"),

	ELEC_BLUP("elec_blup"),

	ELEC_BONG("elec_bong"),

	ELEC_CHIME("elec_chime"),

	ELEC_CYMBAL("elec_cymbal"),

	ELEC_FILT_SNARE("elec_filt_snare"),

	ELEC_FLIP("elec_flip"),

	ELEC_FUZZ_TOM("elec_fuzz_tom"),

	ELEC_HI_SNARE("elec_hi_snare"),

	ELEC_HOLLOW_KICK("elec_hollow_kick"),

	ELEC_LO_SNARE("elec_lo_snare"),

	ELEC_MID_SNARE("elec_mid_snare"),

	ELEC_PING("elec_ping"),

	ELEC_PLIP("elec_plip"),

	ELEC_POP("elec_pop"),

	ELEC_SNARE("elec_snare"),

	ELEC_SOFT_KICK("elec_soft_kick"),

	ELEC_TICK("elec_tick"),

	ELEC_TRIANGLE("elec_triangle"),

	ELEC_TWANG("elec_twang"),

	ELEC_TWIP("elec_twip"),

	ELEC_WOOD("elec_wood"),

	GUIT_E_FIFTHS("guit_e_fifths"),

	GUIT_EM9("guit_em9"),

	GUIT_E_SLIDE("guit_e_slide"),

	GUIT_HARMONICS("guit_harmonics"),

	LOOP_AMEN("loop_amen"),

	LOOP_AMEN_FULL("loop_amen_full"),

	LOOP_BREAKBEAT("loop_breakbeat"),

	LOOP_COMPUS("loop_compus"),

	LOOP_GARZUL("loop_garzul"),

	LOOP_INDUSTRIAL("loop_industrial"),

	LOOP_MIKA("loop_mika"),

	LOOP_SAFARI("loop_safari"),

	LOOP_TABLA("loop_tabla"),

	MISC_BURP("misc_burp"),

	MISC_CINEBOOM("misc_cineboom"),

	MISC_CROW("misc_crow"),

	PERC_BELL("perc_bell"),

	PERC_SNAP2("perc_snap2"),

	PERC_SNAP("perc_snap"),

	PERC_SWASH("perc_swash"),

	PERC_TILL("perc_till"),

	SN_DOLF("sn_dolf"),

	SN_DUB("sn_dub"),

	SN_ZOME("sn_zome"),

	TABLA_DHEC("tabla_dhec"),

	TABLA_GHE1("tabla_ghe1"),

	TABLA_GHE2("tabla_ghe2"),

	TABLA_GHE3("tabla_ghe3"),

	TABLA_GHE4("tabla_ghe4"),

	TABLA_GHE5("tabla_ghe5"),

	TABLA_GHE6("tabla_ghe6"),

	TABLA_GHE7("tabla_ghe7"),

	TABLA_GHE8("tabla_ghe8"),

	TABLA_KE1("tabla_ke1"),

	TABLA_KE2("tabla_ke2"),

	TABLA_KE3("tabla_ke3"),

	TABLA_NA("tabla_na"),

	TABLA_NA_O("tabla_na_o"),

	TABLA_NA_S("tabla_na_s"),

	TABLA_RE("tabla_re"),

	TABLA_TAS1("tabla_tas1"),

	TABLA_TAS2("tabla_tas2"),

	TABLA_TAS3("tabla_tas3"),

	TABLA_TE1("tabla_te1"),

	TABLA_TE2("tabla_te2"),

	TABLA_TE_M("tabla_te_m"),

	TABLA_TE_NE("tabla_te_ne"),

	TABLA_TUN1("tabla_tun1"),

	TABLA_TUN2("tabla_tun2"),

	TABLA_TUN3("tabla_tun3"),

	VINYL_BACKSPIN("vinyl_backspin"),

	VINYL_HISS("vinyl_hiss"),

	VINYL_REWIND("vinyl_rewind"),

	VINYL_SCRATCH("vinyl_scratch");

	private String name;

	Sample(final String name) {
		this.name = colonize(name);
	}

	public String getName() {
		return name;
	}
}
