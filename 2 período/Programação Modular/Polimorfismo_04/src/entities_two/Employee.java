package entities_two;

public class Employee {
	private String office;
	private double salary;
	private LegalPerson legalPerson;
	
	public Employee(LegalPerson legalPerson, String office, double salary) {
		this.setLegalPerson(legalPerson);
		this.setOffice(office);
		this.setSalary(salary);
	}//end constructor()
		
	public LegalPerson getLegalPerson() {
		return this.legalPerson;
	}//end getLegalPerson()

	public void setLegalPerson(LegalPerson legalPerson) {
		this.legalPerson = legalPerson;
	}//end setLegalPerson()

	public String getOffice() {
		return this.office;
	}//end getOffice()
	
	public void setOffice(String office) {
		this.office = office;
	}//end setOffice()
	
	public double getSalary() {
		return this.salary;
	}//end getSalary()
	
	public void setSalary(double salary) {
		this.salary = salary;
	}//end setSalary()
}//end class Employee()