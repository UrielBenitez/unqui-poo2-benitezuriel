package ejercicioVideoJuego;

public class MaquinaNoPreparada extends EstadoDeMaquina {

	@Override
	public void jugar(MaquinaDeVideoJuego maquinaDeVideoJuego) {
		maquinaDeVideoJuego.setCartel("Ingrese fichas para jugar");
	}

	@Override
	protected EstadoDeMaquina contarFicha() {
		return new MaquinaUnJugador();
	}

}
