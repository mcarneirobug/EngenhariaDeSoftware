package testJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import applicationThree.NaturalPerson;

class NaturalPersonTest {

	public static NaturalPerson person;
	
	@BeforeEach
	void setUp() throws Exception {
		person = new NaturalPerson("Matheus", 31250500, 19, 'M');
	}//end setUp()
	
	@Test
	public void testInitializeNaturalPerson() {
		assertEquals("Matheus", person.getName());
		assertEquals(31250500, person.getCpf());
		assertEquals(19, person.getAge());
		assertEquals('M', person.getGenre());
	}//end testInitializeNaturalPerson()
	
	@Test
	public void testIsOverAge() {
		assertTrue(person.isOverAge());
		person.setAge(17);
		assertFalse(person.isOverAge());
		person.setAge(18);
		assertTrue(person.isOverAge());
	}//end testIsOverAge()
}//end class NaturalPersonTest()
