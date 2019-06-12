package testJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import applicationThree.Employee;

class EmployeeTest {

	public static Employee employee;
	
	@BeforeEach
	void setUp() throws Exception {
		employee = new Employee("Matheus", 31250500, 19, 'M', "Manager", 20000);
	}//end setUp()

	@Test
	public void testInitializeEmployee() {
		assertEquals("Matheus", employee.getName());
		assertEquals(31250500, employee.getCpf());
		assertEquals(19, employee.getAge());
		assertEquals('M', employee.getGenre());
		assertEquals("Manager", employee.getOffice());
		assertEquals(20000, employee.getSalary());
	}//end testInitializeEmployee()
	
	@Test
	public void testWithoutPay() {
		employee.setSalary(0);
		assertEquals(0, employee.getSalary());
	}//end testWithoutPay()
}//end class EmployeeTest()
