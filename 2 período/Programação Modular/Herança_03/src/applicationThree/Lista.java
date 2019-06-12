package applicationThree;

/**
 * Lista dinamica
 */
class Lista {
	private Celula primeiro;
	private Celula ultimo;
	private int amount;

	/**
	 * Construtor da classe que cria uma lista sem elementos (somente no cabeca).
	 */
	public Lista() {
		primeiro = new Celula();
		ultimo = primeiro;
	}

	/**
	 * Insere um elemento na ultima posicao da lista.
    * @param x int elemento a ser inserido.
	 */
	public void inserirFim(Object x) {
		ultimo.prox = new Celula(x);
		ultimo = ultimo.prox;
		amount++;
	}

	/**
	 * Remove um elemento da primeira posicao da lista.
	 * @return resp int elemento a ser removido.
	 * @throws Exception Se a lista nao contiver elementos.
	 */
	public Object removerInicio() throws Exception {
		if (primeiro == ultimo) {
			throw new Exception("Erro ao remover (vazia)!");
		}

		Celula tmp = primeiro;
		primeiro = primeiro.prox;
		Object resp = primeiro.elemento;
		tmp.prox = null;
		tmp = null;
		this.amount--;
		return resp;
	}

	public int getAmount() {
		return this.amount;
	}//end getAmount()

	public void setAmount(int amount) {
		this.amount = amount;
	}//end setAmount()
}//end class Lista()
