package ar.unq.edu.poo2.tp3;

import java.util.ArrayList;

public class Multioperador {

	// Precondición: La lista dada no está vacía.
	public static int sumatoria(ArrayList<Integer> xs) throws RuntimeException {
		if (xs.isEmpty()) {
			throw new RuntimeException("La lista dada no puede ser vacía.");
		}
		else {
			int resultado = 0;
			for (Integer x : xs) {
				resultado = resultado + x;
			}
			return resultado;
		}
	}
	
	// Precondición: La lista dada no está vacía.
	public static int restar(ArrayList<Integer> xs) throws RuntimeException {
		if (xs.isEmpty()) {
			throw new RuntimeException("La lista dada no puede ser vacía.");
		}
		else {
			int resultado = xs.getFirst();
			for(int i = 1; i < xs.size(); i++) {
				resultado = resultado - xs.get(i);
			}
			return resultado;
		}
	}
	
	// Precondición: La lista dada no está vacía.
	public static int productoria(ArrayList<Integer> xs) throws RuntimeException {
		if (xs.isEmpty()) {
			throw new RuntimeException("La lista dada no puede ser vacía.");
		}
		else {
			int resultado = 1;
			for(Integer x : xs) {
				resultado = resultado * x;
			}
			return resultado;
		}
	}
}
