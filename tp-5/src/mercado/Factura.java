package mercado;

public abstract class Factura implements Cobrable {
	private Agencia emisor;
	
	public Factura(Agencia agencia) {
		this.emisor = agencia;
	}
	
	public Agencia emisor() {
		return this.emisor;
	}
	
	public void registrarPagoEn(Caja caja) {
		this.emisor.registrarPago(this);
	}
	
	public abstract double monto();
}
