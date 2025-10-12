package ejercicioReproductor;

public class Pausada extends Reproduccion {

	@Override
	public void play(Song cancion, ReproductorMP3 reproductor) {
		cancion.play();
		reproductor.setModo(new Sonando());
	}

	@Override
	public void pause(ReproductorMP3 reproductor) {
		reproductor.getCancion().play();
		reproductor.setModo(new Sonando());
	}

	@Override
	public String nombre() {
		return "Reproducción pausada";
	}

}
