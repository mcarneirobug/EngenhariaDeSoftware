package com.gof.model.application.exe01;

public class Superintendente implements Setor {
	
	private String nome;
	private Diretor diretor;
	
	public Superintendente() {}

	public Superintendente(String nome, Diretor diretor) {
		this.setNome(nome);
		this.setDiretor(diretor);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Diretor getDiretor() {
		return diretor;
	}

	public void setDiretor(Diretor diretor) {
		this.diretor = diretor;
	}
	
	public void avaliar(Item item) {
		System.out.println(item);
	}
	
	public void isAprovado(Item item) {
		item.setAprovado(true);
	}
	
	public void encaminhar(Item item) {
		diretor.verificarOrc(item);
	}
}