package com.application.exe03.model.app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;

@SuppressWarnings("serial")
class AreaDeDesenho extends JComponent {
	BufferedImage img;
	int x2, y2;
	boolean isPrimeiraBolinha = true;
	Random r = new Random();

	public AreaDeDesenho() {
		img = new BufferedImage(200, 200, BufferedImage.TYPE_INT_RGB);
		Graphics2D ig2 = img.createGraphics();
		ig2.setBackground(Color.WHITE);
		ig2.clearRect(0, 0, img.getWidth(), img.getHeight());

		this.setSize(200, 200);
		this.setPreferredSize(new Dimension(200, 200));

		this.setBackground(Color.WHITE);
		this.setOpaque(true);

		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (isPrimeiraBolinha) {
					int x = e.getX();
					int y = e.getY();
					Graphics g = img.getGraphics();
					g.setColor(new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256)));
					g.fillOval(x, y, 10, 10);
					g.dispose();
					x2 = x;
					y2 = y;
					repaint();
					isPrimeiraBolinha = false;
				} else {
					int x = e.getX();
					int y = e.getY();
					Graphics g = img.getGraphics();
					g.setColor(new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256)));
					g.fillOval(x, y, 10, 10);
					
					g.setColor(new Color(0, 0, 0));
					g.drawLine(x, y, x2, y2);
					g.dispose();
					repaint();
					x2 = x;
					y2 = y;
				}
			}
		});
	}

	public void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}
}

@SuppressWarnings("serial")
public class AplicacaoCanvas extends JFrame {
	private JButton close = new JButton("Close");
	private AreaDeDesenho ades = new AreaDeDesenho();

	public AplicacaoCanvas() {
		super("Caixa de desenho");

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setLayout(new BorderLayout());
		this.getContentPane().add(close, BorderLayout.SOUTH);
		this.getContentPane().add(ades, BorderLayout.CENTER);

		close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		pack();
	}

	public static void main(String args[]) {
		new AplicacaoCanvas().setVisible(true);
	}
}