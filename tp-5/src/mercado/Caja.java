package mercado;

public class Caja {
	
	private Mercado dueño;
	private double montoACobrar;
	
	public Caja(Mercado mercado) {
		this.dueño = mercado;
	}

	public void registrarProducto(Producto p) {
			this.dueño.decrementarStock(p, 1);
			this.montoACobrar = montoACobrar + p.monto();
	}

	public double getMonto() {
		return this.montoACobrar;
	}

	public void siguienteCliente() {
		this.montoACobrar = 0d;
		
	}

	public void registrarCobrable(Cobrable c) {
		this.montoACobrar = montoACobrar + c.monto();
		c.registrarPagoEn(this);
	}

	public void registrarFactura(Factura f) {
		this.montoACobrar = montoACobrar + f.monto();
		f.emisor().registrarPago(f);
	}

	public Mercado mercado() {
		return dueño;
	}
}
