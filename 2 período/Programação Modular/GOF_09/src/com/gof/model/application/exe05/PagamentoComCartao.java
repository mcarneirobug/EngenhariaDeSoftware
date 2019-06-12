package com.gof.model.application.exe05;

public class PagamentoComCartao extends Pagamento {
	
	@Override
	public void receberFormaDePagamento(double total) {
		System.out.println("Pagamento com cartao: " + total);
	}
}