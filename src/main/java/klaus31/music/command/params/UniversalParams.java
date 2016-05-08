package klaus31.music.command.params;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class UniversalParams {

	private final Map<String, Object> universalParams;

	public UniversalParams() {
		this.universalParams = new HashMap<>();
	}

	public UniversalParams put(final String key, final Object value) {
		this.universalParams.put(key, value);
		return this;
	}

	public String toApplyString() {
		return universalParams.keySet().stream().map(key -> Params.toApplyString(key, universalParams.get(key)))
				.collect(Collectors.joining());
	}

}
