package testJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import applicationThree.LegalPerson;

class testLegalPerson {

	public static LegalPerson person;
	
	@BeforeEach
	void setUp() throws Exception {
		person = new LegalPerson("Apple INC", 123456789);
	}//end setUp()

	@Test
	public void testInitializeLegalPerson() {
		assertEquals("Apple INC", person.getName());
		assertEquals(123456789, person.getCnpj());
	}//end testInitializeLegalPerson()
}//end testLegalPerson()
