package entities_two;

public class Customer extends Person {
	private double creditLimit;
	private Person person;
	
	public Customer(Person person, double creditLimit) {
		if(person instanceof LegalPerson) {
			this.person = new LegalPerson(person.getName(), person.getAddress(),((LegalPerson)person).getCnpj(), 
					((LegalPerson)person).getPatrimony());
			this.setCreditLimit(creditLimit);
		}//end if
		else {
			if(person instanceof NaturalPerson) {
				this.person = new NaturalPerson(person.getName(), person.getAddress(), ((NaturalPerson)person).getCpf(),
						((NaturalPerson)person).getAge(), ((NaturalPerson)person).getGenre());
				this.setCreditLimit(creditLimit);
			}//end if
		}//end else
	}//end constructor()
	
	public Person getPerson() {
		return this.person;
	}//end getPerson()

	public void setPerson(Person person) {
		this.person = person;
	}//end setPerson()
	
	public double getCreditLimit() {
		return this.creditLimit;
	}//end getCreditLimit()

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}//end setCreditLimit()
}//end class Customer()