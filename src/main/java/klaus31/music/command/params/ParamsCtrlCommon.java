package klaus31.music.command.params;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ParamsCtrlCommon {

	private Amp amp = Amp.DEFAULT;
	private Pan pan = Pan.DEFAULT;
	private final Map<String, Object> universalParams = new HashMap<>();

	public ParamsCtrlCommon changeAmp(final double factor) {
		this.amp = amp.createChanged(factor);
		return this;
	}

	public ParamsCtrlCommon put(final String key, final Object value) {
		universalParams.put(key, value);
		return this;
	}

	public ParamsCtrlCommon setAmp(final Amp newAmp) {
		this.amp = newAmp;
		return this;
	}

	public ParamsCtrlCommon setPan(final Pan newPan) {
		this.pan = newPan;
		return this;
	}

	public String toApplyString() {
		return amp.toApplyString() + pan.toApplyString() + universalParams.keySet().stream()
				.map(key -> Params.toApplyString(key, universalParams.get(key))).collect(Collectors.joining());
	}

	public ParamsCtrlCommon togglePan() {
		this.pan = this.pan.createToggled();
		return this;
	}

}
