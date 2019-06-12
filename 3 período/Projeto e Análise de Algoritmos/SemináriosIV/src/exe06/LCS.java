package exe06;

import java.util.Scanner;

public class LCS {

	private static Scanner sc = new Scanner(System.in);
	
	public static int find(char[] A, char[] B) {
		int[][] LCS = new int[A.length + 1][B.length + 1];
		String[][] solution = new String[A.length + 1][B.length + 1];

		for (int i = 0; i <= B.length; i++) {
			LCS[0][i] = 0;
			solution[0][i] = "0";
		}

		for (int i = 0; i <= A.length; i++) {
			LCS[i][0] = 0;
			solution[i][0] = "0";
		}

		for (int i = 1; i <= A.length; i++) {
			for (int j = 1; j <= B.length; j++) {
				if (A[i - 1] == B[j - 1]) {
					LCS[i][j] = LCS[i - 1][j - 1] + 1;
					solution[i][j] = "diagonal";
				} else {
					LCS[i][j] = Math.max(LCS[i - 1][j], LCS[i][j - 1]);
					if (LCS[i][j] == LCS[i - 1][j]) {
						solution[i][j] = "topo";
					} else {
						solution[i][j] = "esquerda";
					}
				}
			}
		}

		// código para imprimir o resultado
		String aux = solution[A.length][B.length];
		String resposta = "";
		int a = A.length, b = B.length;
		while (aux != "0") {
			if (solution[a][b] == "diagonal") {
				resposta = A[a - 1] + resposta;
				a--;
				b--;
			} else if (solution[a][b] == "esquerda") {
				b--;
			} else if (solution[a][b] == "topo") {
				a--;
			}
			aux = solution[a][b];
		}
		System.out.println(resposta);

		for (int i = 0; i <= A.length; i++) {
			for (int j = 0; j <= B.length; j++) {
				System.out.print(" " + LCS[i][j]);
			}
			System.out.println();
		}
		return LCS[A.length][B.length];
	}
	
	public static void runLCS() {
		System.out.print("Entre com uma sequência para X: ");
        String X = sc.next();
        System.out.print("Entre com outra sequência para Y: ");
        String Y = sc.next();
        System.out.println("\nLCS:" + find(X.toCharArray(), Y.toCharArray()));
	}
}