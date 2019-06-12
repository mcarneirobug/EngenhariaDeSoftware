package applicationThree;

public class Company {
    private Lista customer, employee;

    public Company() {
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
}//end class Company()
