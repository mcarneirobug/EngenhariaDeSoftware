package app;

import java.util.Locale;
import java.util.Scanner;

public class ContaMain {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Conta conta = new Conta();
		
		conta.depositar(100);
		System.out.println("Entre com o identificador da sua conta: ");
		conta.setConta(sc.nextInt());
		System.out.println("Saldo atual: " + conta.getSaldo() + ", conta: "+ conta.getConta());
		
		System.out.println("\nEntre com o valor que deseja depositar: ");
		conta.depositar(sc.nextDouble());
		System.out.println("Saldo atualizado: " + conta.getSaldo());
		
		System.out.println("\nEntre com o valor que deseja sacar: ");

		if(conta.sacar(sc.nextDouble())) {
			System.out.println("Saldo atualizado: " + conta.getSaldo());
		} else {
			System.out.println("Voce nao tem saldo suficiente para sacar, saldo atual: " + conta.getSaldo());
		} //end else
		sc.close();
		System.exit(0);
	} //end main()
} //end class ContaMain()
