package ejercicioVideoJuego;

public class MaquinaDosJugadores extends EstadoDeMaquina {

	@Override
	public void jugar(MaquinaDeVideoJuego maquinaDeVideoJuego) {
		maquinaDeVideoJuego.setCartel("Juego en curso para dos jugadores");
	}

	@Override
	protected EstadoDeMaquina contarFicha() {
		return this;
	}

}
