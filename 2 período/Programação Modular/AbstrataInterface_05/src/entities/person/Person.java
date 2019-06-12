package entities.person;

/**
 * A classe pessoa não tem necessidade de ser instanciada, 
 * portanto podendo ser abstrata, já suas subclasses NaturalPerson e 
 * LegalPerson que herdam, devem ser instanciadas 
 * 
 */

public abstract class Person implements Ordenavel {
	private String name;
	private Address address;
	
	public Person() {
		this.setName(null);
		this.setAddress(null);
	}//end constructor()
	
	public Person(String name, Address address) {
		this.setName(name);
		this.setAddress(address);
	}//end constructor()

	public String getName() {
		return name;
	}//end getName()

	public void setName(String name) {
		this.name = name;
	}//end setName()

	public Address getAddress() {
		return address;
	}//end getAddress()

	public void setAddress(Address address) {
		this.address = address;
	}//end setAddress()
	
	public abstract Person getPerson();
	
	@Override
	public boolean equals(Object obj) {
		Person person = (Person) obj;
		return this.getName() == person.getName() && this.getAddress() == person.getAddress();
	}//end equals()

	@Override
	public boolean menorQue(Ordenavel o) {
		Person person = (Person) o;
		return this.getName().compareToIgnoreCase(person.getName()) < 0;
	}
	
	@Override
	public String toString() {
		return this.getName();
	}
}//end class Person()