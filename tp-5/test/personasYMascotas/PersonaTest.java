package personasYMascotas;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTest {
	
	private Persona unaPersona = new Persona("Uriel Benitez", LocalDate.of(2004, 3, 25));
	private Persona otraPersona = new Persona("Agustin Benitez", LocalDate.of(1996, 11, 13));

	@Test
	void unaPersonaSabeResponderSuNombre() {
		assertEquals("Uriel Benitez", unaPersona.nombre());
	}
	@Test
	void unaPersonaSabeResponderSuFechaDeNacimiento() {
		assertEquals(LocalDate.of(2004, 3, 25), unaPersona.fechaDeNacimiento());
	}
	@Test
	void unaPersonaSabeResponderSuEdad() {
		assertEquals(21, unaPersona.edad());
	}
	@Test
	void unaPersonaSabeSiEsMenorQueOtraPersona() {
		assertTrue(unaPersona.esMenorQue(otraPersona));
	}
}
