package exe05;

import java.util.Scanner;

public class NRainhas {
	
	private static Scanner sc = new Scanner(System.in);
	private int[][] solucao;

	public NRainhas(int N) {
		solucao = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				solucao[i][j] = 0;
			}
		}
	}

	public void resolve(int N) {
		if (colocarQueens(0, N)) {
			//printar o resultado
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					System.out.print(" " + solucao[i][j]);
				}
				System.out.println();
			}
		} else {
			System.out.println("Não há solução. ");
		}
	}

	public boolean colocarQueens(int queen, int N) {
		
		if (queen == N) {
			return true;
		}
		
		for (int linha = 0; linha < N; linha++) {
			// verifica se pode colocar rainha na col/lin
			if (canPlace(solucao, linha, queen)) {
				// colocando a rainha
				solucao[linha][queen] = 1;
				// para prox rainha
				if (colocarQueens(queen + 1, N)) {
					return true;
				}
				solucao[linha][queen] = 0;
			}
		}
		return false;
	}

	// verifica se a rainha pode ser colocada
	public boolean canPlace(int[][] matriz, int linha, int coluna) {

		for (int i = 0; i < coluna; i++) {
			if (matriz[linha][i] == 1) {
				return false;
			}
		}
		// verificar diagonal superior
		for (int i = linha, j = coluna; i >= 0 && j >= 0; i--, j--) {
			if (matriz[i][j] == 1) {
				return false;
			}
		}

		// verificar diagonal inferior
		for (int i = linha, j = coluna; i < matriz.length && j >= 0; i++, j--) {
			if (matriz[i][j] == 1) {
				return false;
			}
		}
		return true;
	}

	public static void runQUEEN() {
		System.out.print("Entre com o N: ");
		int n = sc.nextInt();
		NRainhas queen = new NRainhas(n);
		queen.resolve(n);
	}
}