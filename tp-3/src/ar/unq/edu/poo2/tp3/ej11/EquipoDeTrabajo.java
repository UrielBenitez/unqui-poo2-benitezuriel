package ar.unq.edu.poo2.tp3.ej11;

import java.util.HashSet;
import java.util.Set;

public class EquipoDeTrabajo {
	
	private String nombre;
	private Set<Persona> integrantes;
	
	public EquipoDeTrabajo(String nombre) {
		this.nombre = nombre;
		this.integrantes = new HashSet<Persona>();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	/**
	 * @return 0 si no hay personas en el equipo, el promedio de edad si las hay*/
	public int promedioDeEdad() {
		int resultado = 0;
		for(Persona p : this.integrantes) {
			resultado = resultado + p.getEdad();
		}
		return resultado / this.integrantes.size();
	}
	
	public void agregarIntegrante(Persona p) {
		this.integrantes.add(p);
	}
	
	public int cantidadDeIntegrantes() {
		return this.integrantes.size();
	}
	
}
