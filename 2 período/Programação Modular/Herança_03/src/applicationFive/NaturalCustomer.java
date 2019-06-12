package applicationFive;

public class NaturalCustomer extends NaturalPerson {
    private double creditLimit;

    public NaturalCustomer(String name, String address, long phone, long zipCode,
                           String city, String uf, long cpf, int age, char genre,
                           double creditLimit) {
        super(name, address, phone, zipCode, city, uf, cpf, age, genre);
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
}//end class NaturalCustumer()
