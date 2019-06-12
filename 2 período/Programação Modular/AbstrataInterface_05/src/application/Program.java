package application;

import entities.data.Data;
import entities.data.Ordenador;

public class Program {

	public static final int MAX = 10;
	
	public static void main(String[] args) {
		
		Data[] data = new Data[MAX];
		Data[] auxData = new Data[MAX];
		int ano, mes, dia, i = 0;
		
		System.out.println("Lista original: ");
		while(i<data.length) {
			dia = (int)(Math.random() * 28);
			mes = (int)(Math.random() * 12);
			ano = 2000 + (int)(Math.random() * 100);
			if(dia != 0 && mes != 0 && ano != 0) {
				data[i] = new Data(ano, mes, dia);
				System.out.println(data[i].porExtenso());
				i++;
			}
		}
		
		auxData = (Data[]) Ordenador.crescente(data);
		System.out.println();
		System.out.println("Lista crescente: ");
		show(auxData);
		
		auxData = (Data[]) Ordenador.decrescente(data);
		System.out.println();
		System.out.println("Lista decrescente: ");
		show(auxData);
		
		System.exit(0);
	}
	
	public static void show(Data [] data) {
		for(int i=0;i<data.length;i++) {
			System.out.println(""+data[i].porExtenso());
		}
	}
}