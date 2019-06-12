package exe02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tabuleiro {

	List<Jogada> JogadaDisponivel;
	Scanner sc = new Scanner(System.in);
	int[][] tabuleiro = new int[3][3];

	public Tabuleiro() {}

	public boolean isFimDoJogo() {
		return (isXWon() || isOWon() || getAvailableStates().isEmpty());
	}

	public boolean isXWon() {
		if ((tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[0][0] == tabuleiro[2][2] && tabuleiro[0][0] == 1)
				|| (tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[0][2] == tabuleiro[2][0] && tabuleiro[0][2] == 1)) {
			return true;
		}
		for (int i = 0; i < 3; ++i) {
			if (((tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][0] == tabuleiro[i][2] && tabuleiro[i][0] == 1)
					|| (tabuleiro[0][i] == tabuleiro[1][i] && tabuleiro[0][i] == tabuleiro[2][i]
							&& tabuleiro[0][i] == 1))) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isOWon() {
		if ((tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[0][0] == tabuleiro[2][2] && tabuleiro[0][0] == 2)
				|| (tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[0][2] == tabuleiro[2][0] && tabuleiro[0][2] == 2)) {
			return true;
		}
		for (int i = 0; i < 3; ++i) {
			if ((tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][0] == tabuleiro[i][2] && tabuleiro[i][0] == 2)
					|| (tabuleiro[0][i] == tabuleiro[1][i] && tabuleiro[0][i] == tabuleiro[2][i]
							&& tabuleiro[0][i] == 2)) {
				return true;
			}
		}
		return false;
	}

	public List<Jogada> getAvailableStates() {
		JogadaDisponivel = new ArrayList<>();
		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < 3; ++j) {
				if (tabuleiro[i][j] == 0) {
					JogadaDisponivel.add(new Jogada(i, j));
				}
			}
		}
		return JogadaDisponivel;
	}

	public void placeAMove(Jogada Jogada, int player) throws ArrayIndexOutOfBoundsException {
		tabuleiro[Jogada.getX()][Jogada.getY()] = player; // player = 1 for X, 2 for O
	}

	public Jogada returnBestMove() {
		int MAX = -100000;
		int best = -1;

		for (int i = 0; i < rootsChildrenScores.size(); ++i) {
			if (MAX < rootsChildrenScores.get(i).getPlacar()) {
				MAX = rootsChildrenScores.get(i).getPlacar();
				best = i;
			}
		}
		return rootsChildrenScores.get(best).getJogada();
	}

	public void takeHumanInput() {
		System.out.println("Sua vez: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		Jogada Jogada = new Jogada(x, y);
		placeAMove(Jogada, 2);
		sc.close();
	}

	public void mostrarTabuleiro() {
		System.out.println();
		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < 3; ++j) {
				System.out.print(tabuleiro[i][j] + " ");
			}
			System.out.println();
		}
	}

	public int returnMin(List<Integer> list) {
		int min = Integer.MAX_VALUE;
		int index = -1;
		for (int i = 0; i < list.size(); ++i) {
			if (list.get(i) < min) {
				min = list.get(i);
				index = i;
			}
		}
		return list.get(index);
	}

	public int returnMax(List<Integer> list) {
		int max = Integer.MIN_VALUE;
		int index = -1;
		for (int i = 0; i < list.size(); ++i) {
			if (list.get(i) > max) {
				max = list.get(i);
				index = i;
			}
		}
		return list.get(index);
	}

	List<JogadaEPlacar> rootsChildrenScores;

	public void callMinimax(int depth, int turn) {
		rootsChildrenScores = new ArrayList<>();
		minimax(depth, turn);
	}

	Jogada computersMove;

	public int minimax(int depth, int turn) {
		if (isXWon())
			return +1;
		if (isOWon())
			return -1;

		List<Jogada> JogadasDisponiveis = getAvailableStates();
		if (JogadasDisponiveis.isEmpty())
			return 0;

		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

		for (int i = 0; i < JogadasDisponiveis.size(); ++i) {
			Jogada Jogada = JogadasDisponiveis.get(i);
			if (turn == 1) {
				placeAMove(Jogada, 1);
				int currentScore = minimax(depth + 1, 2);
				max = Math.max(currentScore, max);

				if (depth == 0)
					System.out.println("Pontuação para posição " + (i + 1) + " = " + currentScore);
				if (currentScore >= 0) {
					if (depth == 0)
						computersMove = Jogada;
				}
				if (currentScore == 1) {
					tabuleiro[Jogada.getX()][Jogada.getY()] = 0;
					break;
				}
				if (i == JogadasDisponiveis.size() - 1 && max < 0) {
					if (depth == 0)
						computersMove = Jogada;
				}
			} else if (turn == 2) {
				placeAMove(Jogada, 2);
				int currentScore = minimax(depth + 1, 1);
				min = Math.min(currentScore, min);
				if (min == -1) {
					tabuleiro[Jogada.getX()][Jogada.getY()] = 0;
					break;
				}
			}
			tabuleiro[Jogada.getX()][Jogada.getY()] = 0; // Reset this Jogada
		}
		return turn == 1 ? max : min;
	}
}