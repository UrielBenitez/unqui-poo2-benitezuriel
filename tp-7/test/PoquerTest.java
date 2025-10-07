import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class PoquerTest {
	List<Jugada> jugadasDisponibles = Arrays.asList(new Poker(), new Color(), new Trio(), new Nada());
	PokerStatus pokerSt = new PokerStatus(jugadasDisponibles);
	
	// Póquer
	@Test
	void testUnPokerStatusSabeVerificarSiHayPokerEnUnaManoDada() {
		assertEquals("Poker", pokerSt.verificar(new Carta(ValorDePoker.CUATRO, Palo.DIAMANTES),
				new Carta(ValorDePoker.CUATRO, Palo.PICAS),
				new Carta(ValorDePoker.CUATRO, Palo.CORAZONES),
				new Carta(ValorDePoker.CUATRO, Palo.TREBOLES), 
				new Carta(ValorDePoker.DIEZ, Palo.CORAZONES)).nombre());
	}
	
	@Test 
	void testnoHayPoker() {
		assertEquals("Nada", pokerSt.verificar(
				new Carta(ValorDePoker.CINCO, Palo.PICAS),
				new Carta(ValorDePoker.UNO, Palo.TREBOLES),
				new Carta(ValorDePoker.CINCO, Palo.DIAMANTES),
				new Carta(ValorDePoker.DOS, Palo.PICAS), 
				new Carta(ValorDePoker.DIEZ, Palo.TREBOLES)).nombre());
	}
	
	// Póquer continuación
	
	@Test
	void testenUnaManoPuedeNoHaberUnaJugada() {
		assertEquals("Nada", pokerSt.verificar(
				new Carta(ValorDePoker.DOS, Palo.PICAS),
				new Carta(ValorDePoker.UNO, Palo.TREBOLES),
				new Carta(ValorDePoker.CINCO, Palo.DIAMANTES),
				new Carta(ValorDePoker.DOS, Palo.CORAZONES),
				new Carta(ValorDePoker.DIEZ, Palo.CORAZONES)).nombre());
	}
	
	@Test
	void testenUnaManoPuedeHaberTrio() {
		assertEquals("Trio", pokerSt.verificar(
				new Carta(ValorDePoker.TRES, Palo.DIAMANTES),
				new Carta(ValorDePoker.CUATRO, Palo.PICAS),
				new Carta(ValorDePoker.TRES, Palo.TREBOLES),
				new Carta(ValorDePoker.DIEZ, Palo.TREBOLES),
				new Carta(ValorDePoker.TRES, Palo.CORAZONES)).nombre());
	}
	
	@Test
	void testenUnaManoPuedeHaberColor() {
		assertEquals("Color", pokerSt.verificar(
				new Carta(ValorDePoker.TRES, Palo.DIAMANTES),
				new Carta(ValorDePoker.DIEZ, Palo.DIAMANTES),
				new Carta(ValorDePoker.DOS, Palo.DIAMANTES),
				new Carta(ValorDePoker.CUATRO, Palo.DIAMANTES),
				new Carta(ValorDePoker.CINCO, Palo.DIAMANTES)).nombre());
	}
}
