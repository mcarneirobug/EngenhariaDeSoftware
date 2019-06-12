package tree.exercice1.application;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Company extends LegalPerson {
	//private List customer, employee;

	private List<Customer> customers;
	private List<Employee> employees;

	private Employee boss;
	
	public Company(String name, Address address, long cnpj, double patrimony) {
		super(name, address, cnpj, patrimony);
		this.customers = new ArrayList<>();
		this.employees = new ArrayList<>();
		this.boss = null;
	}//end constructor()

	public Company() {
		this.customers = new ArrayList<>();
		this.employees = new ArrayList<>();
	}

	public void addCustomer(Customer customer) {
		if(!customers.contains(customer))
			this.customers.add(customer);
	}

	public void addEmployee(Employee employee) {
		if(!employees.contains(employee))
			this.employees.add(employee);
	}

	public void removeCustomer(Customer customer) {
		if(customers.contains(customer))
			this.customers.remove(customer);
	}

	public void removeEmployee(Employee employee) {
		if(employees.contains(employee))
			this.employees.remove(employee);
	}

	public void setBoss(Employee boss) {
		this.boss = boss;
		this.boss.setOffice("Boss");
	}//end setBoss()

	public List<Employee> ordenaSalarioDecrescente() {
		Collections.sort(employees, (o1, o2) -> o1.getSalary() > o2.getSalary() ? -1 : 1);
		return employees;
	}
	
	public List<Employee> getListEmployee() {
		return employees;
	}
	
	public void remover(Employee employee) {
		employees.removeIf((emp) -> employee.equals(emp));
	}
}//end class Company()