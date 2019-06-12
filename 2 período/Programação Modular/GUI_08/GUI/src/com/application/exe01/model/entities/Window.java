package com.application.exe01.model.entities;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Window extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel nomeLabel, sexoLabel, idadeLabel, estadoCivilLabel;
	private JTextField nome, sexo, idade, estadoCivil;
	private JButton btnOK, btnCancel;
	
	public Window() {
		super("Cadastro de Pessoa");
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container cPane = this.getContentPane();
		cPane.setLayout(new GridLayout(5, 2));
		
		this.addWindowListener(new AppListener());
		
		nomeLabel  = new JLabel("Nome: ");
		sexoLabel  = new JLabel("Sexo: ");
		idadeLabel = new JLabel("Idade: ");
		estadoCivilLabel = new JLabel("Estado Civil: ");
		
		nome  = new JTextField(30);
		sexo  = new JTextField(9);
		idade = new JTextField(3);
		estadoCivil = new JTextField(10);
		
		btnOK = new JButton("OK");
		btnCancel = new JButton("Cancelar");
		
		btnOK.addActionListener(new btnOKEvent());
		btnCancel.addActionListener(new btnCancelEvent());
		
		cPane.add(nomeLabel);
		cPane.add(nome);
		cPane.add(sexoLabel);
		cPane.add(sexo);
		cPane.add(idadeLabel);
		cPane.add(idade);
		cPane.add(estadoCivilLabel);
		cPane.add(estadoCivil);
		cPane.add(btnOK);
		cPane.add(btnCancel);
		
		this.pack();
	}
	
	public class btnOKEvent implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			Pessoa pessoa = new Pessoa(nome.getText(), sexo.getText(), idade.getText(), estadoCivil.getText());
			nome.setText("");
			sexo.setText("");
			idade.setText("");
			estadoCivil.setText("");
			
			JOptionPane.showMessageDialog(null, pessoa.toString(), "Cadastro realizado", JOptionPane.PLAIN_MESSAGE);
		}
	}
	
	public class btnCancelEvent implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			nome.setText("");
			sexo.setText("");
			idade.setText("");
			estadoCivil.setText("");
		}
	}
	
	private class AppListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
}
