package com.gof.model.application.exe03;

public abstract class Desconto {
	public double valorDesconto; 
	public abstract double getValorDesconto(Item item);
}