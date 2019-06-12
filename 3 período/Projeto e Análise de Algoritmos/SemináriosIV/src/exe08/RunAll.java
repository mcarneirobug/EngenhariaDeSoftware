package exe08;

import static exe08.FibonacciDP.runFIB;
import static exe08.LevenshteinDP.runLevenshtein;
import static exe08.MatrixDP.runMATRIX;

import java.util.Scanner;

public class RunAll {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void runAll() {
		char aux;
		System.out.print("F -> Fibonacci  \nL -> Levenshtein  \nM -> MATRIX");
		System.out.print("\nEntre com a opção deseja: ");
		aux = sc.next().toLowerCase().charAt(0);
		if (aux == 'f') {
			runFIB();
		} else if (aux == 'l') {
			runLevenshtein();
		} else {
			runMATRIX();
		}
		sc.close();
	}
}
