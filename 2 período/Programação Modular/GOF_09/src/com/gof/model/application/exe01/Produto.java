package com.gof.model.application.exe01;

public class Produto {

	private String nome;

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