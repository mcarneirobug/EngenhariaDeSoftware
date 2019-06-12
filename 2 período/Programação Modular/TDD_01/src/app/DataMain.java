package app;

import java.util.Scanner;

public class DataMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Data data = new Data();
		System.out.println("Data atual: "+ data.getDia() + "/" + data.getMes() + "/" + data.getAno());
		
		System.out.println("Digite quantos dias deseja acrescentar? ");
		data.adicionaDias(sc.nextInt());
			
		System.out.println("Data atualizada: " + data.diaDaSemana() + ", do mês " + data.getMes() +
						   " tem " + data.diasNoMes() + " dias.");	
		sc.close();
		System.exit(0);
	}//end main()
}//end DataMain()
