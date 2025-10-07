import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Color extends Jugada {

	@Override
	public String nombre() {
		return "Color";
	}

	@Override
	public boolean correspondeA(List<Carta> cartas) {
		Map<Palo, Integer> bagDeCartas = new HashMap<Palo, Integer>();
		for(Carta carta : cartas) {
			Palo k = carta.palo();
			bagDeCartas.put(k, bagDeCartas.getOrDefault(k, 0) + 1);
		}
		return bagDeCartas.containsValue(5);
	}

	@Override
	public boolean leGanaA(Jugada unaJugada) {
		// TODO Auto-generated method stub
		return !unaJugada.leGanaAColor();
	}

	@Override
	public boolean leGanaAPoker() {
		// TODO Auto-generated method stub
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
		return true;
	}

	@Override
	public Jugada nuevaPara(List<Carta> cartas) {
		Jugada nuevaJugada = new Color();
		nuevaJugada.setCartas(cartas);
		return nuevaJugada;
	}

}
