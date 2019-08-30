import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Aplicacao {

	// Inserir os clientes
	public static Cliente[] listacliente = new Cliente[1000];
	public static List<Cliente> list = new ArrayList<Cliente>();

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		int opcao;

		do {
			System.out.println();
			System.out.println("\nSistema de Cadastro de Clientes: ");
			System.out.println("(0) - Parar. ");
			System.out.println("(1) - Inserir Cliente. ");
			System.out.println("(2) - Gerar Estatística e Listar. ");

			System.out.println("\nInforme a opcao desejada: ");
			opcao = Teclado.readInt();

			switch (opcao) {
			case 0:
				break;
			case 1:
				inserirCliente();
				break;
			case 2:
				procurarObjeto();
				break;
			default:
				System.out.println("ERROR: Opcao invalida. ");
				break;
			}
		} while (opcao != 0);
		System.exit(0);
	}

	/**
	 * Método responsável por inserir os clientes (Object)
	 */
	public static void inserirCliente() {

		// Objetos utilizados na manipulação do arquivo e seus dados
		FileOutputStream arqSaida;
		try (ObjectOutputStream saida = new ObjectOutputStream(
				arqSaida = new FileOutputStream("dadosCliente.txt", true))) {

			System.out.print("Informe o número de registros a serem gravados: ");
			int numRegistros = Teclado.readInt();

			// Adiciona os registros desejados
			for (int i = 0; i < numRegistros; i++) {

				System.out.print("\nInforme a identidade: ");
				int id = Teclado.readInt();

				System.out.print("Informe a idade: ");
				int idade = Teclado.readInt();

				System.out.print("Informe o nome: ");
				String nome = Teclado.readLine();

				Cliente c = new Cliente(id, nome, idade);

				listacliente[i] = c;
				list.add(c);
				saida.writeObject(c);

			}
			// Finalização da manipulação dos dados no arquivo
			saida.flush();
			saida.close();
			arqSaida.close();

			System.out.println("\nDados gravados com sucesso. ");

		} catch (FileNotFoundException e) {
			System.out.println("O Arquivo informado não existe.\n" + e.toString());
		} catch (IOException e) {
			System.out.println("Ocorreu o seguinte error: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("O seguinte erro ocorreu: " + e.toString());
		}
	}

	public static void procurarObjeto() throws IOException, ClassNotFoundException {

		int numRegPesquisados = 0;
		int idadeMedia = 0;
		int maiorIdade = 0;
		int somaIdade = 0;
		
		try {

			// Objetos utilizados na manipulação do arquivo e seus dados
			FileInputStream arqEntrada = new FileInputStream("dadosCliente.txt");
			ObjectInputStream entrada = new ObjectInputStream(arqEntrada);

			// Realiza a pesquisa no arquivo
			while (arqEntrada.available() != 0) {

				Cliente cliente = (Cliente) entrada.readObject();

				int idade = cliente.getIdade();
				somaIdade += idade;

				// verifica quem tem a maior idade
				if (maiorIdade < idade) {
					maiorIdade = idade;
				}

				// empr.getClass().getMethod("get" + "Nome", );

				numRegPesquisados++;

			}

			// calcula a média
			idadeMedia = (somaIdade / numRegPesquisados);
			System.out.println("Registro encontrado!\n");

		} catch (FileNotFoundException e) {
			System.out.println("O Arquivo informado não existe.\n" + e.toString());
		} catch (EOFException e) {
			System.out.println("Registro nao encontrado!\n");
		}

		System.out.println();
		System.out.println("Arquivo com estatísticas: ");
		System.out.println("N.A - Número de Clientes: " + numRegPesquisados);
		System.out.println("I.M - Idade média: " + idadeMedia);
		System.out.println("M.I - Maior idade: " + maiorIdade);

		System.out.println("Num. Registros Pesquisados: " + numRegPesquisados);

		try (PrintStream saida = new PrintStream(new FileOutputStream("dadosEstatistica.txt", true))) {

			saida.println("Arquivo com estatísticas: ");
			saida.println("N.A - Número de Clientes: " + numRegPesquisados);
			saida.println("I.M - Idade média: " + idadeMedia);
			saida.println("M.I - Maior idade: " + maiorIdade);

			for (int i = 0; i < list.size(); i++) {
				saida.println("Dados: ");
				saida.println(list);
			}

		} catch (FileNotFoundException e) {
			System.out.println();
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Ocorreu o seguinte erro: " + e.toString());
		}
	}
}