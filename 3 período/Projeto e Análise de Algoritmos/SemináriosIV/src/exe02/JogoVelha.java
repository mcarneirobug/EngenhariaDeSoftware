package exe02;

import java.util.Random;

public class JogoVelha {
	public static void runTicTacToe() {
		System.out.println("Tic Tac Toe");
		Tabuleiro tabuleiro = new Tabuleiro();
		Random gerador = new Random();

		tabuleiro.mostrarTabuleiro();

		System.out.println("Indique quem inicia:\n\n1. Computador 2. Usuário: ");
		int choice = tabuleiro.sc.nextInt();
		if (choice == 1) {
			Jogada p = new Jogada(gerador.nextInt(3), gerador.nextInt(3));
			tabuleiro.placeAMove(p, 1);
			tabuleiro.mostrarTabuleiro();
		}

		while (!tabuleiro.isFimDoJogo()) {
			System.out.println("Sua jogada: ");
			Jogada userMove = new Jogada(tabuleiro.sc.nextInt(), tabuleiro.sc.nextInt());
			try {
				tabuleiro.placeAMove(userMove, 2); // 2 for O and O is the user
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("ERROR: Você está tentando acessar uma posição do array que não existe." + e.getMessage());
			}
			tabuleiro.mostrarTabuleiro();
			if (tabuleiro.isFimDoJogo())
				break;

			tabuleiro.minimax(0, 1);

			tabuleiro.placeAMove(tabuleiro.computersMove, 1);
			tabuleiro.mostrarTabuleiro();
		}
		if (tabuleiro.isXWon()) { // se o X ganhar
			System.out.println("Ops...você perdeu. Jogue novamente!");
		} else if (tabuleiro.isOWon()) { // se o O ganhar
			System.out.println("Parabéns, você venceu!");
		} else { // se empatar
			System.out.println("Ops...empatou. Jogue novamente!");
		}
	}
}