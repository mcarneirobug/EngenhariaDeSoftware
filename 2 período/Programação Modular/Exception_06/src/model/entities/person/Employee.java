package model.entities.person;

import model.entities.exception.ExceptionValueNegative;;

public class Employee extends NaturalPerson {
	private String office;
	private double salary;
	private NaturalPerson naturalPerson;
	
	public Employee(NaturalPerson naturalPerson, String office, double salary) throws ExceptionValueNegative {
		this.setNaturalPerson(naturalPerson);
		this.setOffice(office);
		this.setSalary(salary);
	}//end constructor()
	
	public Employee(String name, Address address, long cpf, int age, char genre, String office, double salary) throws ExceptionValueNegative {
		super(name, address, cpf, age, genre);
		this.setSalary(salary);
		this.setOffice(office);
	}
	
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
		throw new ExceptionValueNegative();
	}//end setSalary()
}//end class Employee()