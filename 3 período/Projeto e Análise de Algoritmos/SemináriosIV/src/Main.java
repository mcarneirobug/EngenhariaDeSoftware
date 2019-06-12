import static exe01.unsortVetor.runUNSORT;
import static exe02.JogoVelha.runTicTacToe;
import static exe03.Knapsack01.runKnapsack01;
import static exe04.ApagandoEGanhando.runAG;
import static exe05.NRainhas.runQUEEN;
import static exe06.LCS.runLCS;
import static exe07.TarefasRealizadas.runTASK;
import static exe08.RunAll.runAll;

import java.util.Scanner;
/**
 * Main
 * @author mcarneiro
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int opcao;

		do {

			System.out.println("\n############# Menu ############# ");
			System.out.println("0. Encerrar o programa...");
			System.out.println("1. Reorganizar o vetor (divisao e conquista) ");
			System.out.println("2. Jogo da velha (backtracking) ");
			System.out.println("3. Ladrao (programação dinamica ou alg guloso) ");
			System.out.println("4. Apagando e Ganhando (alg guloso) ");
			System.out.println("5. Rainhas (backtracking) ");
			System.out.println("6. Sequencias X e Y (programacao dinamica) ");
			System.out.println("7. lista A de tarefas (alg guloso) ");
			System.out.println("8. Fibonacci, Matrix, Levenshtein (... programacao dinamica)");

			System.out.print("\nInsira a opcao desejada: ");
			opcao = sc.nextInt();

			switch (opcao) {
			case 0:
				break;
			case 1:
				runUNSORT();
				break;
			case 2:
				runTicTacToe();
				break;
			case 3:
				runKnapsack01(); // DP
				break;
			case 4:
				runAG();
				break;
			case 5:
				runQUEEN();
				break;
			case 6:
				runLCS();
				break;
			case 7:
				runTASK();
				break;
			case 8:
				runAll();
				break;
			default:
				System.out.println("ERROR: Opcao nao encontrada. ");
				break;
			}
		} while (opcao != 0);
		sc.close();
		System.exit(0);
	}
}