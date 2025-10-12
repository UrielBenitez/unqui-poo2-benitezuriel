package ejercicioReproductor;

public abstract class ModoReproductor {
	public abstract void play(Song cancion, ReproductorMP3 reproductor);
	public abstract void pause(ReproductorMP3 reproductor);
	public abstract void stop(ReproductorMP3 reproductor);
	public abstract String nombre();
}
