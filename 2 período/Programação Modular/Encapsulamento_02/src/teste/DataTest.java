package teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import app.Data;

class DataTest {
	
	public static Data data;
	
	@Test
	public void testeAnoBisexto() {
		data = new Data(2020, 1, 1);
		assertTrue(data.eAnoBissexto());
		data.setAno(2021);
		assertFalse(data.eAnoBissexto());
	} //end testeAnoBisexto()
	
	
	@Test
	public void testProximoDia() {
		data = new Data(2020, 1, 2);
		data.proximoDia();
		assertEquals(3, data.getDia());
	} //end testProximoDia()
	

	@Test
	public void testProximoDiaProxMes() {
		data = new Data(2020, 4, 30);
		data.proximoDia();
		assertEquals(1, data.getDia());
		assertEquals(5, data.getMes());
	}//end testProximoDiaProxMes()
	
	@Test
	public void testProximoDiaProxAno() {
		data = new Data(2020, 12, 31);
		data.proximoDia();
		assertEquals(1, data.getDia());
		assertEquals(2021, data.getAno());
	}//end testProximoDiaProxAno()

	@Test
	public void testAdicionaDias() {
		data = new Data(2020, 12, 29);
		data.adicionaDias(1);
		assertEquals(30, data.getDia());
		data.setDia(31);
		data.adicionaDias(1);
		assertEquals(1, data.getDia());
	}//end testAdicionaDias()
	
	@Test
	public void testDiasNoMes() {
		data = new Data(2020, 3, 1);
		assertEquals(31, data.diasNoMes());
		data.setMes(2);
		assertEquals(29, data.diasNoMes());
		data.setAno(2021);
		assertEquals(28, data.diasNoMes());
	} //end testDiasNoMes()
	
	@Test
	public void testDiaDaSemana() {
		data = new Data(2019, 2, 20);
		assertEquals("Quarta-feira", data.diaDaSemana());
		data.setDia(21);
		assertEquals("Quinta-feira", data.diaDaSemana());
	} //end testDiaDaSemana()
	
	@Test
	public void testFimAno() {
		data = new Data(2020, 12, 20);
		assertTrue(data.fimAno());
	}//end testFimAno()
	
	@Test
	public void testPorExtenso() {
		data = new Data(2019, 2, 19);
		data.porExtenso();
		assertEquals("19 de Fevereiro de 2019", data.porExtenso());
	} //end testPorExtenso()
	
} //end class DataTest()
