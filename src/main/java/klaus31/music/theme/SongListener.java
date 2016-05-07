package klaus31.music.theme;

import java.util.List;
import java.util.Optional;

import klaus31.music.command.Command;

public interface SongListener {

	Optional<List<Command>> update(Command songline, Theme theme, int sizeOfOutputLines);

}
