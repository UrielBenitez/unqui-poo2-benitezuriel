package ar.unq.edu.poo2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class MultioperadorTest {
	
	@Test
	void noSePuedeRealizarLaSumatoriaDeUnaListaVacía() {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		assertThrows(Exception.class, () -> Multioperador.sumatoria(lista), "La lista dada no puede ser vacía.");
	}
	
	@Test
	void laSumatoriaDeUnaListaEsLaSumaDeTodosSusElementos() {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(3);
		lista.add(7);
		lista.add(-1);
		assertEquals(9, Multioperador.sumatoria(lista));
	}
	
	@Test
	void noSePuedeRealizarLaRestaDeUnaListaVacía() {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		assertThrows(Exception.class, () -> Multioperador.restar(lista), "La lista dada no puede ser vacía.");
	}
	
	@Test
	void laRestaDeUnaListaEsLaRestaDeTodosSusElementos() {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(3);
		lista.add(7);
		lista.add(-1);
		
		assertEquals(-3, Multioperador.restar(lista));
	}
	
	@Test
	void noSePuedeRealizarLaProductoriaDeUnaListaVacía() {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		assertThrows(Exception.class, () -> Multioperador.productoria(lista), "La lista dada no puede ser vacía.");
	}
	
	@Test
	void laProductoriaDeUnaListaEsElProductoDeTodosSusElementos() {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(3);
		lista.add(7);
		lista.add(-1);
		
		assertEquals(-21, Multioperador.productoria(lista));
	}

}
