package com.gof.model.application.exe03;

public class DescontoComPorcentagem extends Desconto {

	public DescontoComPorcentagem(double valor) {
		this.setValor(valor);
	}
	
	@Override
	public double getValorDesconto(Item item) {
		return ((item.getPreco() * super.valorDesconto)/100);
	}
	
	private void setValor(double valorDesc) {
		super.valorDesconto = valorDesc;
	}
}