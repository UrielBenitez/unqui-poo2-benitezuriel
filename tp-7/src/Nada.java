import java.util.List;

public class Nada extends Jugada {

	@Override
	public String nombre() {
		return "Nada";
	}

	@Override
	public boolean correspondeA(List<Carta> cartas) {
		return true;
	}

	@Override
	public boolean leGanaA(Jugada unaJugada) {
		return false;
	}

	@Override
	public boolean leGanaAPoker() {
		return false;
	}

	@Override
	public boolean leGanaAColor() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean leGanaATrio() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Jugada nuevaPara(List<Carta> cartas) {
		Jugada nuevaJugada = new Nada();
		nuevaJugada.setCartas(cartas);
		return nuevaJugada;
	}

}
