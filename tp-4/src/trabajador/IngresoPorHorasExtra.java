package trabajador;

import java.time.Month;

public class IngresoPorHorasExtra extends Ingreso {
	
	private int horasExtraRealizadas;
	
	public IngresoPorHorasExtra(Month unMes, String unConcepto, float unMontoBase, int unaCantidadDeHoras) {
		super(unMes, unConcepto, unMontoBase);
		this.horasExtraRealizadas = unaCantidadDeHoras;
	}
	
	@Override
	public float getMontoPercibido() {
		return super.getMontoPercibido() * this.horasExtraRealizadas;
	}
	
	@Override
	public float getMontoImponible() {
		return 0;
	}
}
