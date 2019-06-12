package applicationThree;

public class NaturalPerson extends Person {
	private int age;
	private char genre;
	private long cpf;

	public NaturalPerson(String name, long cpf, int age, char genre) {
		super(name);
		this.setCpf(cpf);
		this.setAge(age);
		this.setGenre(genre);
	}//end constructor()

	public NaturalPerson() {
		super();
		this.setCpf(00000000);
		this.setAge(19);
		this.setGenre('M');
	}//end constructor()

	public int getAge() {
		return this.age;
	}//end getAge()

	public void setAge(int age) {
		this.age = age;
	}//end setAge()

	public char getGenre() {
		return this.genre;
	}//end getGenre()

	public void setGenre(char genre) {
		this.genre = genre;
	}//end setGenre()

	public long getCpf() {
		return this.cpf;
	}//end getCpf()

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}//end setCpf()

	public boolean isOverAge() {
		return this.age >= 18;
	} //end isOverAge()
}//end class NaturalPerson()
