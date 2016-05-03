package klaus31.music.command.params;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ParamsCtrlCommon {

	private Amp amp = Amp.DEFAULT;
	private Pan pan = Pan.DEFAULT;
	private final List<UniversalParam> universalParams = new ArrayList<>();

	public ParamsCtrlCommon add(final UniversalParam universalParam) {
		universalParams.add(universalParam);
		return this;
	}

	public ParamsCtrlCommon changeAmp(final double factor) {
		this.amp = amp.createChanged(factor);
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
		return amp.toApplyString() + pan.toApplyString()
				+ universalParams.stream().map(param -> param.toApplyString()).collect(Collectors.joining());
	}

	public ParamsCtrlCommon togglePan() {
		this.pan = this.pan.createToggled();
		return this;
	}

}
