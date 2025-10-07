package banco;

public abstract class SolicitudDeCredito {
	
	protected Cliente solicitante;
	protected double monto;
	protected int plazo;
	
	public SolicitudDeCredito(Cliente solicitante, double monto, int plazoAPagar) {
		asertarSolicitudDeCreditoValida(monto, plazoAPagar);
		this.solicitante = solicitante;
		this.monto = monto;
		this.plazo = plazoAPagar;
	}

	private void asertarSolicitudDeCreditoValida(double monto, int plazoAPagar) {
		if(monto < 0) {
			throw new IllegalArgumentException("El monto solicitado debe ser positivo.");
		}
		if(plazoAPagar <= 0) {
			throw new IllegalArgumentException("El plazo a pagar debe ser una cantidad de meses mayor a cero.");
		}
	}
	
	public abstract boolean esAceptable();

	public Cliente getCliente() {
		return this.solicitante;
	}
	
	public double montoCuotaMensual() {
		return this.monto / this.plazo;
	}

	public double getMonto() {
		return this.monto;
	}
}
