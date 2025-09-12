package supermercado;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	private ProductoPrimeraNecesidad arroz;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false, 10);
		arroz = new ProductoPrimeraNecesidad("Arroz", 18.9d, false, 8);
	}
	
	@Test
	public void testCalcularPrecioDeLeche() {
		assertEquals(new Double(7.2), leche.getPrecio());
	}
	
	@Test
	public void testCalcularPrecioDeArroz() {
		assertEquals(new Double(17.38), arroz.getPrecio());
	}
}
