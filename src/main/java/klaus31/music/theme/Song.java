package klaus31.music.theme;

import java.util.function.Consumer;

import klaus31.music.command.Command;
import klaus31.music.command.UseBpm;
import klaus31.music.command.sample.PlaySample;

public abstract class Song {

	private final SonglineList songlines;

	public Song() {
		songlines = new SonglineList();
		songlines.add(getBpmCommand());
	}

	protected void add(final Command sleep) {
		songlines.add(sleep);
	}

	protected void add(final PlaySample command) {
		songlines.add(command);
	}

	protected void add(final Theme theme) {
		theme.runInThread();
		songlines.addAll(theme.getSonglines());
		songlines.add(theme.getSonglines().getTotalBeats());
	}

	public void doWithSonglines(final Consumer<? super Songline> action) {
		songlines.forEach(action);
	}

	protected abstract UseBpm getBpmCommand();

}
