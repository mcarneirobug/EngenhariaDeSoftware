package com.gof.model.application.exe01;

public class Diretor implements Setor {
	
	private String nome;
	private PlanoDesenvolvimento plano;
	
	public Diretor(String nome, PlanoDesenvolvimento plano) {
		this.setNome(nome);
		this.setPlano(plano);
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public PlanoDesenvolvimento getPlano() {
		return plano;
	}
	
	public void setPlano(PlanoDesenvolvimento plano) {
		this.plano = plano;
	}	
	
	public void verificarOrc(Item item) {
		if(item.getPreco() > plano.getOrcamento()) {
			System.out.println("Orcamento ultrapassa o limite do plano. ");
		}
	}
	
	@Override
	public boolean isAprovado(Compra compra) {
		return compra.getPreco() <= plano.getOrcamento() ? true : false;
	}
}