package com.gof.model.application.exe06;

import java.util.List;

public class SistemaCorretoraAcoes {

	private OperacoesRealizadas op;
	private OrdensDeCompra orderCompra;
	private OrdensDeVenda orderVenda;
	private List<Usuario> usuarios;
	
	public void enviarNotificacao(Notificacao not) {
		for(Usuario user : usuarios)
			user.mandarNotificacao(not);
	}
}