package ejercicioReproductor;

public class ReproductorMP3 {
	
	private ModoReproductor modo;
	private Song cancionSeleccionada;

	public ReproductorMP3() {
		modo = new Seleccion();
	}
	public String modo() {
		return modo.nombre();
	}

	public void play(Song cancion) {
		modo.play(cancion, this);
	}
	
	public void setModo(ModoReproductor unModoReproductor) {
		modo = unModoReproductor;
	}
	public void setCancion(Song cancion) {
		cancionSeleccionada = cancion;
	}
	public void pause() {
		modo.pause(this);
	}
	public Song getCancion() {
		return cancionSeleccionada;
	}
	public void stop() {
		modo.stop(this);
	}

}
