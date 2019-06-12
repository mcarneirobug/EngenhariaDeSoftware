package tree.exercice1.application;

public class Employee extends NaturalPerson {
	private String office;
	private double salary;
	private NaturalPerson naturalPerson;

	public Employee(String name, Address address, long cpf, int age, char genre, String office, double salary) throws ExceptionValueNegative {
		super(name, address, cpf, age, genre);
		this.setSalary(salary);
		this.setOffice(office);
	}

	public Employee(NaturalPerson naturalPerson, String office, double salary) throws ExceptionValueNegative {
		this.setNaturalPerson(naturalPerson);
		this.setOffice(office);
		this.setSalary(salary);
	}//end constructor()

	public Employee() {
	}
	
	public NaturalPerson getNaturalPerson() {
		return naturalPerson;
	}

	public void setNaturalPerson(NaturalPerson naturalPerson) {
		if(naturalPerson != null)
			this.naturalPerson = naturalPerson;
	}

	public String getOffice() {
		return this.office;
	}//end getOffice()
	
	public void setOffice(String office) {
		this.office = office;
	}//end setOffice()
	
	public double getSalary() {
		return this.salary;
	}//end getSalary()
	
	public void setSalary(double salary) throws ExceptionValueNegative {
		if(salary > 0)
			this.salary = salary;
		else
			throw new ExceptionValueNegative();
	}//end setSalary()
	
	@Override
	public String toString() {
		return "Nome: " + this.getName() + "\n" +
				"Cpf: " + this.getCpf()  + "\n" +
				"Idade: " + this.getAge() + "\n" +
				"Genero: " + this.getGenre() + "\n" +
				"Cargo: " + this.getOffice() + "\n" +
				"Salario: " + this.getSalary() + "\n";
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		return this.getName().equals(e.getName()) &&
			   this.getAge() == e.getAge() && 
			   this.getCpf() == e.getCpf() &&
			   this.getOffice() == e.getOffice() &&
			   this.getSalary() == e.getSalary() &&
			   this.getGenre()  == e.getGenre() &&
			   this.getAddress() == e.getAddress();
 	}
}//end class Employee()