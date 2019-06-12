package exe08;

import java.util.HashMap;
import java.util.Scanner;

public class FibonacciDP {

    private int n;
    private HashMap<Integer, Integer> hm = new HashMap<>();
    private static Scanner sc = new Scanner(System.in);
    
    public FibonacciDP(int n) {
        this.n = n;
    }

    /**
     * TopDown - DP
     * @param n
     * @return aux
     */

    public int dpTopDown(int n) {
        if(hm.containsKey(n))
            return hm.get(n);
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        int aux = dpTopDown(n-1) + dpTopDown(n-2);
        hm.put(n, aux);
        return aux;
    }

    /**
     * Bottom Up - DP
     * @return n
     */
    public int dpBottomUp() {
        hm.put(0, 0);
        hm.put(1, 1);

        for(int i = 2; i <= this.n; i++) {
            hm.put(i, hm.get(i-1) + hm.get(i-2));
        }
        return hm.get(this.n);
    }

//    public int fib() {
//
//        int f[] = new int[this.n+2];
//        int i;
//
//        f[0] = 0;
//        f[1] = 1;
//
//        for(i = 2; i <= this.n; i++) {
//            f[i] = f[i-1] + f[i-2];
//        }
//        return f[this.n];
//    }
    
    public static void runFIB() {
    	System.out.print("Entre com um valor para n: ");
		int n = sc.nextInt();
		FibonacciDP pm = new FibonacciDP(n);
		System.out.println("DP - BottomUP: " + pm.dpBottomUp());
		System.out.println("DP - TopDOWN: " +pm.dpTopDown(n));
		System.exit(0);
    }
}