import java.io.Serializable;

public class Cliente implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String nome;
	private int idade;
	private static int numeroClientes;
	
	public Cliente() {}
	
	public Cliente (int id, String nome, int idade) {
		this.setId(id);
		this.setNome(nome);
		this.setIdade(idade);
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public static int getNumeroClientes() {
		return numeroClientes;
	}
	
	public static void setNumeroClientes(int numeroClientes) {
		Cliente.numeroClientes = numeroClientes;
	}
	
	@Override
	public String toString() {
		return "Id: " + this.id + ", Nome: " + this.nome + ", Idade: " + this.idade;
	}
}