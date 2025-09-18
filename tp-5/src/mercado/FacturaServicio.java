package mercado;

public class FacturaServicio extends Factura {
	
	private double costoPorUnidad;
	private int cantidadDeUnidadesConsumidas;
	
	public FacturaServicio(Agente agente, double costoPorUnidad, int cantidadConsumida) {
		super(agente);
		this.costoPorUnidad = costoPorUnidad;
		this.cantidadDeUnidadesConsumidas = cantidadConsumida;
	}
	@Override
	public double monto() {
		return this.costoPorUnidad * this.cantidadDeUnidadesConsumidas;
	}
}
