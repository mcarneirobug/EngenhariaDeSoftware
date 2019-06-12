package app;

import java.util.Scanner;

public class PessoaMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Pessoa pessoa = new Pessoa();
		
		System.out.println("Entre com o seu nome: ");
		pessoa.setNome(sc.nextLine());
		
		System.out.println("Entre com o seu cpf: ");
		pessoa.setCpf(sc.nextLong());
		
		System.out.println("Entre com a sua idade: ");
		pessoa.setIdade(sc.nextInt());
		
		System.out.println("Entre com o seu sexo: (F/M)");
		pessoa.setSexo(sc.next().toUpperCase().charAt(0));
		
		System.out.println("\nNome: "+ pessoa.getNome() + ", CPF: "+ pessoa.getCpf() +
				", idade: " + pessoa.getIdade() + ", sexo: " + pessoa.getSexo() + "!");
		
		if(pessoa.isMaiorDeIdade()) {
			System.out.println("\n"+pessoa.getNome() + ", e' maior de idade. ");
		} //end if
		else {
			System.out.println("\n"+pessoa.getNome() + ", e' menor de idade. ");
		} //end else
		
		sc.close();
		System.exit(0);
	} //end main()
} //end class PessoaMain()
