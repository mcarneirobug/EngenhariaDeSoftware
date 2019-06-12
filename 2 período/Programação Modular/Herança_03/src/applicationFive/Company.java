package applicationFive;

public class Company extends Address{
    private Lista customer, employee;
    private Employee boss;

    public Company(String name, String address, long phone, long zipCode,
                   String city, String uf) {
       super(name, address, phone, zipCode, city, uf);
       this.customer = new Lista();
       this.employee = new Lista();
    }//end constructor()
    
    public int customer() {
    	return this.customer.getAmount();
    } //end customer()
    
    public int employee() {
    	return this.employee.getAmount();
    } //end customer()

    public void addLegalCustomer(LegalCustomer customer) {
        if(customer != null) {
            this.customer.inserirFim(customer);
        }//end if
    }//end addLegalCustomer()

    public void addNaturalCustomer(NaturalCustomer customer) {
        if(customer != null) {
            this.customer.inserirFim(customer);
        }//end if
    }//end addNaturalCustomer()

    public void addEmployee(Employee employee) {
        if(employee != null) {
            this.employee.inserirFim(employee);
        }//end if
    }//end addEmployee()

    public void removeCustomer() throws Exception {
        this.customer.removerInicio();
    }//end removeCustomer()

    public void removeEmployee() throws Exception {
        this.employee.removerInicio();
    }//end removeEmployee()
    
    public void setBoss(Employee boss) {
    	this.boss = boss;
    }//end setBoss()
    
    public Employee getBoss() {
    	return this.boss;
    }//end getBoss()
}//end class Company()
