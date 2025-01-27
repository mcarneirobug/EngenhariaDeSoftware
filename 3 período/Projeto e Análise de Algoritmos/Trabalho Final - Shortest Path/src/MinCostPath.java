
public class MinCostPath {

	public static int find(int[][] A) {
		int[][] solution = new int[A.length][A.length];

		solution[0][0] = A[0][0];
		// preenche a primeira linha
		for (int i = 1; i < A.length; i++) {
			solution[0][i] = A[0][i] + solution[0][i - 1];
		}

		// preenche a primeira coluna
		for (int i = 1; i < A.length; i++) {
			solution[i][0] = A[i][0] + solution[i - 1][0];
		}

		// path will be either from top or left, choose which ever is minimum
		for (int i = 1; i < A.length; i++) {
			for (int j = 1; j < A.length; j++) {
				solution[i][j] = A[i][j] + Math.min(solution[i - 1][j], solution[i][j - 1]);
			}
		}

		for (int i = 1; i < A.length; i++) {
			for (int j = 1; j < A.length; j++) {
				Math.min(solution[i - 1][j], solution[i][j - 1]);
			}
		}
		return solution[A.length - 1][A.length - 1];
	}
}