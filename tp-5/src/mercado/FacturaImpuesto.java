package mercado;

public class FacturaImpuesto extends Factura {
	
	private double tasaDeServicio;

	public FacturaImpuesto(Agencia agencia, double tasaDeServicio) {
		super(agencia);
		this.tasaDeServicio = tasaDeServicio;
	}
	@Override
	public double monto() {
		return this.tasaDeServicio;
	}

}
