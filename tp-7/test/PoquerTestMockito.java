import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PoquerTestMockito {
	private Jugada poker = mock(Jugada.class);
	private Jugada trio = mock(Jugada.class);
	private Jugada color = mock(Jugada.class);
	private Jugada nada = mock(Jugada.class);
	private List<Jugada> jugadasDisponibles = Arrays.asList(poker, color, trio, nada);
	private PokerStatus pokerSt = new PokerStatus(jugadasDisponibles);
	private Carta cuatroPicas = mock(Carta.class);
	private Carta cuatroCorazones = mock(Carta.class);
	private Carta cuatroTreboles = mock(Carta.class);
	private Carta cuatroDiamantes = mock(Carta.class);
	private Carta diezCorazones = mock(Carta.class);
	
	private Carta cincoPicas = mock(Carta.class);
	private Carta unoTreboles = mock(Carta.class);
	private Carta cincoDiamantes = mock(Carta.class);
	private Carta dosPicas = mock(Carta.class);
	private Carta diezTreboles = mock(Carta.class);
	
	private Carta dosCorazones = mock(Carta.class);
	private Carta tresDiamantes = mock(Carta.class);
	private Carta tresTreboles = mock(Carta.class);
	private Carta tresCorazones = mock(Carta.class);
	private Carta diezDiamantes = mock(Carta.class);
	private Carta dosDiamantes = mock(Carta.class);
	@BeforeEach
	void setUp() throws Exception {
		when(cuatroPicas.valor()).thenReturn(ValorDePoker.CUATRO);
		when(cuatroPicas.palo()).thenReturn(Palo.PICAS);
		when(cuatroCorazones.valor()).thenReturn(ValorDePoker.CUATRO);
		when(cuatroCorazones.palo()).thenReturn(Palo.CORAZONES);
		when(cuatroTreboles.valor()).thenReturn(ValorDePoker.CUATRO);
		when(cuatroTreboles.palo()).thenReturn(Palo.TREBOLES);
		when(cuatroDiamantes.valor()).thenReturn(ValorDePoker.CUATRO);
		when(cuatroDiamantes.palo()).thenReturn(Palo.DIAMANTES);
		when(diezCorazones.valor()).thenReturn(ValorDePoker.DIEZ);
		when(diezCorazones.palo()).thenReturn(Palo.CORAZONES);
		when(cincoPicas.valor()).thenReturn(ValorDePoker.CINCO);
		when(cincoPicas.palo()).thenReturn(Palo.PICAS);
		when(unoTreboles.valor()).thenReturn(ValorDePoker.UNO);
		when(unoTreboles.palo()).thenReturn(Palo.TREBOLES);
		when(cincoDiamantes.valor()).thenReturn(ValorDePoker.CINCO);
		when(cincoDiamantes.palo()).thenReturn(Palo.DIAMANTES);
		when(dosPicas.valor()).thenReturn(ValorDePoker.DOS);
		when(dosPicas.palo()).thenReturn(Palo.PICAS);
		when(diezTreboles.valor()).thenReturn(ValorDePoker.DIEZ);
		when(diezTreboles.palo()).thenReturn(Palo.TREBOLES);
		when(dosCorazones.valor()).thenReturn(ValorDePoker.DOS);
		when(dosCorazones.palo()).thenReturn(Palo.CORAZONES);
		when(tresDiamantes.valor()).thenReturn(ValorDePoker.TRES);
		when(tresDiamantes.palo()).thenReturn(Palo.DIAMANTES);
		when(tresTreboles.valor()).thenReturn(ValorDePoker.TRES);
		when(tresTreboles.palo()).thenReturn(Palo.TREBOLES);
		when(tresCorazones.valor()).thenReturn(ValorDePoker.TRES);
		when(tresCorazones.palo()).thenReturn(Palo.CORAZONES);
		when(diezDiamantes.valor()).thenReturn(ValorDePoker.DIEZ);
		when(diezDiamantes.palo()).thenReturn(Palo.DIAMANTES);
		when(dosDiamantes.valor()).thenReturn(ValorDePoker.DOS);
		when(dosDiamantes.palo()).thenReturn(Palo.DIAMANTES);
	}
	@Test
	void testUnPokerStatusSabeVerificarSiHayPokerEnUnaManoDada() {
		assertEquals("Poker", pokerSt.verificar(diezCorazones, cuatroTreboles, cuatroPicas, cuatroDiamantes, cuatroCorazones));
	}
	
	/*void testUnPokerStatusSabeVerificarSiHayPokerEnUnaManoDada() {
		assertEquals("Poker", pokerSt.verificar(new Carta(ValorDePoker.CUATRO, Palo.DIAMANTES),
				new Carta(ValorDePoker.CUATRO, Palo.PICAS),
				new Carta(ValorDePoker.CUATRO, Palo.CORAZONES),
				new Carta(ValorDePoker.CUATRO, Palo.TREBOLES), 
				new Carta(ValorDePoker.DIEZ, Palo.CORAZONES)));
	}
	
*/
	@Test
	void testNoHayPoker() {
		assertEquals("Nada", pokerSt.verificar(cincoPicas, unoTreboles, cincoDiamantes, dosPicas, diezTreboles));
	}
	
	/*@Test 
	void testnoHayPoker() {
		assertEquals("Nada", pokerSt.verificar(
				new Carta(ValorDePoker.CINCO, Palo.PICAS),
				new Carta(ValorDePoker.UNO, Palo.TREBOLES),
				new Carta(ValorDePoker.CINCO, Palo.DIAMANTES),
				new Carta(ValorDePoker.DOS, Palo.PICAS), 
				new Carta(ValorDePoker.DIEZ, Palo.TREBOLES)));
	}*/
	@Test
	void testEnUnaManoPuedeNoHaberUnaJugada() {
		assertEquals("Nada", pokerSt.verificar(dosPicas, unoTreboles, cincoDiamantes, dosCorazones, diezCorazones));
	}
	/*
	@Test
	void testenUnaManoPuedeNoHaberUnaJugada() {
		assertEquals("Nada", pokerSt.verificar(
				new Carta(ValorDePoker.DOS, Palo.PICAS),
				new Carta(ValorDePoker.UNO, Palo.TREBOLES),
				new Carta(ValorDePoker.CINCO, Palo.DIAMANTES),
				new Carta(ValorDePoker.DOS, Palo.CORAZONES),
				new Carta(ValorDePoker.DIEZ, Palo.CORAZONES)));
	}*/
	@Test
	void testEnUnaManoPuedeHaberTrio() {
		assertEquals("Trio", pokerSt.verificar(tresDiamantes, cuatroPicas, tresTreboles, diezTreboles, tresCorazones));
	}
	
	@Test
	void testEnUnaManoPuedeHaberColor() {
		assertEquals("Color", pokerSt.verificar(tresDiamantes, diezDiamantes, cuatroDiamantes, cincoDiamantes, dosDiamantes));
	}
	
	@Test
	void testSePuedenAgregarNuevasJugadas() {
		// Setup
		List<Jugada> jugadasSpy = spy(new ArrayList<Jugada>());
		Jugada nuevaJugada = mock(Jugada.class);
		pokerSt = new PokerStatus(jugadasSpy);
		
		// Exercise
		pokerSt.agregarJugada(nuevaJugada);
		
		// Verification - Assertion
		verify(jugadasSpy).add(nuevaJugada);
	}
}
