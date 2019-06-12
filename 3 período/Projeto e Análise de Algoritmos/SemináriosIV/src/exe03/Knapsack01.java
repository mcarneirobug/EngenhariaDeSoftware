package exe03;

public class Knapsack01 {

	/**
	 * @param W
	 * @param w
	 * @param v
	 * @param n
	 * @return o valor máximo que pode se colocar na mochila a partir da capacidade
	 */
	public static void knapSack(int W, int w[], int v[], int n) {
		int i, wt;
		int K[][] = new int[n + 1][W + 1];

		for (i = 0; i <= n; i++) {
			for (wt = 0; wt <= W; wt++) {
				if (i == 0 || wt == 0) {
					K[i][wt] = 0;
				} else if (w[i - 1] <= wt) {
					K[i][wt] = Math.max(v[i - 1] + K[i - 1][wt - w[i - 1]], K[i - 1][wt]);
				} else {
					K[i][wt] = K[i - 1][wt];

				}
			}
		}
		
		int resposta = K[n][W];
		System.out.println(resposta);
		
		wt = W;
		for(i = n; i > 0 && resposta > 0; i--) {
			if(resposta == K[i-1][wt]) {
				continue;
			} else {
				System.out.print(w[i-1] + " ");
				resposta -= v[i-1];
				wt -= w[i-1];
			}
		}
//		return K[n][W];
	}

	public static void runKnapsack01() {

		int v[] = new int [] {3, 60, 20}; //valores
		int w[] = new int [] {5, 90, 10}; //pesos
		
		int W = 200; //capacidade max
		int n = v.length;
		knapSack(W, w, v, n);
	}
}