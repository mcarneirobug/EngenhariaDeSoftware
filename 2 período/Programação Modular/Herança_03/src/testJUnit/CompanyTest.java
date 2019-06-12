package testJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import applicationThree.Company;
import applicationThree.Employee;
import applicationThree.LegalCustomer;
import applicationThree.NaturalCustomer;

class CompanyTest {

	public static Company company;
	
	@BeforeEach
	void setUp() throws Exception {
		company = new Company();
	} //end setUp()
	
	@Test
	public void testAddLegalCustomer() {
		LegalCustomer client = new LegalCustomer("Puc", 1717080, 30000);
		company.addLegalCustomer(client);
		assertEquals("Puc", client.getName());
		assertEquals(1717080, client.getCnpj());
		assertEquals(30000.0, client.getCreditLimit());
	}//end testAddLegalCustomer()
	
	@Test
	public void testAddNaturalCustomer() {
		NaturalCustomer client = new NaturalCustomer("Matheus", 31250700, 
				19, 'M', 30000);
		company.addNaturalCustomer(client);
		assertEquals("Matheus", client.getName());
		assertEquals(31250700, client.getCpf());
		assertEquals(19, client.getAge());
		assertEquals('M', client.getGenre());
		assertEquals(30000.0, client.getCreditLimit());
	}//end testAddNaturalCustomer()
	
	@Test
	public void testAddEmployee() {
		Employee employee = new Employee("Matheus", 31250700, 19, 'M', "Manager", 20000);
		company.addEmployee(employee);
		assertEquals("Matheus", employee.getName());
		assertEquals(31250700, employee.getCpf());
		assertEquals(19, employee.getAge());
		assertEquals('M', employee.getGenre());
		assertEquals("Manager", employee.getOffice());
		assertEquals(20000, employee.getSalary());
	}//end testAddEmployee()
	
	@Test
	public void testRemoveLegalCustomer() throws Exception {
		LegalCustomer client = new LegalCustomer("Puc", 1717080, 30000);
		company.addLegalCustomer(client);
		company.removeCustomer();
		assertEquals(0, company.customer());
	}//end testRemoveLegalCustomer()
	
	@Test
	public void testRemoveNaturalCustomer() throws Exception {
		NaturalCustomer client = new NaturalCustomer("Matheus", 31250700, 
				19, 'M', 30000);
		company.addNaturalCustomer(client);
		company.removeCustomer();
		assertEquals(0, company.customer());
	}//end testRemoveLegalCustomer()
	
	@Test
	public void testRemoveEmployee() throws Exception {
		Employee employee = new Employee("Matheus", 31250700, 19, 'M', "Manager", 20000);
		company.addEmployee(employee);
		company.removeEmployee();
		assertEquals(0, company.employee());
	}//end testRemoveEmployee()
}//end class CompanyTest()
