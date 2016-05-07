package klaus31.music.demo.chorus;

import static klaus31.music.command.Sleep.HALF_BEAT;

import klaus31.music.SonglineList;
import klaus31.music.command.Sleep;
import klaus31.music.command.sample.PlaySample;
import klaus31.music.command.sample.PredefinedSample;
import klaus31.music.demo.music.Times;
import klaus31.music.theme.Theme;

public class Melody implements Theme {

	final SonglineList songlines = new SonglineList();

	public Melody() {
		final double[][] startEnd = { { 0, 0.05 }, { 0, 0.05 }, { 0, 0.05 }, { 0.05, 0.1 }, { 0, 0.05 } };
		Times.loop(startEnd.length, i -> {
			addGuitarBase(startEnd[i][0], startEnd[i][1], 0.2, 0.3, 0.5, HALF_BEAT);
			addGuitarBase(startEnd[i][0], startEnd[i][1], 0.15, 0.25, 0.45, new Sleep(0.65 / 2));
			addGuitarBase(startEnd[i][0], startEnd[i][1], 0.15, 0.2, 0.4, new Sleep(0.35 / 2));
			addGuitarBase(startEnd[i][0], startEnd[i][1], 0.15, 0.22, 0.3, HALF_BEAT);
			addGuitarBase(startEnd[i][0], startEnd[i][1], 0.3, 0.4, 0.6, HALF_BEAT);
		});
	}

	private void addGuitarBase(final double start, final double finish, final double rateA, final double rateB,
			final double rateC, final Sleep sleep) {
		final PlaySample guitarBase = new PlaySample(PredefinedSample.GUIT_HARMONICS);
		guitarBase.getCtrl().put("finish", finish);
		guitarBase.getCtrl().put("start", start);
		guitarBase.getCtrl().put("rate", rateA);
		songlines.add(guitarBase);
		guitarBase.getCtrl().put("rate", rateB);
		songlines.add(guitarBase);
		guitarBase.getCtrl().put("rate", rateC);
		songlines.add(guitarBase);
		songlines.add(sleep);
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
