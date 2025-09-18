package mercado;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Mercado {
	
	private HashMap<Producto, Integer> stock;
	private Set<Caja> cajas;
	
	public Mercado() {
		stock = new HashMap<Producto, Integer>();
		cajas = new HashSet<Caja>();
	}
	
	public void aumentarStock(Producto p, int cantidad) {
		if(stock.containsKey(p)) {
			int cantidadActual = stock.get(p);
			stock.put(p, cantidadActual + cantidad);
		}
		else {
			stock.put(p, cantidad);
		}
	}
	
	public void decrementarStock(Producto p, int cantidad) {
		if(stock.containsKey(p)) {
			int cantidadActual = stock.get(p);
			if(cantidadActual >= cantidad) {
				stock.put(p, cantidadActual - cantidad);
			}
			else {
				stock.put(p, 0);
			}
		}
	}

	public void abrirCaja(Caja miCaja) {
		this.cajas.add(miCaja);
	}
	
	
}
