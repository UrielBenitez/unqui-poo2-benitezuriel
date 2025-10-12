package ejercicioReproductor;

public class Seleccion extends ModoReproductor {

	@Override
	public void play(Song cancion, ReproductorMP3 reproductor) {
		cancion.play(); // Interactuo a través de la interfaz Song
		reproductor.setModo(new Sonando()); // Realizo el cambio de estado
		reproductor.setCancion(cancion);
	}

	@Override
	public void pause(ReproductorMP3 reproductor) {
		throw new RuntimeException("No puede hacerse pausa en modo selección.");
	}

	@Override
	public void stop(ReproductorMP3 reproductor) {
		// TODO Auto-generated method stub

	}

	@Override
	public String nombre() {
		return "Selección de canciones";
	}
}
