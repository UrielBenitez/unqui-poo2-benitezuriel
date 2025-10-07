import java.util.*;

public class PokerStatus {
	
	private List<Jugada> jugadasPosibles;
	
	public PokerStatus(List<Jugada> jugadas) {
		jugadasPosibles = jugadas;
	}
	
	public Jugada verificar(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		List<Carta> cartas = new ArrayList<Carta>();
		cartas.add(carta1);
		cartas.add(carta2);
		cartas.add(carta3);
		cartas.add(carta4);
		cartas.add(carta5);
		return this.jugadaPara(cartas);
	}

	private Jugada jugadaPara(List<Carta> cartas) {
		List<Jugada> jugadasQueAplican = jugadasPosibles.stream().filter(jugada -> jugada.correspondeA(cartas)).toList();
		Jugada jugadaGanadora = jugadasQueAplican.get(0); // Por invariante se que esta lista siempre tiene un elemento, pues la jugada Nada aplica para todas las manos.
		for(Jugada j : jugadasQueAplican) {
			if(j.leGanaA(jugadaGanadora)) {jugadaGanadora = j;}
		}
		return jugadaGanadora.nuevaPara(cartas);
	}
	
	public void agregarJugada(Jugada unaJugadaNueva) {
		jugadasPosibles.add(unaJugadaNueva);
	}
}
