package ejercicioReproductor;

public class Sonando extends Reproduccion {

	@Override
	public void play(Song cancion, ReproductorMP3 reproductor) {
		throw new RuntimeException("No se puede reproducir una canción nueva cuando hay otra SONANDO");
	}

	@Override
	public void pause(ReproductorMP3 reproductor) {
		reproductor.getCancion().pause();
		reproductor.setModo(new Pausada());
	}

	@Override
	public String nombre() {
		return "Reproducción sonando";
	}

}
