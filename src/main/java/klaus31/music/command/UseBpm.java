package klaus31.music.command;

public class UseBpm implements Command {

	private final int number;

	public UseBpm(final int number) {
		this.number = number;
	}

	@Override
	public String format() {
		return String.format("use_bpm %d", number);
	}
}