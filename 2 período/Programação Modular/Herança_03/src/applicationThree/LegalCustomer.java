package applicationThree;

public class LegalCustomer extends LegalPerson {
    private double creditLimit;

    public LegalCustomer(String name, long cnpj, double creditLimit) {
        super(name, cnpj);
        this.setCreditLimit(creditLimit);
    }//end constructor()

    public double getCreditLimit() {
        return this.creditLimit;
    }//end getCreditLimit()

    public void setCreditLimit(double creditLimit) {     
            this.creditLimit = creditLimit;     
    }//end setCreditLimit()
}//end class LegalCustomer()
