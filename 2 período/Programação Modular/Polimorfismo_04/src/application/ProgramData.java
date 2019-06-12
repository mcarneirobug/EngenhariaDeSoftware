package application;

import java.util.Scanner;
import entities.Data;

public class ProgramData {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Data date  = new Data(2019, 3, 27);
		Data date2 = new Data(2019, 3, 27);
		
		System.out.println("\n" + date.toString());
		System.out.println(date2.toString());
		
		isSame(date, date2);	
		date.setDia(28);
		System.out.println("\n" + date.toString());
		System.out.println(date2.toString());
		isSame(date, date2);
		
		sc.close();
		System.exit(0);
	}//end main()
	
	public static boolean isSame(Data date, Data date2) {
		if(date.equals(date2)) {
			System.out.println("They're the same.");
			return true;
		} else {
			System.out.println("They aren't the same.");
			return false;
		} //end else
	} //end isSame()
}//end class ProgramData()
