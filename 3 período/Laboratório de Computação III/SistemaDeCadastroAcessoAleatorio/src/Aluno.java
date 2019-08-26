import java.io.*;

public class Aluno implements Registro {

    protected int codigo;
    protected String nome;
    protected int idade;

    // configura um tamanho fixo para o nome
    public final static int TAM_NOME = 20;
    public static int contador = 0;

    public Aluno() { }

    public Aluno(String nome, int idade) {
        this.codigo = ++contador;
        this.nome = nome;
        this.setIdade(idade);
    }

    public void setIdade(int idade) {
        if(idade > 0) this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    @Override
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public int getCodigo() {
        return this.codigo;
    }

    @Override
    public String getString() {
        return this.nome;
    }

    public static String getStringTamanhoFixo(String texto, int tamanho) {
        StringBuffer s1 = new StringBuffer(texto);
        s1.setLength(tamanho);
        return s1.toString();
    }

    @Override
    public byte[] getByteArray() throws IOException {
        ByteArrayOutputStream registro = new ByteArrayOutputStream();
        DataOutputStream saida = new DataOutputStream(registro);

        saida.writeInt(codigo); //4 bytes
        saida.writeInt(idade); //4 bytes
        // escreve tamanho fixo
        saida.write((getStringTamanhoFixo(nome, TAM_NOME)).getBytes()); //20 bytes
        return registro.toByteArray();
    }

    @SuppressWarnings("deprecation")
	@Override
    public void setByteArray(byte[] b) throws IOException {
        ByteArrayInputStream registro = new ByteArrayInputStream(b);
        DataInputStream entrada = new DataInputStream(registro);

        codigo = entrada.readInt();
        idade = entrada.readInt();
        nome = entrada.readLine();
    }

    public int ultimoId(byte[] b) throws IOException {
        ByteArrayInputStream registro = new ByteArrayInputStream(b);
        DataInputStream entrada = new DataInputStream(registro);

        codigo = entrada.readInt();
        int valor = codigo;
        System.out.println("Valor: " + valor);
        return valor;
    }

    @Override
    public int compareTo(Object b) {
        return codigo - ((Aluno) b).getCodigo();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return ((Aluno) super.clone());
    }

    public void print() {
        System.out.println("Código: " + this.codigo + " - Nome: " + this.nome.trim() + " - Idade: " + this.idade);
    }
}