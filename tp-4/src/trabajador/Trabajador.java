package trabajador;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	
	private List<Ingreso> ingresosPercibidos;
	
	public Trabajador() {
		this.ingresosPercibidos = new ArrayList<Ingreso>();
	}

	public void registrarIngreso(Ingreso unIngresoARegistrar) {
		ingresosPercibidos.add(unIngresoARegistrar);
	}

	public float getTotalPercibido() {
		float total = 0;
		for(Ingreso i : ingresosPercibidos) {
			total = total + i.getMontoPercibido();
		}
		return total;
	}

	public float getMontoImponible() {
		float totalImponible = 0;
		for(Ingreso i : ingresosPercibidos) {
			totalImponible = totalImponible + i.getMontoImponible();
		}
		return totalImponible;
	}

	public float getImpuestoAPagar() {
		return (float) (this.getMontoImponible() * 0.02);
	}

}
