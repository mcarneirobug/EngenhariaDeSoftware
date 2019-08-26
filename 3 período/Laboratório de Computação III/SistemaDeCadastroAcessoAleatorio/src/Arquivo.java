import java.io.IOException;
import java.io.RandomAccessFile;

public class Arquivo {

    String nomeArquivo;

    public Arquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public Arquivo() {
        this.nomeArquivo = "";
    }

    public void salvarRegistro(Registro r) throws IOException {
        RandomAccessFile file = new RandomAccessFile(nomeArquivo, "rw");
        file.seek(file.length());
        file.writeInt(r.getByteArray().length);
        file.write(r.getByteArray());
        file.close();
    }

    /**
     * Classe responsável por mostrar dados salvos no arquivo
     * @throws IOException
     */
    public void listarArquivo() throws IOException {
        RandomAccessFile file = new RandomAccessFile(nomeArquivo, "r");

        int cont = 0;
        while(cont < file.length()) {
            // ler a primeira linha do arquivo contendo o tamanho
            int size = file.readInt();
            byte b [] = new byte[size];
            file.read(b);

            Aluno a = new Aluno();
            a.setByteArray(b);
            // imprime dados
            a.print();

            cont = cont + 4 + size + 4;
        }
        file.close();
    }

    /**
     * Método responsável por fazer a pesquisa sequencial dos dados
     * @param nome - variável que estamos procurando
     * @return - o Aluno caso o nome seja igual
     * @throws IOException
     */
    public Aluno pesquisaSequencial(String nome) throws IOException {
        
    	RandomAccessFile file = new RandomAccessFile(nomeArquivo, "r");

        int cont = 0;
        while(cont < file.length()) {
            //obtém o tamanho do registro (primeiros 4 bytes)
            int size = file.readInt();
            //obtém os demais bytes (4 do código + restante ref ao nome)
            byte b [] = new byte[size];
            file.read(b);

            Aluno a = new Aluno();
            a.setByteArray(b); //carregaDados
//            a.print();

            // verica se o nome é igual o que estamos procurando
            if (a.getString().trim().equals(nome)) {
                file.close();
                System.out.println("Nome: " + a.nome);
                return a;
            }
            cont = cont + 4 + size + 4 + 4;
        }
        file.close();
        return null;
    }

    /**
     * Método responsável por fazer uma pesquisa ternária
     * @param codigo - Aluno que queremos achar
     * @return - caso encontre, retorna o Aluno ou null
     * @throws IOException
     */
    public Aluno pesquisaTernaria(int codigo) throws IOException {

        RandomAccessFile file = new RandomAccessFile(nomeArquivo, "r");
        file.seek(0);

        // tamanho do registro - 32 bytes (tam, codigo, idade, nome)
        int tam_registro_bytes = 4 + 4 + 4 + Aluno.TAM_NOME;

        // pos = 4, pulamos o tamanho do size
         long pos_inicial = 0;
         long pos_final = file.length() - tam_registro_bytes;
         long pos_meio, pos_meio2;

        while (pos_inicial <= pos_final) {

            pos_meio = pos_inicial + (pos_final - pos_inicial) / 3;
            pos_meio2 = pos_final  - (pos_final - pos_inicial) / 3;

            // ler o registro na posicao definida
            int size = file.readInt();
            byte b [] = new byte[size];
            file.read(b);

            // carrega o objeto da classe aluno e verifica o código
            Aluno a = new Aluno();
            a.setByteArray(b);

            // se o código for igual, retorna o registro
            if(a.getCodigo() == codigo) {
                file.close();
                a.print();
                return a;
                // primeiro 1/3
            } else if (codigo < a.getCodigo()) {
                pos_final = pos_meio - 1;
            } else if (codigo > a.getCodigo()) {
                pos_inicial = pos_meio2;
            } else {
                pos_inicial = pos_meio;
                pos_final = pos_meio2;
            }
        }
        file.close();
        return null;
    }

    /**
     * Método responsável por fazer pesquisa binária
     * @param codigo - Aluno que estamos procurando
     * @return - Aluno caso encontre ou null
     * @throws IOException
     */
    public Aluno pesquisaBinary(int codigo) throws IOException {
        RandomAccessFile file = new RandomAccessFile(nomeArquivo, "rw");
        file.seek(0);

        int tam_registro_bytes = 4 + 4 + Aluno.TAM_NOME + 4;

        long pos_inicial = 0;
        long pos_final = file.length() - tam_registro_bytes;
        long pos_meio;

        while (pos_inicial <= pos_final) {

            //Calcula a posiÃ§Ã£o do meio
            pos_meio = (pos_inicial + pos_final) / 2;

            //Caso o arquivo tenha numero par ou Ã­mpar de elementos, deve-se ajusta o ponteiro para nÃ£o cair no meio do registro
            if (pos_meio % tam_registro_bytes != 0)
                pos_meio = pos_meio + (pos_meio % tam_registro_bytes);

            file.seek(pos_meio);

            //Ler o registro na posiÃ§Ã£o definida
            int size = file.readInt();
            byte b[] = new byte[size];
            file.read(b);

            //Carrega o objeto da classe aluno e verifica o cÃ³digo
            Aluno a = new Aluno();
            a.setByteArray(b);
            //System.out.print("(" + a.getCodigo() + ")");
            if (a.getCodigo() == codigo) {
                file.close();
                a.print();
                return a;
                //divide ao meio
            } else if (codigo < a.getCodigo())
                pos_final = pos_meio - tam_registro_bytes;
            else
                pos_inicial = pos_meio + tam_registro_bytes;
        }
        return null;
    }
}