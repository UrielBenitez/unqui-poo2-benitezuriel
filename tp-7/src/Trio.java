import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Trio extends Jugada {

	@Override
	public String nombre() {
		return "Trio";
	}

	@Override
	public boolean correspondeA(List<Carta> cartas) {
		Map<ValorDePoker, Integer> bagDeCartas = new HashMap<ValorDePoker, Integer>();
		for(Carta carta : cartas) {
			ValorDePoker k = carta.valor();
			bagDeCartas.put(k, bagDeCartas.getOrDefault(k, 0) + 1);
		}
		return bagDeCartas.containsValue(3);
	}

	@Override
	public boolean leGanaA(Jugada unaJugada) {
		// TODO Auto-generated method stub
		return !unaJugada.leGanaATrio();
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
		return false;
	}

	@Override
	public Jugada nuevaPara(List<Carta> cartas) {
		Jugada nuevaJugada = new Trio();
		nuevaJugada.setCartas(cartas);
		return nuevaJugada;
	}

}
