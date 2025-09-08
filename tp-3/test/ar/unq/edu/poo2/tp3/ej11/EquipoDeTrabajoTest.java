package ar.unq.edu.poo2.tp3.ej11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTest {
	 
	private EquipoDeTrabajo miEquipoDeTrabajo;
	
	@BeforeEach
	void setUp() throws Exception {
		miEquipoDeTrabajo = new EquipoDeTrabajo("Equipo de Objetos-2");
		Persona p1 = new Persona("Uriel", "Benitez", 21);
		Persona p2 = new Persona("Agustin", "Benitez", 28);
		Persona p3 = new Persona("Angela", "Bosch", 52);
		Persona p4 = new Persona("Pepe", "Gonzalez", 55);
		Persona p5 = new Persona("Maria", "Gimenez", 30);
		miEquipoDeTrabajo.agregarIntegrante(p1);
		miEquipoDeTrabajo.agregarIntegrante(p2);
		miEquipoDeTrabajo.agregarIntegrante(p3);
		miEquipoDeTrabajo.agregarIntegrante(p4);
		miEquipoDeTrabajo.agregarIntegrante(p5);
	}

	@Test
	void unEquipoDeTrabajoSabeCuantosIntegrantesTiene() {
		assertEquals(5, miEquipoDeTrabajo.cantidadDeIntegrantes());
	}
	
	@Test
	void unEquipoDeTrabajoSabeElPromedioDeEdadDeSusIntegrantes() {
		assertEquals(37, miEquipoDeTrabajo.promedioDeEdad());
	}

}
