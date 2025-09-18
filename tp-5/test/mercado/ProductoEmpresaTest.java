package mercado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoEmpresaTest {
	
	private ProductoEmpresa miProducto;
	
	@BeforeEach
	void setUp() throws Exception {
		miProducto = new ProductoEmpresa("Arroz", 10.7f);
	}

	@Test
	void elPrecioDeUnProductoDeEmpresaEsSuPrecioOriginal() {
		assertEquals(10.7f, miProducto.monto());
	}

}
