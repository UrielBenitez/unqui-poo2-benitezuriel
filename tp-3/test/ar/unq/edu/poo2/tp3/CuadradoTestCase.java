package ar.unq.edu.poo2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuadradoTestCase {
	private Punto origen = new Punto();
	private Cuadrado miCuadrado = new Cuadrado(origen, 5);
	
	@Test
	void elAreaDeUnCuadradoEsIgualAlProductoDeSusLados() {
		assertEquals(25, miCuadrado.area());
	}
	@Test
	void elPerimetroDeUnCuadradoEsIgualALaSumaDeTodosSusLados() {
		assertEquals(20, miCuadrado.perimetro());
	}
	@Test
	void unCuadradoNoEsHorizontal() {
		assertFalse(miCuadrado.esHorizontal());
	}
	@Test
	void unCuadradoNoEsVertical() {
		assertFalse(miCuadrado.esVertical());
	}
}
