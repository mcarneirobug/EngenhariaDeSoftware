package com.gof.model.application.exe01;

public interface Setor {
	
	default void setProx(Setor setor, Compra compra) {
		setor.isAprovado(compra);
	}
	
	default boolean isAprovado(Compra compra) {
		return false;
	}
}