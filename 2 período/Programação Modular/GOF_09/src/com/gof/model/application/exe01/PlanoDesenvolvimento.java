package com.gof.model.application.exe01;

public class PlanoDesenvolvimento {
	
	private double orcamento;

	public PlanoDesenvolvimento() {}
	
	public PlanoDesenvolvimento(double orcamento) {
		this.setOrcamento(orcamento);
	}
	
	public double getOrcamento() {
		return orcamento;
	}

	public void setOrcamento(double orcamento) {
		this.orcamento = orcamento;
	}
}