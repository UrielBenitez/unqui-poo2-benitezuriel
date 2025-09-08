package supermercado;

import java.util.function.BooleanSupplier;

public class Producto {
	
	private String nombre;
	private double precio;
	private boolean esPrecioCuidado;
	
	public Producto(String n, double p, boolean pc) {
		this.nombre = n;
		this.precio = p;
		this.esPrecioCuidado = pc;
	}
	
	public Producto(String n, double p) {
		this(n, p, false);
	}

	public String getNombre() {
		return nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}

	public void aumentarPrecio(double d) {
		precio = precio + d;
	}

}
