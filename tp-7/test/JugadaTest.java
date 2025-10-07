import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JugadaTest {
	
	Jugada poker = new Poker();
	Jugada color = new Color();
	Jugada trio = new Trio();
	Jugada nada = new Nada();

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testPokerLeGanaATrio() {
		assertTrue(poker.leGanaA(trio));
	}
	@Test
	void testPokerLeGanaAColor() {
		assertTrue(poker.leGanaA(color));
	}
	@Test
	void testPokerLeGanaANada() {
		assertTrue(poker.leGanaA(nada));
	}
	@Test
	void testColorNoLeGanaAPoker() {
		assertFalse(color.leGanaA(poker));
	}
	@Test
	void testColorLeGanaATrio() {
		assertTrue(color.leGanaA(trio));
	}
	@Test
	void testColorLeGanaANada() {
		assertTrue(color.leGanaA(nada));
	}
	@Test
	void testNadaPierdeConTodo() {
		assertFalse(nada.leGanaA(poker));
		assertFalse(nada.leGanaA(color));
		assertFalse(nada.leGanaA(trio));
	}
	@Test
	void testCuandoCompitenPokerConPoker_GanaLaJugadaConMayorValorDeMano() {
		PokerStatus pokerSt = mock(PokerStatus.class);
		// Primera jugada
		Carta carta1 = mock(Carta.class);
		Carta carta2 = mock(Carta.class);
		Carta carta3 = mock(Carta.class);
		Carta carta4 = mock(Carta.class);
		Carta carta5 = mock(Carta.class);
		when(carta1.valor()).thenReturn(ValorDePoker.A);
		when(carta1.palo()).thenReturn(Palo.DIAMANTES);
		when(carta2.valor()).thenReturn(ValorDePoker.A);
		when(carta2.palo()).thenReturn(Palo.PICAS);
		when(carta3.valor()).thenReturn(ValorDePoker.A);
		when(carta3.palo()).thenReturn(Palo.TREBOLES);
		when(carta4.valor()).thenReturn(ValorDePoker.UNO);
		when(carta4.palo()).thenReturn(Palo.PICAS);
		when(carta5.valor()).thenReturn(ValorDePoker.A);
		when(carta5.palo()).thenReturn(Palo.CORAZONES);
		Jugada pokerJugadaUno = new Poker();
		pokerJugadaUno.setCartas(Arrays.asList(carta1, carta2, carta3, carta4, carta5));
		when(pokerSt.verificar(carta1, carta2, carta3, carta4, carta5)).thenReturn(pokerJugadaUno);
		// Segunda jugada
		Carta carta6 = mock(Carta.class);
		Carta carta7 = mock(Carta.class);
		Carta carta8 = mock(Carta.class);
		Carta carta9 = mock(Carta.class);
		Carta carta10 = mock(Carta.class);
		when(carta6.valor()).thenReturn(ValorDePoker.CINCO);
		when(carta6.palo()).thenReturn(Palo.DIAMANTES);
		when(carta7.valor()).thenReturn(ValorDePoker.CINCO);
		when(carta7.palo()).thenReturn(Palo.PICAS);
		when(carta8.valor()).thenReturn(ValorDePoker.A);
		when(carta8.palo()).thenReturn(Palo.TREBOLES);
		when(carta9.valor()).thenReturn(ValorDePoker.CINCO);
		when(carta9.palo()).thenReturn(Palo.PICAS);
		when(carta10.valor()).thenReturn(ValorDePoker.CINCO);
		when(carta10.palo()).thenReturn(Palo.CORAZONES);
		Jugada pokerJugadaDos = new Poker();
		pokerJugadaDos.setCartas(Arrays.asList(carta6, carta7, carta8, carta9, carta10));
		when(pokerSt.verificar(carta6, carta7, carta8, carta9, carta10)).thenReturn(pokerJugadaDos);
		
		assertTrue(pokerSt.verificar(carta1, carta2, carta3, carta4, carta5).leGanaA(pokerSt.verificar(carta6, carta7, carta8, carta9, carta10)));	
	}
}