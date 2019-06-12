package app;

import java.util.Scanner;

public class ConversoraMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Conversora conversora = new Conversora();
		double aux;
		
		System.out.println("Entre com o valor para converter Pes para Metros: ");
		aux = conversora.converterPesParaMetros(sc.nextDouble());
		System.out.printf("PesParaMetros: %.2f%n", aux);
		
		System.out.println("Entre com o valor para converter Pes para Polegadas: ");
		aux = conversora.converterPesParaPolegadas(sc.nextDouble());
		System.out.printf("PesParaPolegadas: %.2f%n", aux);
		
		System.out.println("Entre com o valor para converter Pes para Centimetros: ");
		aux = conversora.converterPesParaCentimetros(sc.nextDouble());
		System.out.printf("PesParaCentimetros: %.2f%n", aux);
		
		System.out.println("Entre com o valor para converter Polegadas para Metros: ");
		aux = conversora.converterPolegadasParaMetros(sc.nextDouble());
		System.out.printf("PolegadasParaMetros: %.2f%n", aux);
		
		System.out.println("Entre com o valor para converter Polegadas para Pes: ");
		aux = conversora.converterPolegadasParaPes(sc.nextDouble());
		System.out.printf("PolegadasParaPes: %.2f%n", aux);
		
		System.out.println("Entre com o valor para converter Polegadas para Centimetros: ");
		aux = conversora.converterPolegadasParaCentimetros(sc.nextDouble());
		System.out.printf("PolegadasParaCentimetros: %.2f%n", aux);
		
		System.out.println("Entre com o valor para converter Metros para Pes: ");
		aux = conversora.converterMetrosParaPes(sc.nextDouble());
		System.out.printf("MetrosParaPes: %.2f%n", aux);
		
		System.out.println("Entre com o valor para converter Metros para Polegadas: ");
		aux = conversora.converterMetrosParaPolegadas(sc.nextDouble());
		System.out.printf("MetrosParaPolegadas: %.2f%n", aux);
		
		System.out.println("Entre com o valor para converter Metros para Centimetros: ");
		aux = conversora.converterMetrosParaCentimetros(sc.nextDouble());
		System.out.printf("MetrosParaCentimetros: %.2f%n", aux);
		
		System.out.println("Entre com o valor para converter Centimetros para Pes: ");
		aux = conversora.converterCentimetrosParaPes(sc.nextDouble());
		System.out.printf("CentimetrosParaPes: %.2f%n", aux);
		
		System.out.println("Entre com o valor para converter Centimetros para Polegadas: ");
		aux = conversora.converterCentimetrosParaPolegadas(sc.nextDouble());
		System.out.printf("CentimetrosParaPolegadas: %.2f%n", aux);
		
		System.out.println("Entre com o valor para converter Centimetros para Metros: ");
		aux = conversora.converterCentimetrosParaMetros(sc.nextDouble());
		System.out.printf("CentimetrosParaMetros: %.2f%n", aux);
		
		sc.close();
		System.exit(0);
	} //end main()
} //end class ConversoraMain()
