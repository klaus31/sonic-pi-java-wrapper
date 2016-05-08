package klaus31.music.instruments;

import klaus31.music.command.sample.PlaySample;

public interface Drumkit {
	PlaySample getBass();

	PlaySample getCymbal();

	PlaySample getCymbalOpen();

	PlaySample getCymbalPedal();

	PlaySample getSnare();

	PlaySample getSplash();

	PlaySample getTomHi();

	PlaySample getTomLo();

	PlaySample getTomMid();
}
