package trabajador;

import java.time.Month;

public class Ingreso {
	
	private Month mesDePercepcion;
	private String concepto;
	private float montoPercibido;
	
	public Ingreso(Month unMes, String unConcepto, float unMonto) {
		this.mesDePercepcion = unMes;
		this.concepto = unConcepto;
		this.montoPercibido = unMonto;
	}

	public float getMontoPercibido() {
		return this.montoPercibido;
	}

	public float getMontoImponible() {
		return this.montoPercibido;
	}
	
	
}
