package model.entities.person;

public class LegalPerson extends Person {
	private long cnpj;
	private double patrimony;
	
	public LegalPerson() {
		super(null, null);
		this.setCnpj(0);
		this.setPatrimony(0.0);
	}//end constructor()
	
	public LegalPerson(String name, Address address, long cnpj, double patrimony) {
		super(name, address);
		this.setCnpj(cnpj);
		this.setPatrimony(patrimony);
	}//end constructor()

	public long getCnpj() {
		return this.cnpj;
	}//end getCnpj()

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}//end setCnpj()

	public double getPatrimony() {
		return this.patrimony;
	}//end getPatrimony()

	public void setPatrimony(double patrimony) {
		if(patrimony > 0) {
			this.patrimony = patrimony;
		}//end if
	}//end setPatrimony()
	
	@Override
	public boolean equals(Object obj) {
		LegalPerson lp = (LegalPerson) obj;
		return this.getCnpj() == lp.getCnpj() && super.equals(lp);
	}//end equals()

	@Override
	public Person getPerson() {
		return new LegalPerson(this.getName(), this.getAddress(), this.getCnpj(), this.getPatrimony());
	}
	
	@Override
	public String toString() {
		return this.getName();
	}
}//end class LegalPerson()