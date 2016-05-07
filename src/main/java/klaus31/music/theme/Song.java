package klaus31.music.theme;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import klaus31.music.command.Command;
import klaus31.music.command.UseBpm;

public abstract class Song {

	private final List<String> outputLines;
	private final List<SongListener> songListeners;

	public Song() {
		outputLines = new ArrayList<>();
		songListeners = new ArrayList<>();
		outputLines.add(getBpmCommand().format());
	}

	protected void add(final Theme theme) {
		theme.runInThread();
		theme.getSonglines().forEach(songline -> {
			songListeners.forEach(songListener -> {
				final Optional<List<Command>> updateCommands = songListener.update(songline, theme, outputLines.size());
				if (updateCommands.isPresent()) {
					updateCommands.get().forEach(mixedInCommand -> {
						outputLines.add(mixedInCommand.format());
					});
				}
			});
			outputLines.add(songline.format());
		});
		outputLines.add(theme.getSonglines().getTotalBeats().format());
	}

	public void mixin(final SongListener songListener) {
		songListeners.add(songListener);
	}

	public void doWithSonglines(final Consumer<? super String> action) {
		outputLines.forEach(action);
	}

	protected abstract UseBpm getBpmCommand();

}
