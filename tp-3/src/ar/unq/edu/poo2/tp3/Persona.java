package ar.unq.edu.poo2.tp3;

import java.time.LocalDateTime;
import java.util.Date;

public class Persona {
	
	private String nombre;
	private Date fechaDeNacimiento;
	
	public Persona(String nombre, Date fechaDeNacimiento) {
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	public String nombre() {
		return this.nombre;
	}
	
	public Date fechaDeNacimiento() {
		return this.fechaDeNacimiento;
	}
	
	public int edad() {
		return LocalDateTime.now().getYear() - this.fechaDeNacimiento.getYear();
	}
	
	public boolean menorQue(Persona p) {
		return this.edad() < p.edad();
	}
}
