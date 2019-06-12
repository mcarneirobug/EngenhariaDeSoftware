package com.gof.model.application.exe01;

public class ChefeDeDepartamento implements Setor {
	
	private String nome;
	private Superintendente superIntendente;
	private CentroDeCusto centroDeCusto;
	
	public ChefeDeDepartamento(String nome, Superintendente superIntendente, CentroDeCusto centroDeCusto) {
		this.setNome(nome);
		this.setSuperIntendente(superIntendente);
		this.setCentroDeCusto(centroDeCusto);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Superintendente getSuperIntendente() {
		return superIntendente;
	}

	public void setSuperIntendente(Superintendente superIntendente) {
		this.superIntendente = superIntendente;
	}

	public CentroDeCusto getCentroDeCusto() {
		return centroDeCusto;
	}

	public void setCentroDeCusto(CentroDeCusto centroDeCusto) {
		this.centroDeCusto = centroDeCusto;
	}
	
	public void isCompraAprovada(Item item) {
		item.setAprovado(true);
	}
	
	public void realizarCompra(Item item) {
		if(item.getPreco() <= centroDeCusto.getOrcamento()) {
			this.isCompraAprovada(item);
		} else {
			superIntendente.avaliar(item);
			System.out.println("Valor maximo ultrapassado. ");
		}
	}
	
	@Override
	public boolean isAprovado(Compra compra) {
		if(compra.getPreco() <= centroDeCusto.getOrcamento())
			return true;
		else 
			this.setProx(superIntendente, compra);
		return false;
	}
}