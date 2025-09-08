package supermercado;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	
	private String nombre;
	private String direccion;
	private List<Producto> productos;
	
	public Supermercado(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.productos = new ArrayList<Producto>();
	}

	public Integer getCantidadDeProductos() {
		return this.productos.size();
	}

	public void agregarProducto(Producto unProducto) {
		this.productos.add(unProducto);
	}

	public Double getPrecioTotal() {
		double resultado = 0;
		for (Producto producto : productos) {
			resultado += producto.getPrecio();
		};
		return resultado;
	}

}
