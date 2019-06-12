package com.gof.model.application.exe05;

public class PagamentoDinheiro extends Pagamento {

	@Override
	public void receberFormaDePagamento(double total) {
		System.out.println("Pagamento com dinheiro: " + total);
	}
}