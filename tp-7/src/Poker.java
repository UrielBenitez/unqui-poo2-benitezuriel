import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Poker extends Jugada {

	@Override
	public String nombre() {
		return "Poker";
	}

	@Override
	public boolean correspondeA(List<Carta> cartas) {
		Map<ValorDePoker, Integer> bagDeCartas = new HashMap<ValorDePoker, Integer>();
		for(Carta carta : cartas) {
			ValorDePoker k = carta.valor();
			bagDeCartas.put(k, bagDeCartas.getOrDefault(k, 0) + 1);
		}
		return bagDeCartas.containsValue(4);
	}

	@Override
	public boolean leGanaA(Jugada unaJugada) {
		return !unaJugada.leGanaAPoker();
	}

	@Override
	public boolean leGanaAPoker() {
		return false;
	}

	@Override
	public boolean leGanaAColor() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean leGanaATrio() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Jugada nuevaPara(List<Carta> cartas) {
		Jugada nuevaJugada = new Poker();
		nuevaJugada.setCartas(cartas);
		return nuevaJugada;
	}

}
