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

	/**
	 * Funcao responsavel por fazer o backup dos dados
	 * 
	 * @param arquivo - arquivo original
	 * @param copy    - backup do arquivo original
	 * @throws IOException
	 */

	private static void backup(String arquivo, String copy) throws IOException, ClassNotFoundException {
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
	} // end backup()

	private static void gravarDados() {

		try {
			// Define o nome do arquivo a ser trabalhado
			System.out.print("Informe o nome do arquivo a ser gravado: ");
			String nomeArquivo = Teclado.readLine();

			// Objetos utilizados na manipulacao do arquivo e seus dados
			FileOutputStream arqSaida = new FileOutputStream(nomeArquivo);
			PrintStream saida = new PrintStream(arqSaida);

			System.out.print("Informe o n�mero de registros a serem gravados: ");
			int numRegistros = Teclado.readInt();

			// Adiciona os registros desejados
			for (int i = 0; i < numRegistros; i++) {
				System.out.print("\nInforme o c�digo do aluno: ");
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

			System.out.println("Dados Gravados com sucesso");
		} catch (Exception e) { // Tratamento generico da excess�o ocorrida
			System.out.println("O seguinte erro ocorreu: " + e.toString());
		}
	}

	/**
	 * M�todo respons�vel por gravar objetos dentro do arquivo
	 */
	private static void gravarObjetos() {

		System.out.print("Informe o nome do arquivo a ser gravado: (nome.txt) ");
		String nomeArquivo = Teclado.readLine();

		try (ObjectOutputStream saida = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {

			System.out.print("Informe o n�mero de registros a serem gravados: ");
			int numRegistros = Teclado.readInt();

			// Adiciona os registros desejados
			for (int i = 0; i < numRegistros; i++) {

				System.out.print("\nInforme o c�digo de aluno: ");
				int codigo = Teclado.readInt();
				System.out.print("Informe o nome do aluno: ");
				String nome = Teclado.readLine();
				System.out.print("Informe a idade do aluno: ");
				int idade = Teclado.readInt();

				Aluno aluno = new Aluno(codigo, nome, idade);
				// grava o objeto aluno no arquivo
				saida.writeObject(aluno);
			} // end for

			System.out.println("Deseja fazer backup do arquivo? (y/n)");
			char answer = sc.next().toLowerCase().charAt(0);

			// verifica o que foi digitado pelo usu�rio
			if (answer == 'y') {
				System.out.print("Informe o nome do arquivo a ser gravado: (nome.txt)");
				String nomeBackup = Teclado.readLine();
				// m�todo respons�vel por fazer o backup
				backup(nomeArquivo, nomeBackup);
			} else {
				System.out.println("AVISO: Backup n�o ser� realizado. ");
			}

			System.out.println("Dados gravados com sucesso...");
		} catch (FileNotFoundException e) {
			System.out.println("O Arquivo informado nao existe.\n" + e.toString());
		} catch (IOException e) {
			System.out.println("O seguinte erro de I/O ocorreu:\n" + e.toString());
		} catch (Exception e) { // Tratamento generico da excess�o ocorrida
			System.out.println("O seguinte erro ocorreu: " + e.toString());
		}
	}

	/**
	 * 
	 */
	private static void pesquisaObjetos() {

		// Define o nome do arquivo a ser trabalhado
		System.out.print("Informe o nome do arquivo a ser pesquisado: (nome.txt) ");
		String nomeArquivo = Teclado.readLine();
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
			System.out.println("O arquivo informado n�o existe.\n" + e.toString());
		} catch (EOFException e) {
			System.out.println("Registro n�o encontrado!\n");
		} catch (ClassNotFoundException e) {
			System.out.println("O seguinte erro ocorreu: " + e.toString());
		} catch (IOException e) {
			System.out.println("O seguinte erro ocorreu: " + e.toString());
		}
		System.out.println("Num. Registros Pesquisados: " + numRegPesquisados);
	}

	private static void pesquisaDados() {
		
		// Define o nome do arquivo a ser trabalhado
		System.out.print("Informe o nome do arquivo a ser pesquisado: ");
		String nomeArquivo = Teclado.readLine();
		int numRegPesquisados = 0;
		@SuppressWarnings("unused")
		FileInputStream arqEntrada;
		
		try (DataInputStream entrada = new DataInputStream(new FileInputStream(nomeArquivo))){

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
			System.out.println("O arquivo informado n�o existe.\n" + e.toString());
		} catch (NumberFormatException e) {
			System.out.println("Ocorreu o seguinte erro: " + e.toString());
		} catch (IOException e) {
			System.out.println("Ocorreu o seguinte erro: " + e.toString());
		}
		System.out.println("Num. Registros Pesquisados: " + numRegPesquisados);
	}

	private static void salvarArquivo() {

	}

	/**
	 * M�todo respons�vel por gerar estat�sticas lidas no arquivo
	 */
	private static void gerarEstatisticas() {

		// Define o nome do arquivo a ser trabalhado
		System.out.print("Informe o nome do arquivo a ser pesquisado: ");
		String nomeArquivo = Teclado.readLine();
		@SuppressWarnings("unused")
		FileInputStream arqEntrada;
		int numRegPesquisados = 0;

		// dados para estat�stica
		int qtdeTotalAlunos = 0; // pega a quantidade total de alunos
		int somaIdade = 0;
		int maiorIdade = 0;
		int mediaIdade = 0;

		try (DataInputStream entrada = new DataInputStream(arqEntrada = new FileInputStream(nomeArquivo))) {

			boolean registroEncontrado = false;

			// Realiza a pesquisa no arquivo
			while (entrada.available() != 0) {

				@SuppressWarnings("deprecation")
				String linha = entrada.readLine();
				StringTokenizer listaPalavras = new StringTokenizer(linha); // Pega uma linha e gera um vetor com as
																			// palavras desta linha
				@SuppressWarnings("unused")
				String codigoLinha = listaPalavras.nextToken();
				@SuppressWarnings("unused")
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

			// caso o registro n�o for encontrado
			if (!registroEncontrado)
				System.out.println("Registro nao encontrado!\n");
			// calcula a m�dia
			mediaIdade = (somaIdade / qtdeTotalAlunos);
		} catch (FileNotFoundException e) {
			System.out.println("O arquivo informado n�o existe.\n" + e.toString());
		} catch (IOException e) {
			System.out.println("O seguinte erro ocorreu: " + e.toString());
		}

		System.out.println("");
		System.out.println("Arquivo com estat�sticas: ");
		System.out.println("N.A - N�mero de alunos: " + qtdeTotalAlunos);
		System.out.println("I.M - Idade m�dia: " + mediaIdade);
		System.out.println("M.I - Maior idade: " + maiorIdade);
		System.out.println("\nRegistros testados: " + numRegPesquisados);
	}
	
	/**
	 * M�todo respons�vel por chamar duas fun��es 
	 * func - gravarDados()
	 * func - gravarObjetos()
	 */
	private static void gravar() {
		System.out.print("Deseja gravar dados ou objetos? (d/o) ");
		char ch = sc.next().toLowerCase().charAt(0);
		if (ch == 'd') {
			gravarDados();
		} else {
			gravarObjetos();
		}
	}
	
	/**
	 * M�todo respons�vel por chamar duas fun��es 
	 * func - pesquisaDados()
	 * func - pesquisaObjetos()
	 */
	private static void pesquisar() {
		System.out.print("Deseja pesquisar dados ou objetos? (d/o) ");
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
			System.out.println("(4) Gerar estat�sticas. ");
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
				System.out.println("ERROR: N�o cont�m essa opcao!");
				break;
			}
		} while (opcao != 0);
		sc.close();
		System.exit(0);
	}
}