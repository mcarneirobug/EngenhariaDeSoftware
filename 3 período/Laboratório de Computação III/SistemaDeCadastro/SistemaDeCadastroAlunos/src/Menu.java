import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @author Matheus
 */

public class Menu {

	private static Scanner sc = new Scanner(System.in);
	private final static String nomeArquivo = "teste.txt";

	/**
	 * Funcao responsavel por fazer o backup dos dados
	 * 
	 * @param arquivo - arquivo original
	 * @param copy    - backup do arquivo original
	 * @throws IOException
	 */

	public static void backupDados(String arquivo, String copy) throws IOException {
		if (arquivo != null) {
			FileInputStream file = new FileInputStream(arquivo);
			@SuppressWarnings("resource")
			DataInputStream entrada = new DataInputStream(file);
			FileOutputStream backup = new FileOutputStream(copy);
			PrintStream saida = new PrintStream(backup);

			while (entrada.available() != 0) {
				@SuppressWarnings("deprecation")
				String line = entrada.readLine();
				saida.println(line);
			} // end while
			saida.flush();
			saida.close();
			backup.close();
		} else {
			System.out.println("ERRO: Arquivo invalido.");
		}
	}

	/**
	 * Funcao responsavel por fazer o backup dos objetos
	 * 
	 * @param arquivo - arquivo original
	 * @param copy    - backup do arquivo original
	 * @throws IOException
	 */

	private static void backupObjetos(String arquivo, String copy) throws IOException, ClassNotFoundException {
		if (arquivo != null) {
			FileInputStream fileInputStream = new FileInputStream(arquivo);
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

			FileOutputStream fileOutputStream = new FileOutputStream(copy);
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

			while (fileInputStream.available() != 0) {
				Aluno empr = (Aluno) objectInputStream.readObject();
				objectOutputStream.writeObject(empr);
				objectOutputStream.flush();
			} // end while
			objectInputStream.close();
			objectOutputStream.close();
			fileInputStream.close();
		} else {
			System.out.println("ERRO: Arquivo invalido. ");
		}
	}

	private static void gravarDados() {

		// Objetos utilizados na manipulacao do arquivo e seus dados
		FileOutputStream arqSaida;

		try (PrintStream saida = new PrintStream(arqSaida = new FileOutputStream(nomeArquivo, true))) {

			System.out.print("\nInforme o número de registros a serem gravados: ");
			int numRegistros = Teclado.readInt();

			// Adiciona os registros desejados
			for (int i = 0; i < numRegistros; i++) {
				System.out.print("\nInforme o código do aluno: ");
				int codigo = Teclado.readInt();
				System.out.print("Informe o nome: ");
				String nomeAluno = Teclado.readLine();
				System.out.print("Informe a idade do aluno: ");
				int idade = Teclado.readInt();

				String linha = codigo + " " + nomeAluno + " " + idade;
				saida.println(linha);
			}
			saida.flush();
			saida.close();
			arqSaida.close();

			System.out.println("\nDados Gravados com sucesso");
		} catch (Exception e) { // Tratamento generico da excessão ocorrida
			System.out.println("O seguinte erro ocorreu: " + e.toString());
		}
	}

	/**
	 * Método responsável por gravar objetos dentro do arquivo
	 */
	private static void gravarObjetos() {

		try (ObjectOutputStream saida = new ObjectOutputStream(new FileOutputStream(nomeArquivo, true))) {

			System.out.print("Informe o número de registros a serem gravados: ");
			int numRegistros = Teclado.readInt();

			// Adiciona os registros desejados
			for (int i = 0; i < numRegistros; i++) {

				System.out.print("\nInforme o código de aluno: ");
				int codigo = Teclado.readInt();
				System.out.print("Informe o nome do aluno: ");
				String nome = Teclado.readLine();
				System.out.print("Informe a idade do aluno: ");
				int idade = Teclado.readInt();

				Aluno aluno = new Aluno(codigo, nome, idade);
				// grava o objeto aluno no arquivo
				saida.writeObject(aluno);
			} // end for

			System.out.println("\nDados gravados com sucesso...");
		} catch (FileNotFoundException e) {
			System.out.println("O arquivo informado nao existe.\n" + e.toString());
		} catch (IOException e) {
			System.out.println("O seguinte erro de I/O ocorreu:\n" + e.toString());
		} catch (Exception e) { // Tratamento generico da excessão ocorrida
			System.out.println("O seguinte erro ocorreu: " + e.toString());
		}
	}

	/**
	 * 
	 */
	private static void pesquisaObjetos() {

		int numRegPesquisados = 0;
		FileInputStream arqEntrada;

		try (ObjectInputStream in = new ObjectInputStream(arqEntrada = new FileInputStream(nomeArquivo))) {

			System.out.print("Digite o nome ou idade do aluno(a) a ser pesquisado: ");
			String nome = Teclado.readLine();

			// Realiza a pesquisa no arquivo
			while (arqEntrada.available() != 0) {

				Aluno empr = (Aluno) in.readObject();
				// empr.getClass().getMethod("get" + "Nome", );
				numRegPesquisados++;
				if (empr.getNome().startsWith(nome)) {
					System.out.println(empr);
					break;
				}
			}

			System.out.println("Registro encontrado!\n");

		} catch (FileNotFoundException e) {
			System.out.println("O arquivo informado não existe.\n" + e.toString());
		} catch (EOFException e) {
			System.out.println("Registro não encontrado!\n");
		} catch (ClassNotFoundException e) {
			System.out.println("O seguinte erro ocorreu: " + e.toString());
		} catch (IOException e) {
			System.out.println("O seguinte erro ocorreu: " + e.toString());
		}
		System.out.println("Num. Registros Pesquisados: " + numRegPesquisados);
	}

	private static void pesquisaDados() {

		int numRegPesquisados = 0;
		@SuppressWarnings("unused")
		FileInputStream arqEntrada;

		try (DataInputStream entrada = new DataInputStream(new FileInputStream(nomeArquivo))) {

			System.out.print("Digite o nome ou idade do aluno(a) a ser pesquisado: ");
			String nome = Teclado.readLine();

			boolean registroEncontrado = false;

			// Realiza a pesquisa no arquivo
			while (entrada.available() != 0) {

				@SuppressWarnings("deprecation")
				String linha = entrada.readLine();
				StringTokenizer listaPalavras = new StringTokenizer(linha); // Pega uma linha e gera um vetor com as
																			// palavras desta linha
				@SuppressWarnings("unused")
				String codigoLinha = listaPalavras.nextToken();
				String nomeLinha = listaPalavras.nextToken();
				@SuppressWarnings("unused")
				String idadeLinha = listaPalavras.nextToken();

				numRegPesquisados++;

				if (nomeLinha.startsWith(nome)) {
					System.out.println(linha);
					System.out.println("Registro encontrado!\n");
					registroEncontrado = true;
					break;
				}
			}
			if (!registroEncontrado)
				System.out.println("Registro nao encontrado!\n");
		} catch (FileNotFoundException e) {
			System.out.println("O arquivo informado não existe.\n" + e.toString());
		} catch (NumberFormatException e) {
			System.out.println("Ocorreu o seguinte erro: " + e.toString());
		} catch (IOException e) {
			System.out.println("Ocorreu o seguinte erro: " + e.toString());
		}
		System.out.println("Num. Registros Pesquisados: " + numRegPesquisados);
	}

	/**
	 * Método responsável por fazer o backup do arquivo
	 */
	private static void salvarArquivo() {

		System.out.print("\nDeseja fazer backup do arquivo? (y/n) ");
		char answer = sc.next().toLowerCase().charAt(0);
		try {
			// verifica o que foi digitado pelo usuário
			if (answer == 'y') {

				System.out.print("\nInforme o nome do arquivo a ser gravado (nome.txt): ");
				String nomeBackup = Teclado.readLine();

				// define se quer gravar objeto ou dados
				System.out.println("\nDeseja gravar dados ou objetos? (d/o)");
				char ch = sc.next().toLowerCase().charAt(0);
				if (ch == 'd') {
					// método responsável por fazer o backup
					backupDados(nomeArquivo, nomeBackup);
				} else {
					backupObjetos(nomeArquivo, nomeBackup);
				}

				System.out.println("\nBackup realizado com sucesso...");
			} else {
				System.out.println("AVISO: Backup não será realizado. ");
			}
		} catch (IOException e) {
			System.out.println("Ocorreu o seguinte erro: " + e.toString());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Método responsável por gerar estatísticas lidas no arquivo
	 */
	@SuppressWarnings("unused")
	private static void gerarEstatisticas() {

		FileInputStream arqEntrada;
		int numRegPesquisados = 0;

		// dados para estatística
		int qtdeTotalAlunos = 0; // pega a quantidade total de alunos
		int somaIdade = 0;
		int maiorIdade = 0;
		int mediaIdade = 0;

		try (DataInputStream entrada = new DataInputStream(arqEntrada = new FileInputStream(nomeArquivo))) {

			// Realiza a pesquisa no arquivo
			while (entrada.available() != 0) {

				@SuppressWarnings("deprecation")
				String linha = entrada.readLine();
				StringTokenizer listaPalavras = new StringTokenizer(linha); // Pega uma linha e gera um vetor com as
																			// palavras desta linha
				String codigoLinha = listaPalavras.nextToken();
				String nomeLinha = listaPalavras.nextToken();
				String idadeLinha = listaPalavras.nextToken();

				// Salva os dados estatisticos

				// converte a idade lida para inteiro e armazena
				int idade = Integer.parseInt(idadeLinha);
				qtdeTotalAlunos++;
				somaIdade += idade;

				// verifica quem tem a maior idade
				if (maiorIdade < idade) {
					maiorIdade = idade;
				}
				numRegPesquisados++;
			}
			// calcula a média
			mediaIdade = (somaIdade / qtdeTotalAlunos);
		} catch (FileNotFoundException e) {
			System.out.println("O arquivo informado não existe.\n" + e.toString());
		} catch (IOException e) {
			System.out.println("O seguinte erro ocorreu: " + e.toString());
		}

		System.out.println("");
		System.out.println("Arquivo com estatísticas: ");
		System.out.println("N.A - Número de alunos: " + qtdeTotalAlunos);
		System.out.println("I.M - Idade média: " + mediaIdade);
		System.out.println("M.I - Maior idade: " + maiorIdade);
		System.out.println("\nRegistros testados: " + numRegPesquisados);
	}

	/**
	 * Método responsável por chamar duas funções func - gravarDados() func -
	 * gravarObjetos()
	 */
	private static void gravar() {
		System.out.print("\nDeseja gravar dados ou objetos? (d/o) ");
		char ch = sc.next().toLowerCase().charAt(0);
		if (ch == 'd') {
			gravarDados();
		} else {
			gravarObjetos();
		}
	}

	/**
	 * Método responsável por chamar duas funções func - pesquisaDados() func -
	 * pesquisaObjetos()
	 */
	private static void pesquisar() {
		System.out.print("\nDeseja pesquisar dados ou objetos? (d/o) ");
		char ch = sc.next().toLowerCase().charAt(0);
		if (ch == 'd') {
			pesquisaDados();
		} else {
			pesquisaObjetos();
		}
	}

	public static void main(String[] args) {

		int opcao = 0;

		do {

			System.out.println("");
			System.out.println("Sistema de cadastro de alunos: ");
			System.out.println("(0) Sair. ");
			System.out.println("(1) Inserir (Sequencial). ");
			System.out.println("(2) Pesquisar por nome ou idade. ");
			System.out.println("(3) Salvar arquivo como...");
			System.out.println("(4) Gerar estatísticas. ");
			System.out.println("");

			System.out.print("Entre com a opcao desejada: ");
			opcao = sc.nextInt();

			switch (opcao) {
			case 0:
				System.out.println("Encerrando programa...");
				break;
			case 1:
				gravar();
				break;
			case 2:
				pesquisar();
				break;
			case 3:
				salvarArquivo();
				break;
			case 4:
				gerarEstatisticas();
				break;
			default:
				System.out.println("ERROR: Não contém essa opcao!");
				break;
			}
		} while (opcao != 0);
		sc.close();
		System.exit(0);
	}
}