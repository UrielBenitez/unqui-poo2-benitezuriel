package personasYMascotas;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MascotaTest {

	private Mascota miMascota = new Mascota("Max", "Coker");

	@Test
	void unaMascotaSabeResponderSuNombre() {
		assertEquals("Max", miMascota.nombre());
	}
	@Test
	void unaMascotaSabeResponderSuRaza() {
		assertEquals("Coker", miMascota.raza());
	}
}
