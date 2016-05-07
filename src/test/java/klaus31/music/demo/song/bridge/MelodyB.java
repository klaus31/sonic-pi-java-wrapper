package klaus31.music.demo.song.bridge;

import static klaus31.music.command.Sleep.HALF_BEAT;
import static klaus31.music.command.synth.PredefinedSynth.DULL_BELL;
import static klaus31.music.command.synth.PredefinedSynth.FM;

import klaus31.music.command.Sleep;
import klaus31.music.command.params.Pan;
import klaus31.music.command.synth.PlaySynth;
import klaus31.music.theme.SonglineList;
import klaus31.music.theme.Theme;

class MelodyB implements Theme {

	final SonglineList songlines = new SonglineList();

	public MelodyB() {
		int note = 55;
		final PlaySynth play = new PlaySynth(note);
		play.getCtrl().setPan(Pan.LEFT_ALMOST);
		while (note++ < 65) {
			songlines.add(play.setSynth(note % 2 == 0 ? DULL_BELL : FM));
			songlines.add(HALF_BEAT);
			play.setNote(note).getCtrl().togglePan();
		}
	}

	@Override
	public SonglineList getSonglines() {
		return songlines;
	}

	@Override
	public Sleep getTotalBeats() {
		return new Sleep(5);
	}

}