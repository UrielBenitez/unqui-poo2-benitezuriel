package mercado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoCooperativaTest {
	
	private ProductoCooperativa p = new ProductoCooperativa("Arroz-Coope", 8.2d);

	@Test
	void elPrecioDeUnProductoDeCooperativaTieneUnDescuentoDelDiezPorcientoDeSuPrecioOriginal() {
		assertEquals(7.38d, p.monto());
	}

}
