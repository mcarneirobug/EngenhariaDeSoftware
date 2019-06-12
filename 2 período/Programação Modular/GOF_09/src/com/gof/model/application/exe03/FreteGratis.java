package com.gof.model.application.exe03;

public class FreteGratis extends Desconto {

	public FreteGratis() {}
	
	public FreteGratis(double valor) {
		this.setValor(valor);
	}
	
	@Override
	public double getValorDesconto(Item item) {
		item.setFrete(0.0);
		return 0.0;
	}
	
	private void setValor(double valor) {
		super.valorDesconto = valor;
	}
}