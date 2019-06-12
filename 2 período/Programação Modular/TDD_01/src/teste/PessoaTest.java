package teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import app.Pessoa;

class PessoaTest {

	public static Pessoa p;
	
	@BeforeEach
	void setUp() throws Exception {
		p = new Pessoa();
	} //end setUp()

	@Test
	public void testMaiorIdade() {
		p.setIdade(19);
		assertTrue(p.isMaiorDeIdade());
		p.setIdade(15);
		assertFalse(p.isMaiorDeIdade());
	} //end testMaiorIdade()

} //end class PessoaTest()
