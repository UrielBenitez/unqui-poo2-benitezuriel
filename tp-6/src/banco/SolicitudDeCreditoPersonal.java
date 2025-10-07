package banco;

public class SolicitudDeCreditoPersonal extends SolicitudDeCredito {

	public SolicitudDeCreditoPersonal(Cliente solicitante, double monto, int plazoAPagar) {
		super(solicitante, monto, plazoAPagar);
	}

	@Override
	public boolean esAceptable() {
		return this.solicitante.sueldoNetoAnual() >= 15000d && this.montoCuotaMensual() < this.solicitante.getSueldoMensual() * 0.7d; 
	}
}
