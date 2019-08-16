import java.io.Serializable;

class Aluno implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private int id;
	private String nome;
	private int idade;
	
	public Aluno() {
		
	}
	
	public Aluno(int id, String nome, int idade) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
	}

	public String toString() {
		return "Codigo : " + String.valueOf(id) + "\tNome: " + nome + "\tIdade: " + idade;
	}
	
	public int getId() {
		return id;
	}
	
	public String getNome(){
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}