package com.gof.model.application.exe05;

public class Exe05_CheckOut {

	/**
	 * Para não violar o princípio Open Closed podemos definir o método
	 * receberFormaDePagamento sendo abstrato e a classe Cartão de Crédito podendo
	 * herdar da classe Pagamento e a classe que aceita dinheiro também. Dessa forma
	 * podemos dar mais extensibilidade para o código e podendo adicionar novas
	 * formas de pagamento sem ter que alterar o código e ocasionar possíveis bug.
	 */

	public void checkOut(Recibo recibo) {
		@SuppressWarnings("unused")
		Moeda total = Moeda.zero;
//		for(item : items) {
//			total += item.getPreco();
//			recibo.addItem(item);
	}
//		Pagamento p = receberFormaDePagamento(total);
//		recibo.addPagamento(p);
}
