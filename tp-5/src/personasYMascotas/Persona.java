package personasYMascotas;

import java.time.LocalDate;

public class Persona implements Comparable<Persona>, Nombrable{
	
	private String nombre;
	private LocalDate fechaDeNacimiento;

	public Persona(String unNombre, LocalDate unaFecha) {
		this.nombre = unNombre;
		this.fechaDeNacimiento = unaFecha;
	}

	public String nombre() {
		return this.nombre;
	}

	public LocalDate fechaDeNacimiento() {
		return this.fechaDeNacimiento;
	}

	public Integer edad() {
		return LocalDate.now().getYear() - this.fechaDeNacimiento.getYear();
	}
	
	@Override
	public int compareTo(Persona p) {
		return Integer.compare(this.edad(), p.edad());
	}

	public boolean esMenorQue(Persona p) {
		boolean resultado = false;
		if(this.compareTo(p) == -1) {
			resultado = true;
		}
		return resultado;	
	}

}
