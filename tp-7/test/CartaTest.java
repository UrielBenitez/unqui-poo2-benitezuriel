import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CartaTest {

	private Carta miCarta = new Carta(ValorDePoker.DOS, Palo.CORAZONES);

	@Test
	void unaCartaSabeResponderSuValor() {
		assertEquals(ValorDePoker.DOS, miCarta.valor());
	}
	
	@Test
	void unaCartaSabeResponderSuPalo() {
		assertEquals(Palo.CORAZONES, miCarta.palo());
	}
	
	@Test
	void unaCartaSabeCompararsePorValorConOtraCarta() {
		Carta otraCarta = new Carta(ValorDePoker.CINCO, Palo.TREBOLES);
		assertFalse(miCarta.esSuperiorA(otraCarta));
	}
}
