package mercado;

public class ProductoCooperativa extends Producto implements Cobrable {
	
	public ProductoCooperativa(String nombre, double precioOriginal) {
		super(nombre, precioOriginal);
	}
	
	@Override
	public double monto() {
		return this.precioOriginal * this.porcentajeDeDescuento();
	}

	private double porcentajeDeDescuento() {
		return 0.9d;
	}
}
