package mercado;

public class Agente implements Agencia {
	
	private String nombre;
	private int pagosRegistrados;
	
	public Agente(String nombreDelAgente) {
		this.nombre = nombreDelAgente;
		this.pagosRegistrados = 0;
	}

	@Override
	public void registrarPago(Factura f) {
		this.pagosRegistrados++;
	}
}
