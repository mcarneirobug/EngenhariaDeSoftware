package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entities_one.Data;

class TestData {

	public static Data date;
	
	@BeforeEach
	void setUp() throws Exception {
		date = new Data(2019, 03, 27);
	} //end setUp()
	
	@Test
	public void testToString() {
		assertEquals("27/3/2019 - Sabado", date.toString());
	} //end testToString()
	
	@Test
	public void testEquals() {
		Data date2 = new Data(2019, 03, 27);
		assertTrue(date.equals(date2));
	}//end testEquals()
	
	/*
	@Test
	public void testeAnoBisexto() {
		date = new Data(2020, 1, 1);
		assertTrue(date.eAnoBissexto());
		date.setAno(2021);
		assertFalse(date.eAnoBissexto());
	} //end testeAnoBisexto()
	
	
	@Test
	public void testProximoDia() {
		date = new Data(2020, 1, 2);
		date.proximoDia();
		assertEquals(3, date.getDia());
	} //end testProximoDia()
	

	@Test
	public void testProximoDiaProxMes() {
		date = new Data(2020, 4, 30);
		date.proximoDia();
		assertEquals(1, date.getDia());
		assertEquals(5, date.getMes());
	}//end testProximoDiaProxMes()
	
	@Test
	public void testProximoDiaProxAno() {
		date = new Data(2020, 12, 31);
		date.proximoDia();
		assertEquals(1, date.getDia());
		assertEquals(2021, date.getAno());
	}//end testProximoDiaProxAno()

	@Test
	public void testAdicionaDias() {
		date = new Data(2020, 12, 29);
		date.adicionaDias(1);
		assertEquals(30, date.getDia());
		date.setDia(31);
		date.adicionaDias(1);
		assertEquals(1, date.getDia());
	}//end testAdicionaDias()
	
	@Test
	public void testDiasNoMes() {
		date = new Data(2020, 3, 1);
		assertEquals(31, date.diasNoMes());
		date.setMes(2);
		assertEquals(29, date.diasNoMes());
		date.setAno(2021);
		assertEquals(28, date.diasNoMes());
	} //end testDiasNoMes()
	
	@Test
	public void testDiaDaSemana() {
		date = new Data(2019, 2, 20);
		assertEquals("Quarta-feira", date.diaDaSemana());
		date.setDia(21);
		assertEquals("Quinta-feira", date.diaDaSemana());
	} //end testDiaDaSemana()
	
	@Test
	public void testFimAno() {
		date = new Data(2020, 12, 20);
		assertTrue(date.fimAno());
	}//end testFimAno()
	
	@Test
	public void testPorExtenso() {
		date = new Data(2019, 2, 19);
		date.porExtenso();
		assertEquals("19 de Fevereiro de 2019", date.porExtenso());
	} //end testPorExtenso()
	*/
} //end class TestData()