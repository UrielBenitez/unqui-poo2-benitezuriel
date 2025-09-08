package ar.unq.edu.poo2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTestCase {
	
	private Counter counter;
	
	@BeforeEach
	void setUp() throws Exception {
		counter = new Counter();
		
		counter.agregarNúmero(1);
		counter.agregarNúmero(3);
		counter.agregarNúmero(5);
		counter.agregarNúmero(7);
		counter.agregarNúmero(9);
		counter.agregarNúmero(1);
		counter.agregarNúmero(1);
		counter.agregarNúmero(1);
		counter.agregarNúmero(1);
		counter.agregarNúmero(4);
	}

	@Test
	void testearCantidadDePares() {
		assertEquals(1, counter.cantidadDePares());
	}

	@Test
	void testearCantidadDeImpares() {
		assertEquals(9, counter.cantidadDeImpares());
	}

	@Test
	void testearCantidadDeMúltiplos() {
		assertEquals(2, counter.cantidadDeMúltiplosDe(3));
	}
	
	@Test
	void testearNúmeroConMásPares() {
		// Set up
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(34042);
		lista.add(22677); 
		lista.add(17837);
		lista.add(15023); 
		lista.add(99330);
		
		assertEquals(34042, counter.númeroConMásParesDe(lista));
	}
	
	@Test
	void testearMúltiploMásGrandeEntreCeroYMilDe13Y29() {
		assertEquals(754, counter.múltiploMásGrandeMenorAMilEntre_Y_(13, 29));
	}
	
	@Test
	void testearQueNoExisteMúltiploEnComúnMenorAMilPara48Y75() {
		assertEquals(-1, counter.múltiploMásGrandeMenorAMilEntre_Y_(48, 75));
	}
	
	@Test
	void elMcmEntre13y29Es1() {
		assertEquals(1, counter.mcd(13,29));
	}
}
