package klaus31.music.command.params;

public class UniversalParam implements Param {

	private final String key;
	private final Object value;

	public UniversalParam(final String key, final Object value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public String toApplyString() {
		return Params.toApplyString(key, value);
	}
}
