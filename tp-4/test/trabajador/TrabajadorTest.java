package trabajador;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Month;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTest {
	
	private Trabajador pepe = new Trabajador();

	@BeforeEach
	void setUp() throws Exception {
		pepe = new Trabajador();
		pepe.registrarIngreso(new Ingreso(Month.JANUARY, "Sueldo", 100));
		pepe.registrarIngreso(new IngresoPorHorasExtra(Month.JANUARY, "HorasExtra", 120, 4));
	}

	@Test
	void unTrabajadorConoceElMontoPercibidoTotalPorSusIngresos() {
		assertEquals(580, pepe.getTotalPercibido());
	}

	@Test
	void elMontoImponibleParaUnTrabajadorConsisteEnElMontoDeTodosSusIngresos_SalvoLosIngresosPorHorasExtra() {
		assertEquals(100, pepe.getMontoImponible());
	}
	
	@Test
	void unTrabajadorSabeCuantoDineroDebeEnImpuestoAlTrabajador() {
		assertEquals(2, pepe.getImpuestoAPagar());
	}
}
