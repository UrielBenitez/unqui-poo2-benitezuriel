package ejercicioVideoJuego;

public class MaquinaUnJugador extends EstadoDeMaquina {

	@Override
	public void jugar(MaquinaDeVideoJuego maquinaDeVideoJuego) {
		maquinaDeVideoJuego.setCartel("Juego en curso para un jugador");
	}

	@Override
	protected EstadoDeMaquina contarFicha() {
		return new MaquinaDosJugadores();
	}

}
