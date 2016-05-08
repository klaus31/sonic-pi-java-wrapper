package klaus31.music.command.params;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ParamsCtrl {

	public static ParamsCtrl createDefault() {
		return new ParamsCtrl(Amp.DEFAULT, Pan.DEFAULT, new HashMap<>());
	}

	private final Amp amp;
	private final Pan pan;

	private final Map<String, Object> universalParams;

	public ParamsCtrl(final Amp amp, final Pan pan, final Map<String, Object> universalParams) {
		this.amp = amp;
		this.pan = pan;
		this.universalParams = universalParams;
	}

	public ParamsCtrl createWithChangedAmp(final double factor) {
		return new ParamsCtrl(amp.createChanged(factor), pan, universalParams);
	}

	public ParamsCtrl createWithChangedPan(final Pan newPan) {
		return new ParamsCtrl(amp, newPan, universalParams);
	}

	public ParamsCtrl createWithToggledPan() {
		return new ParamsCtrl(amp, this.pan.createToggled(), universalParams);
	}

	public String toApplyString() {
		return amp.toApplyString() + pan.toApplyString() + universalParams.keySet().stream()
				.map(key -> Params.toApplyString(key, universalParams.get(key))).collect(Collectors.joining());
	}

}
