package klaus31.music.demo.music;

import java.util.function.Consumer;

public class Times {

	public static void loop(final int times, final Consumer<Integer> consumer) {
		for (int i = 0; i < times; i++) {
			consumer.accept(i);
		}
	}

}
