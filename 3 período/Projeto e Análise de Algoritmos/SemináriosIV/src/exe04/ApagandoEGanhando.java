package exe04;

import java.util.Random;

/**
 * ApagandoEGanhando - Algoritmo Guloso
 * 
 * @author mcarneiro
 */
public class ApagandoEGanhando {

	private static Random gerador = new Random();
	private int[] numeros;
	private int escolhas;

	public ApagandoEGanhando() {
	}

	public ApagandoEGanhando(int numeros, int escolhas) {
		this.numeros = new int[numeros];
		this.escolhas = escolhas;
		preencheVetor();
	}

	public void run() {
		int j = 0;
		// imprime os digitos que serao apagados
		System.out.println("Numeros escolhidos: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(this.numeros[i] + " ");
		}

		System.out.println("");
		System.out.println("Digitos a serem apagados: " + this.escolhas);
		// Seleciona os numeros
		while (j < escolhas) {
			int indexMenor = 0;
			for (int i = 0; i < numeros.length; i++) {
				if (numeros[i] < numeros[indexMenor] && numeros[i] != -1) {
					indexMenor = i;
				}
			}
			numeros[indexMenor] = -1;
			j++;
		}

		// imprime o total a ser levado
		System.out.println("Total a ser levado para casa: ");
		for (int i = 0; i < numeros.length; i++) {
			if (this.numeros[i] != -1) {
				System.out.print(this.numeros[i] + " ");
			}
		}
	}

	private void preencheVetor() {
		for (int i = 0; i < numeros.length; i++) {
			this.numeros[i] = gerarAleatorio();
		}
	}

	private int gerarAleatorio() {
		return 1 + gerador.nextInt(8);
	}
	
	public static void runAG() {
		ApagandoEGanhando ag = new ApagandoEGanhando(7, 3);
		ag.run();
	}
}