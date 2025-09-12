package supermercado;

public class ProductoPrimeraNecesidad extends Producto {

	private int porcentajeDeDescuento;

	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado, int porcentajeDeDescuento) {
		super(nombre, precio, esPrecioCuidado);
		this.porcentajeDeDescuento = porcentajeDeDescuento;
	}
	
	@Override
	public Double getPrecio() {
		return super.getPrecio() - (super.getPrecio() * this.porcentajeDeDescuento / 100);
	}
}
