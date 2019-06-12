package entities_two;

public class Person {
	private String name;
	private Address address;
	
	public Person() {
		this.setName("Undefined");
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
	
	@Override
	public boolean equals(Object obj) {
		Person person = (Person) obj;
		return this.getName() == person.getName() && this.getAddress() == person.getAddress();
	}//end equals()
}//end class Person()