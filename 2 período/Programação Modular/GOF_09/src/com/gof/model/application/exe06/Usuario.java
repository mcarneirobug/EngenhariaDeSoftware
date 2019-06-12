package com.gof.model.application.exe06;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private List<Notificacao> listNotificacao;
	
	public Usuario() {
		this.listNotificacao = new ArrayList<Notificacao>();
	}
	
	public void mandarNotificacao(Notificacao not) {
	}
}