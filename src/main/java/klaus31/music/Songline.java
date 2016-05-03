package klaus31.music;

public class Songline {
	public static final Songline create(final String songline) {
		return new Songline(songline);
	}

	private final String songline;

	private Songline(final String songline) {
		this.songline = songline;
	}

	@Override
	public String toString() {
		return songline;
	}

}
