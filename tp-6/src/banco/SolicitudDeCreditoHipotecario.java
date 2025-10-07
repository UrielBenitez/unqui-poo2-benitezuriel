package banco;

public class SolicitudDeCreditoHipotecario extends SolicitudDeCredito {

	private PropiedadInmobiliaria garantia;
	
	public SolicitudDeCreditoHipotecario(Cliente solicitante, double monto, int plazoAPagar, PropiedadInmobiliaria garantia) {
		super(solicitante, monto, plazoAPagar);
		this.garantia = garantia;
	}

	@Override
	public boolean esAceptable() {
		return this.montoCuotaMensual() < this.solicitante.getSueldoMensual() * 0.5d &&
			   this.monto < this.garantia.valorFiscal() * 0.7 &&
			   this.solicitante.getEdad() + this.plazo / 12 < 65;
	}

}
