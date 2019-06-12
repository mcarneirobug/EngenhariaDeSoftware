package applicationFive;

public class LegalPerson extends Person {
	private long cnpj;

	public LegalPerson(String name, String address, long phone, long zipCode,
					   String city, String uf, long cpnj) {
		super(name, address, phone, zipCode, city, uf);
		this.setCnpj(cpnj);
	}//end constructor()

	public long getCnpj() {
		return this.cnpj;
	}//end getCnpj()

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}//end setCnpj()
}//end class LegalPerson()
