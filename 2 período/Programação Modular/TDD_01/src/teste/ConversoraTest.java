package teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import app.Conversora;

class ConversoraTest {
	
	public static Conversora c;
	
	@BeforeEach
	void setUp() throws Exception {
		c = new Conversora();
	} //end setUp()

	@Test
	public void testConverterPesParaMetros() {
		assertEquals(30.480, c.converterPesParaMetros(100), 0.1);
	} //end testConverterPesParaMetros()
	
	@Test
	public void testConverterPesParaPolegadas() {
		assertEquals(600, c.converterPesParaPolegadas(50), 0.1);
	} //end testConverterPesParaPolegadas()
	
	@Test
	public void testConverterPesParaCentimetros() {
		assertEquals(914.411, c.converterPesParaCentimetros(30), 0.1);
	} //end testConverterPesParaCentimetros()
	
	@Test
	public void testConverterPolegadasParaMetros() {
		assertEquals(12.7, c.converterPolegadasParaMetros(500), 0.1);
	} //end testConverterPolegadasParaMetros()
	
	@Test
	public void testConverterPolegadasParaPes() {
		assertEquals(8.333, c.converterPolegadasParaPes(100), 0.1);
	} //end testConverterPolegadasParaPes()
	
	@Test
	public void testConverterPolegadasParaCentimetros() {
		assertEquals(25.4, c.converterPolegadasParaCentimetros(10), 0.1);
	} //end testConverterPolegadasParaCentimetros()
	
	@Test
	public void testConverterMetrosParaPes() {
		assertEquals(42.65, c.converterMetrosParaPes(13), 0.1);
	} //end testConverterMetrosParaPes()
	
	@Test
	public void testConverterMetrosParaPolegadas() {
		assertEquals(393.7, c.converterMetrosParaPolegadas(10), 0.1);
	} //end testConverterMetrosParaPolegadas()
	
	@Test
	public void testConverterMetrosParaCentimetros() {
		assertEquals(1000, c.converterMetrosParaCentimetros(10), 0.1);
	} //end testConverterMetrosParaCentimetros()
	
	@Test
	public void testConverterCentimetrosParaPes() {
		assertEquals(1.64042, c.converterCentimetrosParaPes(50), 0.1);
	} //end testConverterCentimetrosParaPes()
	
	@Test
	public void testConverterCentimetrosParaPolegadas() {
		assertEquals(39.37, c.converterCentimetrosParaPolegadas(100), 0.1);
	} //end testConverterCentimetrosParaPolegadas()
	
	@Test
	public void testConverterCentimetrosParaMetros() {
		assertEquals(1, c.converterCentimetrosParaMetros(100), 0.1);
	} //end testConverterCentimetrosParaMetros()
	
} //end class ConversoraTest()
