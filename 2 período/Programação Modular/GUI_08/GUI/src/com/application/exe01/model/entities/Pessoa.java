package com.application.exe01.model.entities;

public class Pessoa {
	
	private String nome;
	private String sexo;
	private String idade;
	private String estadoCivil;
	
	public Pessoa() { 
	}
	
	public Pessoa(String nome, String sexo, String idade, String estadoCivil) {
		this.nome  = nome;
		this.sexo  = sexo;
		this.idade = idade;
		this.estadoCivil = estadoCivil;
	}
	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getIdade() {
		return this.idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.getNome() + ", Sexo: " + this.getSexo() +
				", Idade: " + this.getIdade() + ", Estado civil: " + this.getEstadoCivil(); 
	}
}