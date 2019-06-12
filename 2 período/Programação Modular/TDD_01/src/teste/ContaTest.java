package teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import app.Conta;

class ContaTest {

	public static Conta c;
	
	@BeforeEach
	void setUp() throws Exception {
		c = new Conta();
	} //end setUp()

	@Test
	public void testDepositar() {
		c.depositar(300);
		assertEquals(300, c.getSaldo());
	} //end testDepositar()
	
	@Test
	public void testSacar() {
		c.depositar(500);
		c.sacar(200);
		assertEquals(300, c.getSaldo());
	} //end testSacar()
	
	@Test 
	public void testSacar2() {
		c.setSaldo(500);
		assertTrue(c.sacar(450));
		c.setSaldo(400);
		assertFalse(c.sacar(600));
	} //end testSacar2()
} //end class ContaTest()
