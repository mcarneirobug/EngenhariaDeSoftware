package com.gof.model.application.exe03;

import java.util.ArrayList;
import java.util.List;

public class Item {
	
	private Produto produto;
	@SuppressWarnings("unused")
	private double preco; 
	private List<Desconto> descontos;
	private int quantidade;
	private double frete;
	
	public Item() {}
	
	public Item(Produto produto, double preco, int quantidade, double frete) {
		this.setProduto(produto);
		this.setPreco(preco);
		this.setQuantidade(quantidade);
		this.setFrete(frete);
		this.descontos = new ArrayList<>();
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public double getPreco() {
		double descontoTot = 0.0;
		for(Desconto desc : descontos) {
			descontoTot += desc.getValorDesconto(this);
		}
		return (this.getPreco() + this.getFrete()) - descontoTot;
	}
	
	public void addDesconto(Desconto desconto) {
		descontos.add(desconto);
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public List<Desconto> getDescontos() {
		return descontos;
	}

	public void setDescontos(List<Desconto> descontos) {
		this.descontos = descontos;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getFrete() {
		return frete;
	}

	public void setFrete(double frete) {
		this.frete = frete;
	}
}