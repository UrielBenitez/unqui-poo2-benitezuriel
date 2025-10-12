package ejercicioVideoJuego;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaquinaDeVideojuegoTest {
	
	MaquinaDeVideoJuego maquina = new MaquinaDeVideoJuego();
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testUnaMaquinaDeVideoJuegoComienzaSinFichas() {
		assertEquals(0, maquina.getCantidadDeFichas());
	}
	
	@Test
	void testUnaMaquinaDeVideoJuegoNoPuedeIniciarSinFichas() {
		maquina.iniciarJuego();
		assertEquals("Ingrese fichas para jugar", maquina.cartel());
	}
	
	@Test
	void testUnaMaquinaDeVideoJuegoConUnaFichaIniciaElJuegoParaUnJugador() {
		maquina.ingresarFicha();
		maquina.iniciarJuego();
		assertEquals("Juego en curso para un jugador", maquina.cartel());
		
	}
	
	@Test
	void testUnaMaquinaDeVideoJuegoConDosFichasIniciaElJuegoParaDosJugadores() {
		maquina = new MaquinaDeVideoJuego();
		maquina.ingresarFicha();
		maquina.ingresarFicha();
		
		maquina.iniciarJuego();
		
		assertEquals("Juego en curso para dos jugadores", maquina.cartel());
	}
	
	@Test
	void testAlFinalizarElJuegoLaMaquinaConsumeTodasLasFichas() {
		maquina = new MaquinaDeVideoJuego();
		maquina.ingresarFicha();
		maquina.iniciarJuego();
		
		maquina.finalizarJuego();
		
		assertEquals("Ingrese fichas para jugar", maquina.cartel());
	}
}
