package com.gof.model.application.exe01;

public class Funcionario implements Setor {
	
	private String nome;
	private ChefeDeDepartamento chefeDepartamento;
	
	public Funcionario(String nome, ChefeDeDepartamento chefeDepartamento) {
		this.setNome(nome);
		this.setChefeDepartamento(chefeDepartamento);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ChefeDeDepartamento getChefeDepartamento() {
		return chefeDepartamento;
	}

	public void setChefeDepartamento(ChefeDeDepartamento chefeDepartamento) {
		this.chefeDepartamento = chefeDepartamento;
	}
	
	public void realizarPedido(Item item) {
		if(item == null) {
			System.out.println("Item nao pode ter valor null. ");
		} else {
			chefeDepartamento.realizarCompra(item);
		}
	}
}