package com.gof.model.application.exe03;

public class DescontoPadrao extends Desconto {

	public DescontoPadrao(double valor) {
		super.valorDesconto = valor;
	}
	
	@Override
	public double getValorDesconto(Item item) {
		return super.valorDesconto;
	}
}