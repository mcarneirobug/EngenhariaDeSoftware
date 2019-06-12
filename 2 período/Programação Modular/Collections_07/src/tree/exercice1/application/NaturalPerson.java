package tree.exercice1.application;

public class NaturalPerson extends Person {
	private long cpf;
	private int age;
	private char genre;
	
	public NaturalPerson() {
		super(null, null);
		this.setCpf(0);
		this.setAge(0);
		this.setGenre('M');
	}//end constructor()
	
	public NaturalPerson(String name, Address address, long cpf, int age, char genre) {
		super(name, address);
		this.setCpf(cpf);
		this.setAge(age);
		this.setGenre(genre);
	}//end constructor()

	public long getCpf() {
		return cpf;
	}//end getCpf()

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}//end setCpf()

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
	
	public boolean isOverAge() {
		return this.age >= 18;
	}//end isOverAge()
	
	@Override
	public boolean equals(Object obj) {
		NaturalPerson np = (NaturalPerson) obj;
		return this.getCpf() == np.getCpf() && this.getAge() == np.getAge() && this.getGenre() == np.getGenre() 
				&& super.equals(np);
	}//end equals()

	@Override
	public Person getPerson() {
		return new NaturalPerson(this.getName(),this.getAddress(), this.getCpf(), this.getAge(), this.getGenre());
	}
	
	@Override
	public String toString() {
		//return this.getName() + this.getCpf() + this.getAge() + this.getGenre();
		return "Nome: " + this.getName() + "\n" +
				"Cpf: " + this.getCpf()  + "\n" +
				"Idade: " + this.getAge() + "\n" +
				"Genero: " + this.getGenre() + "\n";
	}
}//end class NaturalPerson()