package ar.unq.edu.poo2.tp3;

public class Cuadrado extends Rectangulo {
	
	public Cuadrado(Punto origen, int lado) {
		this.esqInfIzq = origen;
		this.esqSupIzq = new Punto(origen.getX(), origen.getY() + lado);
		this.esqSupDer = new Punto(origen.getX() + lado, origen.getY() + lado);
		this.esqInfDer = new Punto(origen.getX() + lado, origen.getY());
	}
}
