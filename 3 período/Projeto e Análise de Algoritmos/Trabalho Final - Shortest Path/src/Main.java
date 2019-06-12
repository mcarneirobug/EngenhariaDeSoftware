import java.util.Random;
import java.util.Scanner;

public class Main {

	private static Random rand = new Random();
	private static Scanner sc = new Scanner(System.in); 
	
	public static void main(String[] args) {
		
			int[][] m = new int[2500][2500];

			for (int i = 0; i < m.length; i++) {
				for (int j = 0; j < m.length; j++) {
					m[i][j] = rand.nextInt(1000) + 1;
				}
			}

			Runtime rt = Runtime.getRuntime();
			WatchTimer.start();
			System.out.println("Minimum Cost Path: " + MinCostPath.find(m));
			System.out.println(WatchTimer.stop());
			System.out.println("Máximo memória: " + (rt.maxMemory() - rt.freeMemory ()) / 1024 / 1024 + "MB");
			
			@SuppressWarnings("unused")
			String ler = sc.next();
			
			Runtime c = Runtime.getRuntime();
			WatchTimer.start();
			DijkstraAlgorithm.dijkstra(m, 0);
			System.out.println("\n" + WatchTimer.stop());
			System.out.println("Máximo memória: " + (c.maxMemory() - c.freeMemory()) / 1024 / 1024 + " MB");
		}
}