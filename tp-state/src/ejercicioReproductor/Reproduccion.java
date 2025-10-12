package ejercicioReproductor;

public abstract class Reproduccion extends ModoReproductor {
	
	public void stop(ReproductorMP3 reproductor) {
		reproductor.getCancion().stop();
		reproductor.setModo(new Seleccion());
	}

}
