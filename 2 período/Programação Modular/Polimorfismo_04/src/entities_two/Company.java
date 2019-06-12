package entities_two;

public class Company extends LegalPerson {
	private List customer, employee;
	private Employee boss;
	
	public Company(String name, Address address, long cnpj, double patrimony) {
		super(name, address, cnpj, patrimony);
		this.customer = new List();
		this.employee = new List();
		this.boss = null;
	}//end constructor()

	public void addCustomer(Customer customer) {
		if(customer != null) {
			this.customer.insertLast(customer);
		}//end if
	}//end addCustomer()
	
	public void addEmployee(Employee employee) {
		if(employee != null) {
			this.employee.insertLast(employee);
		}//end if
	}//end addEmploye()
	
	public void removeCustomer() throws Exception {
		if(customer != null) {
			this.customer.removeBegin();
		}//end if
	}//end removeCustomer()
	
	public void removeEmployee() throws Exception {
		if(employee != null) {
			this.employee.removeBegin();
		}//end if
	}//end removeEmployee()
	
	public List getCustomer() {
		return this.customer;
	}//end getCustomer()

	public void setCustomer(List customer) {
		this.customer = customer;
	}//end setCustomer()

	public List getEmployee() {
		return this.employee;
	}//end getEmployee()

	public void setEmployee(List employee) {
		this.employee = employee;
	}//end setEmployee()

	public void setBoss(Employee boss) {
		this.boss = boss;
		this.boss.setOffice("Boss");
	}//end setBoss()
	
	public int getAmountCustomer() {
    	return this.customer.getAmount();
    } //end customer()
    
    public int getAmountEmployee() {
    	return this.employee.getAmount();
    } //end customer()
}//end class Company()