package klaus31.music.drums.hihat;

import static klaus31.music.command.sample.PredefinedSample.DRUM_CYMBAL_CLOSED;

import klaus31.music.command.Command;
import klaus31.music.command.Sleep;
import klaus31.music.command.sample.PlaySample;
import klaus31.music.command.sample.Sample;
import klaus31.music.demo.music.Times;
import klaus31.music.theme.SonglineList;

public class HiHatBase implements HiHat {

	SonglineList songlines = new SonglineList();

	public HiHatBase() {
		this(4, DRUM_CYMBAL_CLOSED, Sleep.QUARTER_BEAT);
	}

	public HiHatBase(final int loops, final PlaySample playCommand, final Command sleep) {
		Times.loop(loops, i -> {
			songlines.add(playCommand);
			songlines.add(sleep);
		});
	}

	public HiHatBase(final int loops, final Sample cymbal, final Sleep sleep) {
		this(loops, new PlaySample(cymbal), sleep);
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
