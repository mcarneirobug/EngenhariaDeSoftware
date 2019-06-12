package app;

public class Pessoa {

	//Atributos
	private String nome;
	private long cpf;
	private int idade;
	private char sexo;
	
	public String getNome() {
		return nome;
	} //end getNome()
	
	public void setNome(String nome) {
		this.nome = nome;
	} //end setNome()
	
	public long getCpf() {
		return this.cpf;
	} //end getCpf()
	
	public void setCpf(long cpf) {
		this.cpf = cpf;
	} //end setCpf()
	
	public int getIdade() {
		return this.idade;
	} //end getIdade()
	
	public void setIdade(int idade) {
		this.idade = idade;
	} //end setIdade()
	
	public char getSexo() {
		return this.sexo;
	} //end getSexo()
	
	public void setSexo(char sexo) {
		this.sexo = sexo;
	} //end setSexo()
	
	/**
	 * Construtor padrao
	 */
	
	public Pessoa() {
		this.nome = "Matheus";
		this.cpf  = 123456;
		this.idade = 19;
		this.sexo = 'M';
	} //end construtor()
	
	/**
	 * Construtor secundario com parametros
	 */
	public Pessoa(String nome, long cpf, int idade, char sexo) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setIdade(idade);
		this.setSexo(sexo);
	} //end construtor secundario()
	
	public boolean isMaiorDeIdade() {
		if(this.idade >= 18) {
			return true;
		} else {
			return false;
		} //end else
	} //end isMaiorDeIdade()
} //end class Pessoa()
