package banco;

import java.util.Objects;

public class Cliente {
	
	private String nombre;
	private String direccion;
	private int edad;
	private double sueldoNetoMensual;
	
	public Cliente(String nombre, String direccion, int edad, double sueldoNetoMensual) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoNetoMensual = sueldoNetoMensual;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(this.getClass() != o.getClass()) {
			return false;
		}
		Cliente otro = (Cliente) o;
		return this.nombre == otro.getNombre() && this.direccion == otro.getDireccion() && this.edad == otro.getEdad() && this.sueldoNetoMensual == otro.getSueldoMensual();
	}

	public double getSueldoMensual() {
		return this.sueldoNetoMensual;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public int getEdad() {
		return this.edad;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.nombre, this.direccion, this.edad, this.sueldoNetoMensual);
	}

	public double sueldoNetoAnual() {
		return this.sueldoNetoMensual * 12d;
	}
}
