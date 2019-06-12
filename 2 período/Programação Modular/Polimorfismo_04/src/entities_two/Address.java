package entities_two;

public class Address {
	private String street, city, state, uf;
	private long phone, zipCode;
	
	public Address(String street, String city, String state, String uf, long phone, long zipCode) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.uf = uf;
		this.phone = phone;
		this.zipCode = zipCode;
	}//end constructor()

	public String getStreet() {
		return this.street;
	}//end getStreet()
	
	public void setStreet(String street) {
		this.street = street;
	}//end setStreet()
	
	public String getCity() {
		return city;
	}//end getCity()
		
	public void setCity(String city) {
		this.city = city;
	}//end setCity()
	
	public String getState() {
		return this.state;
	}//end getState()
	
	public void setState(String state) {
		this.state = state;
	}//end setState()
	
	public String getUf() {
		return this.uf;
	}//end getUf()
	
	public void setUf(String uf) {
		this.uf = uf;
	}//end setUf()
	
	public long getPhone() {
		return this.phone;
	}//end getPhone()
	
	public void setPhone(long phone) {
		this.phone = phone;
	}//end setPhone()
	
	public long getZipCode() {
		return zipCode;
	}//end getZipCode()
	
	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}//end setZipCod()
}//end class Address()
