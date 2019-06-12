package applicationFive;

public class Employee extends NaturalPerson {

    private String office;
    private double salary;

    public Employee(String name, String address, long phone, long zipCode,
                    String city, String uf, long cpf, int age, char genre,
                    String office, double salary) {
        super(name, address, phone, zipCode, city, uf, cpf, age, genre);
        this.setOffice(office);
        this.setSalary(salary);
    }//end constructor()

    public String getOffice() {
        return this.office;
    }//end getOffice()

    public void setOffice(String office) {
        this.office = office;
    }//end setOffice()

    public double getSalary() {
        return this.salary;
    }//end getSalary()

    public void setSalary(double salary) {
        this.salary = salary;
    }//end setSalary()
}//end class Employee()
