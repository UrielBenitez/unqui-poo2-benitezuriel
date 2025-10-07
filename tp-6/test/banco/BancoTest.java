package banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BancoTest {
	
	Banco banco = new Banco("Provincia");

	@Test
	void unBancoAbreSinClientes() {
		assertEquals(0, banco.cantidadDeClientes());
	}
	
	@Test
	void alRegistrarUnClienteEnElBanco_laCantidadDeClientesAumentaEnUno() {
		banco.registrarCliente(new Cliente("Uriel Benitez", "116 A 1528", 21, 15000d));
		assertEquals(1, banco.cantidadDeClientes());
	}
	
	@Test
	void alIntentarRegistrarMasDeUnaVezAlMismoClienteEnElBanco_SoloSeContabilizaElPrimerRegistro() {
		banco = new Banco("Provincia");
		banco.registrarCliente(new Cliente("Uriel Benitez", "116 A 1528", 21, 15000d));
		banco.registrarCliente(new Cliente("Uriel Benitez", "116 A 1528", 21, 15000d));
		assertEquals(1, banco.cantidadDeClientes());
	}
	
	@Test 
	void unBancoRegistraSolicitudesDeCreditoDeSusClientes() {
		banco = new Banco("Provincia");
		Cliente unCliente = new Cliente("Uriel Benitez", "116 A 1528", 21, 15000d);
		banco.registrarCliente(unCliente);
		
		banco.registrarSolicitud(new SolicitudDeCreditoPersonal(unCliente, 12000d, 12));
		
		assertEquals(1, banco.cantidadDeSolicitudesDeCredito());	
	}
	
	@Test
	void unaSolicitudDeCreditoPersonalSabeResponderSiEsAceptable() {
		Cliente unCliente = new Cliente("Uriel Benitez", "116 A 1528", 21, 1500d);
		SolicitudDeCredito solicitud = new SolicitudDeCreditoPersonal(unCliente, 12000d, 12);
		assertTrue(solicitud.esAceptable());
	}
	
	@Test
	void unaSolicitudDeCreditoHipotecarioSabeResponderSiEsAceptable() {
		Cliente unCliente = new Cliente("Uriel Benitez", "116 A 1528", 21, 2100d);
		PropiedadInmobiliaria unaPropiedad = new PropiedadInmobiliaria("Con garage", "116 A 1528", 20000d);
		SolicitudDeCredito solicitud = new SolicitudDeCreditoHipotecario(unCliente, 12000d, 12, unaPropiedad);
		assertTrue(solicitud.esAceptable());
	}
	
	@Test
	void unBancoConoceElMontoTotalADesembolsarEnCreditosSolicitados() {
		banco = new Banco("Provincia");
		banco.registrarCliente(new Cliente("Uriel Benitez", "116 A 1528", 21, 15000d));
		banco.registrarCliente(new Cliente("Agustin Benitez", "116 A 1528", 21, 15000d));
		PropiedadInmobiliaria unaPropiedad = new PropiedadInmobiliaria("Con garage", "116 A 1528", 20000d);
		SolicitudDeCredito solicitudH = new SolicitudDeCreditoHipotecario(new Cliente("Uriel Benitez", "116 A 1528", 21, 15000d), 9000d, 12, unaPropiedad);
		SolicitudDeCredito solicitudP = new SolicitudDeCreditoPersonal(new Cliente("Agustin Benitez", "116 A 1528", 21, 15000d), 12000d, 12);
		banco.registrarSolicitud(solicitudH);
		banco.registrarSolicitud(solicitudP);
		assertEquals(21000d, banco.montoTotalADesembolsar());
	}

}
