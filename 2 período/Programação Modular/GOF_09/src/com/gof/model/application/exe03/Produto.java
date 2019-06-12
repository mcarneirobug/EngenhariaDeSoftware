package com.gof.model.application.exe03;

public class Produto {
	
	private String nome;
	
	public Produto() {}
	
	public Produto(String nome) {
		this.setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}