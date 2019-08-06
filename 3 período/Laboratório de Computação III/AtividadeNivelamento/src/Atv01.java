import java.util.Random;
import java.util.Scanner;

public class Atv01 {

	/*
	 * sandro.j@pucminas.br
	 * 
	 * Construa um algoritmo em Java que preenche um vetor de tamanho n com valores
	 * inteiros positivos de 0 a 9. Em seguida armazene em um segundo vetor de 10
	 * posições as quantidades de cada tipo de elemento do primeiro vetor.
	 */

	private static Scanner sc = new Scanner(System.in);
	private static Random gerador = new Random();

	public static void main(String[] args) {

		System.out.print("Entre com o tamanho do vetor: ");
		int n = sc.nextInt();
		System.out.println("");

		int vetor[] = new int[n];
		int vetor2[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = gerador.nextInt(9);
		}
		
		for (int j = 0; j < vetor.length; j++) {
			vetor2[vetor[j]]++;
		
		}
		// printar vetor
		for(int a = 0; a < vetor.length; a++) {
			System.out.print("[" + vetor[a] + "]");
		}
		System.out.println("\n");
		for(int b = 0; b < vetor2.length; b++) {
			System.out.print("[" + vetor2[b] + "]");
		}
	}
}