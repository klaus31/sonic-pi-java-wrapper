package klaus31.music.demo;

import static klaus31.music.Synth.MOD_SINE;

import klaus31.music.SonglineList;
import klaus31.music.command.PlayNoteFactory;
import klaus31.music.command.Sleep;
import klaus31.music.command.params.Amp;
import klaus31.music.command.params.Pan;
import klaus31.music.command.params.PlayParamsCtrl;
import klaus31.music.theme.Theme;

public class MelodyC implements Theme {

	final SonglineList songlines = new SonglineList();

	@Override
	public SonglineList getSonglines() {
		final PlayParamsCtrl ctrlBassline = new PlayParamsCtrl();
		ctrlBassline.setPan(Pan.LEFT_HALF);
		final PlayParamsCtrl ctrlUpperline = new PlayParamsCtrl();
		ctrlUpperline.setPan(Pan.RIGHT_HALF).setAmp(Amp.QUIET);
		final PlayNoteFactory bassline = new PlayNoteFactory("G2", "major", ctrlBassline);
		final PlayNoteFactory upperline = new PlayNoteFactory("G5", "major", ctrlUpperline);
		songlines.add(bassline.createPlayChord(0).setSynth(MOD_SINE));
		songlines.add(upperline.createPlay(0));
		songlines.add(Sleep.QUARTER_BEAT);
		songlines.add(upperline.createPlay(0));
		songlines.add(Sleep.QUARTER_BEAT);
		songlines.add(upperline.createPlay(3));
		songlines.add(Sleep.HALF_BEAT);
		songlines.add(bassline.createPlayChord(1).setSynth(MOD_SINE));
		songlines.add(upperline.createPlay(1));
		songlines.add(Sleep.QUARTER_BEAT);
		songlines.add(upperline.createPlay(1));
		songlines.add(Sleep.QUARTER_BEAT);
		songlines.add(upperline.createPlay(4));
		songlines.add(Sleep.HALF_BEAT);
		songlines.add(upperline.createPlay(7));
		songlines.add(Sleep.QUARTER_BEAT);
		songlines.add(upperline.createPlay(6));
		songlines.add(Sleep.QUARTER_BEAT);
		songlines.add(upperline.createPlay(3));
		songlines.add(Sleep.QUARTER_BEAT);
		songlines.add(bassline.createPlayChord(4).setSynth(MOD_SINE));
		songlines.add(upperline.createPlay(4));
		songlines.add(Sleep.QUARTER_BEAT);
		songlines.add(upperline.createPlay(6));
		songlines.add(Sleep.HALF_BEAT);
		songlines.add(bassline.createPlayChord(4).setSynth(MOD_SINE));
		songlines.add(upperline.createPlay(4));
		songlines.add(Sleep.QUARTER_BEAT);
		songlines.add(upperline.createPlay(2));
		songlines.add(Sleep.ONE_BEAT);
		songlines.add(bassline.createPlayChord(0).setSynth(MOD_SINE));
		songlines.add(upperline.createPlayChord(0));
		songlines.add(Sleep.ONE_BEAT);
		songlines.add(upperline.createPlay(0));
		songlines.add(Sleep.ONE_BEAT);
		songlines.add(upperline.createPlay(3));
		songlines.add(Sleep.HALF_BEAT);
		songlines.add(Sleep.QUARTER_BEAT);
		songlines.add(bassline.createPlayChord(2).setSynth(MOD_SINE));
		songlines.add(upperline.createPlay(2));
		songlines.add(Sleep.HALF_BEAT);
		songlines.add(upperline.createPlay(1));
		songlines.add(Sleep.TWO_BEATS);
		songlines.add(bassline.createPlayChord(0).setSynth(MOD_SINE));
		return songlines;
	}

	@Override
	public Sleep getTotalBeats() {
		return songlines.getTotalBeats();
	}

}
