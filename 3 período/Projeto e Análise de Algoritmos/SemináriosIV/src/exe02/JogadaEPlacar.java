package exe02;

public class JogadaEPlacar {

	private int placar;
	private Jogada jogada;

	public JogadaEPlacar(int placar, Jogada jogada) {
		this.placar = placar;
		this.jogada = jogada;
	}

	public int getPlacar() {
		return placar;
	}

	public Jogada getJogada() {
		return jogada;
	}
}