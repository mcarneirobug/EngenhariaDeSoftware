package com.gof.model.application.exe01;

public class Item {
	
	private Produto produto;
	private int quantidade;
	private int preco;
	private boolean isAprovado;
	
	public Item() {}
	
	public Item(Produto produto, int quantidade, int preco) {
		this.setProduto(produto);
		this.setQuantidade(quantidade);
		this.setPreco(preco);
		this.setAprovado(false);
	}

	public Produto getProduto() {
		return produto;
	}
	
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public int getPreco() {
		return preco;
	}
	
	public void setPreco(int preco) {
		this.preco = preco;
	}
	
	public boolean isAprovado() {
		return isAprovado;
	}

	public void setAprovado(boolean isAprovado) {
		this.isAprovado = isAprovado;
	}
}