package mercado;

public abstract class Producto implements Cobrable {
	
	protected String nombre;
	protected double precioOriginal;
	
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precioOriginal = precio;
	}
		
	public void registrarPagoEn(Caja c) {
		c.mercado().decrementarStock(this, 1);
	}
}
