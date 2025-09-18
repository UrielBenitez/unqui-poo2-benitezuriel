package mercado;

public class ProductoEmpresa extends Producto implements Cobrable {
	
	public ProductoEmpresa(String nombre, double precioOriginal) {
		super(nombre, precioOriginal);
	}
	
	@Override
	public double monto() {
		return this.precioOriginal;
	}
}
