public class WatchTimer {

	private static long tempoInicial;
	private static long tempoFinal;

	private WatchTimer() {}

	public static void start() {
		WatchTimer.tempoInicial = System.nanoTime();
	}

	public static String stop() {
		WatchTimer.tempoFinal = System.nanoTime();
		long dif = (tempoFinal - tempoInicial);
		return String.format("Tempo de execução: %01d mili", (dif/1000000));
	}
}
