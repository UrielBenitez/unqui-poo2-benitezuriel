package personasYMascotas;

import java.time.LocalDate;
import java.util.ArrayList;

public class Mascota implements Nombrable {
	
	private String nombre;
	private String raza;
	
	public Mascota(String nombre, String raza) {
		this.nombre = nombre;
		this.raza = raza;
	}

	@Override
	public String nombre() {
		return this.nombre;
	}

	public String raza() {
		return this.raza;
	}
	
	public static void main(String[] args) {
		Mascota mascota1 = new Mascota("Max", "Coker");
		Mascota mascota2 = new Mascota("Nina", "Gato callejero");
		Persona persona1 = new Persona("Uriel", LocalDate.of(2004, 3, 25));
		Persona persona2 = new Persona("Angela", LocalDate.of(1970, 5, 29));
		ArrayList<Nombrable> lista = new ArrayList<Nombrable>();
		lista.add(mascota1);
		lista.add(mascota2);
		lista.add(persona1);
		lista.add(persona2);
		for(Nombrable nombrable : lista) {
			System.out.println(nombrable.nombre());
		}
	}
}
