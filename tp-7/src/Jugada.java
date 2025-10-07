import java.util.List;

public abstract class Jugada {
	protected List<Carta> mano;
	
	public abstract String nombre();
	public abstract boolean correspondeA(List<Carta> cartas);
	public abstract boolean leGanaA(Jugada unaJugada);
	public abstract boolean leGanaAColor();
	public abstract boolean leGanaAPoker();
	public abstract boolean leGanaATrio();
	public abstract Jugada nuevaPara(List<Carta> cartas);
	public void setCartas(List<Carta> cartas) {
		mano = cartas;
	}
}
