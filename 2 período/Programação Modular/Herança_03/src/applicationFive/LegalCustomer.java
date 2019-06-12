package applicationFive;

public class LegalCustomer extends LegalPerson {

    private double creditLimit;

    public LegalCustomer(String name, String address, long phone,
                         long zip, String city, String uf, long cnpj, double creditLimit) {
        super(name, address, phone, zip, city, uf, cnpj);
        this.setCreditLimit(creditLimit);
    }//end constructor()

    public double getCreditLimit() {
        return this.creditLimit;
    }//end getCreditLimit()

    public void setCreditLimit(double creditLimit) {
        if(this.creditLimit > 0) {
            this.creditLimit = creditLimit;
        }//end if
    }//end setCreditLimit()
}//end class LegalCustomer()
