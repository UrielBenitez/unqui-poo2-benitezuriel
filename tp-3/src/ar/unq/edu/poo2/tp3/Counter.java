package ar.unq.edu.poo2.tp3;

import java.util.ArrayList;

public class Counter {
	
	private ArrayList<Integer> lista = new ArrayList<Integer>();
	
	public int cantidadDePares() {
		int cantidadDeParesEncontrada = 0;
		for (Integer numero : lista) {
			if (numero % 2 == 0) {cantidadDeParesEncontrada++;}
		}
		return cantidadDeParesEncontrada;
	}
	
	public int cantidadDeImpares() {
		int cantidadDeImparesEncontrada = 0;
		for (Integer numero : lista) {
			if (numero % 2 == 1) {cantidadDeImparesEncontrada++;}
		}
		return cantidadDeImparesEncontrada;
	}
	
	public int cantidadDeMúltiplosDe(int unNúmero) {
		int cantidadDeMúltiplosEncontrados = 0;
		for (Integer numero : lista) {
			if (numero % unNúmero == 0) {cantidadDeMúltiplosEncontrados++;}
		}
		return cantidadDeMúltiplosEncontrados;
	}

	public void agregarNúmero(int númeroParaAgregar) {
		this.lista.add(númeroParaAgregar);
	}

	/**
	 * Devuelve el número con mayor cantidad de dígitos pares de la lista dada.
	 * Precondición: La lista dada no está vacía.
	 * */
	public Integer númeroConMásParesDe(ArrayList<Integer> listaDeNúmeros) {
		Integer máximoDeParesVistoHastaAhora = listaDeNúmeros.getFirst();
		for(Integer num : listaDeNúmeros) {
			máximoDeParesVistoHastaAhora = Math.max(this.cantidadDeDígitosParesDe(num), máximoDeParesVistoHastaAhora);
		}
		return máximoDeParesVistoHastaAhora;
	}

	private int cantidadDeDígitosParesDe(Integer num) {
		if(num == 0) {
			return 1;
		}
		else {
			int restoDelNúmero = 0;
			while(num >= 10) {
				restoDelNúmero = num % 10;
				num /= 10;
			}
			return num % 2 + this.cantidadDeDígitosParesDe(restoDelNúmero);
		}
		
	}

	public Integer múltiploMásGrandeMenorAMilEntre_Y_(int i, int j) {
		int multiploMasGrande = this.mcm(i, j);
		int k = 1;
		while(multiploMasGrande * k < 1000) {
			multiploMasGrande = multiploMasGrande * k;
			k++;
		}
		if(multiploMasGrande > 1000) {
			multiploMasGrande = -1;
		}
		return multiploMasGrande;
	}

	private int mcm(int i, int j) {
		 return i * j / this.mcd(i, j);
	}

	int mcd(int i, int j) {
		
		int max = Math.max(i, j);
		int min = Math.min(i, j);
		int resto = max;
		while(max % min != 0) {
			resto = max % min;
			max = min;
			min = resto;
		}
		return resto;
	}
}
