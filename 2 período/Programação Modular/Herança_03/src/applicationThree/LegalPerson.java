package applicationThree;

public class LegalPerson extends Person {
	private long cnpj;

	public LegalPerson(String name, long cnpj) {
		super(name);
		this.setCnpj(cnpj);
	}//end constructor()

	public long getCnpj() {
		return this.cnpj;
	}//end getCnpj()

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}//end setCnpj()
}//end class LegalPerson()
