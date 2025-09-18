package mercado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTest {
	private Mercado mercadoCentral = new Mercado();
	private Caja miCaja = new Caja(mercadoCentral);
	private ProductoEmpresa pe = new ProductoEmpresa("Arroz", 10.2d);
	private ProductoCooperativa pc = new ProductoCooperativa("Fideo-Coope", 8.5d);
	private Agente edesur = new Agente("Edesur");
	private Factura facturaLuz = new FacturaServicio(edesur, 20.5d, 10);
	private Factura facturaImpuesto = new FacturaImpuesto(edesur, 11.2d);
	
	@BeforeEach
	void setUp() throws Exception {
		mercadoCentral.abrirCaja(miCaja);
		miCaja.siguienteCliente();
		mercadoCentral.aumentarStock(pe, 10);
		mercadoCentral.aumentarStock(pc, 10);
	}

	@Test
	void unaCajaSabeElMontoACobrarPorSusProductosRegistrados() {
		miCaja.registrarCobrable(pe);
		miCaja.registrarCobrable(pc);
		assertEquals(17.85d, miCaja.getMonto());
	}
	
	@Test
	void unaCajaPermitePagarFacturasASusClientes() {
		miCaja.registrarCobrable(facturaLuz);
		miCaja.registrarCobrable(facturaImpuesto);
		assertEquals(216.2d, miCaja.getMonto());
	}

}
