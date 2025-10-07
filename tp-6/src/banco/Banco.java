package banco;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Banco {
	
	String razonSocial;
	Set<Cliente> clientes;
	List<SolicitudDeCredito> solicitudes;
	
	public Banco(String nombre) {
		this.razonSocial = nombre;
		this.clientes = new HashSet<Cliente>();
		this.solicitudes = new ArrayList<SolicitudDeCredito>();
	}

	public Integer cantidadDeClientes() {
		return clientes.size();
	}

	public void registrarCliente(Cliente cliente) {
		clientes.add(cliente);
	}

	public void registrarSolicitud(SolicitudDeCredito solicitud) {
		if(!this.clientes.contains(solicitud.getCliente())) {
			throw new IllegalArgumentException("El cliente que está solicitando un crédito no pertenece al banco.");
		}
		solicitudes.add(solicitud);
	}

	public Integer cantidadDeSolicitudesDeCredito() {
		return solicitudes.size();
	}

	public Double montoTotalADesembolsar() {
		return this.solicitudes.stream().filter(solicitud -> solicitud.esAceptable()).mapToDouble(solicitud -> solicitud.getMonto()).sum();
	}
}
