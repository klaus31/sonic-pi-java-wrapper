package klaus31.music.demo.solo;

import klaus31.music.SonglineList;
import klaus31.music.command.Command;
import klaus31.music.command.Sleep;
import klaus31.music.command.params.UniversalParam;
import klaus31.music.command.sample.PlaySample;
import klaus31.music.command.sample.PredefinedSample;
import klaus31.music.demo.music.Times;
import klaus31.music.theme.Theme;

public class Drum implements Theme {

	private final SonglineList songlines = new SonglineList();

	@Override
	public SonglineList getSonglines() {
		final Command bass = new PlaySample(PredefinedSample.DRUM_BASS_SOFT);
		final PlaySample snare = new PlaySample(PredefinedSample.DRUM_SNARE_SOFT);
		final Command cymbal = new PlaySample(PredefinedSample.DRUM_CYMBAL_CLOSED);
		final PlaySample cynbalOpen = new PlaySample(PredefinedSample.DRUM_CYMBAL_OPEN);
		final PlaySample roll = new PlaySample(PredefinedSample.DRUM_ROLL);
		roll.getCtrl() // @formatter:off
				.add(new UniversalParam("finish", 0.3)) 
				.add(new UniversalParam("release", 0.5))
				.add(new UniversalParam("attack", 0.2)); // @formatter:on

		Times.loop(3, i -> {
			songlines.add(snare);
			songlines.add(Sleep.QUARTER_BEAT);
		});
		songlines.add(Sleep.QUARTER_BEAT);
		Times.loop(3, i -> {
			songlines.add(snare);
			songlines.add(Sleep.QUARTER_BEAT);
		});
		songlines.add(Sleep.QUARTER_BEAT);
		songlines.add(bass);
		songlines.add(cymbal);
		songlines.add(Sleep.QUARTER_BEAT);
		songlines.add(cymbal);
		songlines.add(Sleep.QUARTER_BEAT);
		songlines.add(bass);
		songlines.add(cymbal);
		songlines.add(Sleep.QUARTER_BEAT);
		snare.getCtrl().changeAmp(2);
		songlines.add(snare);
		songlines.add(Sleep.QUARTER_BEAT);
		songlines.add(snare);
		songlines.add(Sleep.TWO_BEATS);
		songlines.add(cynbalOpen);
		songlines.add(Sleep.QUARTER_BEAT);
		songlines.add(roll);
		return songlines;
	}

	@Override
	public Sleep getTotalBeats() {
		return songlines.getTotalBeats();
	}

}
