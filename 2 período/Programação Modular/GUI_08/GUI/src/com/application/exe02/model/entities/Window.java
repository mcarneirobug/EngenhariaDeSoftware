package com.application.exe02.model.entities;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Window extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final float[] num = new float[2];
	private static final int[] operacao = new int[1];
	private JButton btnDivisao, btnMult, btnAdicao, btnSubt, btnResultado;
	private JLabel numero, multiplicacao, divisao, adicao, subtracao, resultado;
	
	public Window() {
		super("Calculadora");

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container cPane = this.getContentPane();
		cPane.setLayout(new GridLayout(10, 8));
		
		this.addWindowListener(new AppListener());
		
		numero    = new JLabel("Numero: ");
		adicao    = new JLabel("Adicao: ");
		subtracao = new JLabel("Subtracao: ");
		divisao   = new JLabel("Divisao: ");
		multiplicacao = new JLabel("Multiplicacao: ");
		resultado = new JLabel("Resultado: ");
		
		JTextField numEntrada = new JTextField(15);
		
		btnDivisao = new JButton("/");
		btnMult = new JButton("*");
		btnAdicao = new JButton("+");
		btnSubt = new JButton("-");
		btnResultado = new JButton("=");

		btnAdicao.addActionListener((e) -> {
			num[0] = Float.parseFloat(numEntrada.getText());
			operacao[0] = 1;
			numEntrada.setText("");
		});
		btnSubt.addActionListener((e) -> {
			num[0] = Float.parseFloat(numEntrada.getText());
			operacao[0] = 2;
			numEntrada.setText("");
		});
		btnDivisao.addActionListener((e) -> {
			num[0] = Float.parseFloat(numEntrada.getText());
			operacao[0] = 3;
			numEntrada.setText("");
		});
		btnMult.addActionListener((e) -> {
			num[0] = Float.parseFloat(numEntrada.getText());
			operacao[0] = 4;
			numEntrada.setText("");
		});
		btnResultado.addActionListener((e) -> {
			num[1] = Integer.parseInt(numEntrada.getText());
			switch (operacao[0]) {
			case 1:
				JOptionPane.showMessageDialog(null, num[0] + num[1]);
				break;
			case 2:
				JOptionPane.showMessageDialog(null, num[0] - num[1]);
				break;
			case 3:
				JOptionPane.showMessageDialog(null, num[0] / num[1]);
				break;
			case 4:
				JOptionPane.showMessageDialog(null, num[0] * num[1]);
				break;
			}
			numEntrada.setText("");
		});

		cPane.add(numero);
		cPane.add(numEntrada);
		cPane.add(adicao);
		cPane.add(btnAdicao);
		cPane.add(subtracao);
		cPane.add(btnSubt);
		cPane.add(multiplicacao);
		cPane.add(btnMult);
		cPane.add(divisao);
		cPane.add(btnDivisao);
		cPane.add(resultado);
		cPane.add(btnResultado);
		
		this.pack();
	}
	
	private class AppListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
}