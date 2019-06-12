package applicationThree;

class Celula {
	public Object elemento; // Elemento inserido na celula.
	public Celula prox; // Aponta a celula prox.

	/**
	 * Construtor da classe.
	 */
	public Celula() {
		this(0);
	}

	/**
	 * Construtor da classe.
	 * @param elemento int inserido na celula.
	 */
	public Celula(Object elemento) {
      this.elemento = elemento;
      this.prox = null;
	}//end constructor()
}//end class Celula()
