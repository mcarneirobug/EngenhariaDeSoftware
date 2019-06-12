package applicationThree;

public class NaturalCustomer extends NaturalPerson {
    private double creditLimit;

    public NaturalCustomer(String name, long cpf, int age, char genre, double creditLimit) {
        super(name, cpf, age, genre);
        this.creditLimit = creditLimit;
    }//end constructor()

    public double getCreditLimit() {
        return this.creditLimit;
    }//end getCreditLimit()

    public void setCreditLimit(double creditLimit) {
            this.creditLimit = creditLimit;
    }//end setCreditLimit()
}//end class NaturalCustumer()
