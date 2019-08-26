import java.io.IOException;
import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);
	private final static Arquivo ARQ_PATH = new Arquivo("ALUNO");

	public static void main(String[] args) throws IOException {

		int opcao;

		do {

			System.out.println();
            System.out.println("Sistema de cadastro de alunos: ");
			System.out.println("(0) - Parar. ");
			System.out.println("(1) - Inserir. ");
			System.out.println("(2) - Pesquisa ternária. ");
			System.out.println("(3) - Listar registros. ");
			System.out.println("(4) - Pesquisa binária. ");
			System.out.println("(5) - Pesquisa sequencial. ");

			System.out.print("\nEntre com a opcao desejada: ");
			opcao = sc.nextInt();

			switch (opcao) {
			case 0:
			case 1:
				Aluno a = new Aluno("Matheus", 20);
				Aluno b = new Aluno("Anna", 21);
				Aluno c = new Aluno("Raissa", 22);
				Aluno d = new Aluno("Vitao", 23);
                Aluno e = new Aluno("Douglas", 24);
                Aluno f = new Aluno("Sandro", 25);
                Aluno g = new Aluno("Bot0", 26);
                Aluno h = new Aluno("Bot1", 27);
                Aluno i = new Aluno("Bot2", 28);

				ARQ_PATH.salvarRegistro(a);
				ARQ_PATH.salvarRegistro(b);
				ARQ_PATH.salvarRegistro(c);
				ARQ_PATH.salvarRegistro(d);
                ARQ_PATH.salvarRegistro(e);
                ARQ_PATH.salvarRegistro(f);
                ARQ_PATH.salvarRegistro(g);
                ARQ_PATH.salvarRegistro(h);
                ARQ_PATH.salvarRegistro(i);

                System.out.println("\nDados inseridos com sucesso... ");
				break;
			case 2:
				searchTernario(ARQ_PATH);
				break;
			case 3:
				ARQ_PATH.listarArquivo();
				break;
			case 4:
				searchBinaria(ARQ_PATH);
				break;
			case 5:
				searchSequencial(ARQ_PATH);
				break;
			default:
				System.out.println("ERROR: Opcao inválida. ");
				break;
			}
		} while (opcao != 0);
		sc.close();
		System.exit(0);
	}

	public static void searchBinaria(Arquivo file) throws IOException {
        System.out.println("\nEntre com o código correspondente: ");
	    file.pesquisaBinary(sc.nextInt());
	}

	public static void searchTernario(Arquivo file) throws IOException {
        System.out.println("\nEntre com o código correspondente: ");
	    file.pesquisaTernaria(sc.nextInt());
	}
	
	public static void searchSequencial(Arquivo file) throws IOException {
        System.out.print("\nEntre com o nome correspondente: ");
	    file.pesquisaSequencial(sc.next());
	}
}