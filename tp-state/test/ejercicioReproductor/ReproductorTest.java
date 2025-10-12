package ejercicioReproductor;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

class ReproductorTest {
	ReproductorMP3 reproductor;
	@BeforeEach
	void setUp() throws Exception {
		reproductor = new ReproductorMP3();
	}

	@Test
	void unReproductorNuevoIniciaEnModoSeleccion() {
		assertEquals("Selección de canciones", reproductor.modo());
	}
	
	@Test
	void unReproductorEnModoSeleccionDeCancionesPuedeReproducirUnaCancionDada() {
		Song cancion = mock(Song.class);
		reproductor.play(cancion);
		assertEquals("Reproducción sonando", reproductor.modo());
	}
	
	@Test
	void unReproductorEnModoReproduccionNoPuedeDarlePlayAOtraCancion() {
		Song cancion1 = mock(Song.class);
		Song cancion2 = mock(Song.class);
		reproductor.play(cancion1);
		
		assertThrows(RuntimeException.class, () -> reproductor.play(cancion2));
	}
	
	@Test
	void unReproductorEnModoReproduccionPuedePausarLaCancionSonando() {
		Song cancion = spy(Song.class);
		reproductor.play(cancion);
		
		reproductor.pause();
		
		verify(cancion).pause();
		assertEquals("Reproducción pausada", reproductor.modo());
		
	}
	
	@Test
	void siSeSeHacePausaSobreUnReproductorPausado_SeRetomaLaReproducción() {
		Song cancion = spy(Song.class);
		reproductor.play(cancion);
		reproductor.pause();
		
		reproductor.pause();
		InOrder inOrder = inOrder(cancion);
		inOrder.verify(cancion).play();
		inOrder.verify(cancion).pause();
		inOrder.verify(cancion).play();
		assertEquals("Reproducción sonando", reproductor.modo());
	}
	
	@Test
	void noPuedeHacersePausaSobreUnReproductorSeleccionandoCancion() {
		assertThrows(RuntimeException.class, () -> reproductor.pause());
	}
	
	@Test
	void alPararUnReproductorEnModoReproduccion_ElReproductorPasaAModoSeleccion() {
		Song cancion = spy(Song.class);
		reproductor.play(cancion);
		
		reproductor.stop();
		
		verify(cancion).stop();
		assertEquals("Selección de canciones", reproductor.modo());
	}
	
	@Test
	void alPararUnReproductorPausado_TambienSePasaAModoSeleccion() {
		Song cancion = spy(Song.class);
		reproductor.play(cancion);
		reproductor.pause();
		
		reproductor.stop();
		
		verify(cancion).stop();
		assertEquals("Selección de canciones", reproductor.modo());
	}
}
