package ejercicioVideoJuego;

public abstract class EstadoDeMaquina {

	public abstract void jugar(MaquinaDeVideoJuego maquinaDeVideoJuego);

	protected abstract EstadoDeMaquina contarFicha();

}
