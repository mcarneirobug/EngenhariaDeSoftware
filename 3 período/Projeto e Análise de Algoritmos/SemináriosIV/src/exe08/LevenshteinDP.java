package exe08;

public class LevenshteinDP {

	public static int min(int x, int y, int z) {
		if (x <= y && x <= z) {
			return x;
		}
		if (y <= x && y <= z) {
			return y;
		} else {
			return z;
		}
	}

	public static int editDistDP(String str1, String str2, int m, int n) {
		int dp[][] = new int[m + 1][n + 1];

		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 0)
					dp[i][j] = j; // Min. operations = j
				else if (j == 0)
					dp[i][j] = i; // Min. operations = i

				else if (str1.charAt(i - 1) == str2.charAt(j - 1))
					dp[i][j] = dp[i - 1][j - 1];
				else
					dp[i][j] = 1 + min(dp[i][j - 1], // insira
							dp[i - 1][j], // remova
							dp[i - 1][j - 1]); // substituir
			}
		}
		return dp[m][n];
	}

	public static void runLevenshtein() {
		String str1 = "kitten";
		String str2 = "sitting";
		System.out.println(editDistDP(str1, str2, str1.length(), str2.length()));
		System.exit(0);
	}
}