package entities.person;

public class Customer extends Person {
	private double creditLimit;
	private Person person;
	private NaturalPerson np = null;
	private LegalPerson lp = null;
	
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
	
	public Customer(String nome, Address address, double creditLimit) {
		super(nome, address);
		this.creditLimit = creditLimit;
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

	public void setCreditLimit(double creditLimit) {
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
		return new Customer(this.person, this.getCreditLimit());
	}
}//end class Customer()