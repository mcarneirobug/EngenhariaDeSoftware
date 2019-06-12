package model.entities.person;

import model.entities.exception.ExceptionValueNegative;;

public class Customer extends Person {
	private double creditLimit;
	private Person person;
	private NaturalPerson np = null;
	private LegalPerson lp = null;
	
	public Customer(Person person, double creditLimit) throws ExceptionValueNegative {
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
	
	public Customer(String nome, Address address, double creditLimit) throws ExceptionValueNegative {
		super(nome, address);
		this.setCreditLimit(creditLimit);
	}
	
	public Customer() {
		
	}
	
	public Customer(LegalPerson person, double creditLimit) {
		this.person = person;
		this.creditLimit = creditLimit;
	}
	
	public Customer(NaturalPerson naturalPerson, double creditLimit) {
		this.person = naturalPerson;
		this.creditLimit = creditLimit;
	}
	
	public void setPerson(Person person) {
		this.person = person;
	}//end setPerson()
	
	public double getCreditLimit() {
		return this.creditLimit;
	}//end getCreditLimit()

	public void setCreditLimit(double creditLimit) throws ExceptionValueNegative {
		if(creditLimit < 0)
			throw new ExceptionValueNegative();
		this.creditLimit = creditLimit;
	}//end setCreditLimit(
	
	public NaturalPerson getNp() {
		return np;
	}

	public LegalPerson getLp() {
		return lp;
	}

	@Override
	public Person getPerson() {
		try {
			return new Customer(this.person, this.getCreditLimit());
		} catch (ExceptionValueNegative e) {
			e.printStackTrace();
		}
		if(person instanceof LegalPerson)
			return lp;
		else
			return np;
	}
}//end class Customer()