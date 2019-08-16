import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.StringTokenizer;

public class PesquisaSequencialDados {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// Define o nome do arquivo a ser trabalhado
		System.out.print("Informe o nome do arquivo a ser pesquisado: ");
		String nomeArquivo = Teclado.readLine();

		int numRegPesquisados = 0;

		try {
			// Objetos utilizados na manipulação do arquivo e seus dados
			FileInputStream arqEntrada = new FileInputStream(nomeArquivo);
			@SuppressWarnings("resource")
			DataInputStream entrada = new DataInputStream(arqEntrada);

			System.out.print("Digite o nome do Veículo a ser pesquisado: ");
			String nome = Teclado.readLine();

			boolean registroEncontrado = false;

			int numeroAlunos = 0;
			int somaIdade = 0;
			int maiorIdade = 0;

			// Realiza a pesquisa no arquivo
			while (entrada.available() != 0) {

				@SuppressWarnings("deprecation")
				String linha = entrada.readLine();
				StringTokenizer listaPalavras = new StringTokenizer(linha); // Pega uma linha e gera um vetor com as
																			// palavras desta linha

				@SuppressWarnings("unused")
				String codigoLinha = listaPalavras.nextToken();
				String nomeLinha = listaPalavras.nextToken();
				String idadeLinha = listaPalavras.nextToken();

				// Salva os dados estatisticos
				int idade = Integer.parseInt(idadeLinha);
				numeroAlunos++;
				somaIdade += idade;

				if (maiorIdade < idade) {
					maiorIdade = idade;
				}

				numRegPesquisados++;
				if (nomeLinha.startsWith(nome)) {
					System.out.println(linha);
					System.out.println("Registro encontrado!\n");

					registroEncontrado = true;

					break;
				} // end if
			} // end while
			if (!registroEncontrado)
				System.out.println("Registro nao encontrado!\n");

			int mediaIdade = somaIdade / numeroAlunos;
			
			System.out.println("Media das idades: " + mediaIdade);
		} // end try
		catch (FileNotFoundException e) {
			System.out.println("O Arquivo informado não existe.\n" + e.toString());
		} // end catch
		System.out.println("Registros testados: " + numRegPesquisados);
	} // end main()
} // end class PesquisaSequencialDados()