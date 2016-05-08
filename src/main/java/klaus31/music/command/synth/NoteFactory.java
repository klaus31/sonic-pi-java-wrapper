package klaus31.music.command.synth;

import static klaus31.music.Rubyalizer.colonize;

public class NoteFactory {
	private final String tonic, name;

	public NoteFactory(final String tonic, final String name) {
		this.tonic = colonize(tonic);
		this.name = colonize(name);
	}

	public String createChord(final int number) {
		return createChord(number, name);
	}

	public String createChord(final int number, final String name) {
		return String.format("chord(scale(%s, %s)[%d], %s)", tonic, name, number % 9, colonize(name));
	}

	public String createNote(final int number) {
		return String.format("scale(%s, %s)[%d]", tonic, name, number % 9);
	}

}
