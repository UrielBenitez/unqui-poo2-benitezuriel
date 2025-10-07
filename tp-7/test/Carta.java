public class Carta {
	
	private ValorDePoker valor;
	private Palo palo;
	
	public Carta(ValorDePoker valorDeCarta, Palo paloDeCarta) {
		valor = valorDeCarta;
		palo = paloDeCarta;
	}

	public ValorDePoker valor() {
		return valor;
	}
	
	public Palo palo() {
		return palo;
	}

	public boolean esSuperiorA(Carta otraCarta) {
		return valor.compareTo(otraCarta.valor()) > 0;
	}
}
