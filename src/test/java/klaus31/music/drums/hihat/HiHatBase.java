package klaus31.music.drums.hihat;

import klaus31.music.SonglineList;
import klaus31.music.command.Command;
import klaus31.music.command.Sleep;
import klaus31.music.command.sample.PlaySample;
import klaus31.music.command.sample.PredefinedSample;
import klaus31.music.demo.music.Times;

public class HiHatBase implements HiHat {

	SonglineList songlines = new SonglineList();

	public HiHatBase() {
		final Command cymbal = new PlaySample(PredefinedSample.DRUM_CYMBAL_CLOSED);
		Times.loop(4, i -> {
			songlines.add(cymbal);
			songlines.add(Sleep.QUARTER_BEAT);
		});
	}

	@Override
	public SonglineList getSonglines() {
		return songlines;
	}

	@Override
	public Sleep getTotalBeats() {
		return songlines.getTotalBeats();
	}

}
