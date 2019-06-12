package com.gof.model.application.exe01;

public class Compra {
	
	public double preco;

	public Compra() {}
	
	public Compra(double preco) {
		this.setPreco(preco);
	}
	
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}