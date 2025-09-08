package ar.unq.edu.poo2.tp3; 

public class Rectangulo {
	protected Punto esqSupIzq;
	protected Punto esqInfIzq;
	protected Punto esqSupDer;
	protected Punto esqInfDer;
	
	public Rectangulo() {
		
	}
	
	public Rectangulo(Punto origen, int ancho, int alto) {
		this.esqInfIzq = origen;
		this.esqSupIzq = new Punto(origen.getX(), origen.getY() + alto);
		this.esqSupDer = new Punto(origen.getX() + ancho, origen.getY() + alto);
		this.esqInfDer = new Punto(origen.getX() + ancho, origen.getY());
	}
	
	public int area() {
		return (esqSupDer.getX() - esqSupIzq.getX()) * (esqSupDer.getY() - esqInfDer.getY());
	}
	
	public int perimetro() {
		return (esqInfDer.getX() - esqInfIzq.getX()) * 2 + (esqSupDer.getY() - esqInfDer.getY()) * 2;
	}
	
	public boolean esHorizontal() {
		return (esqInfDer.getX() - esqInfIzq.getX()) > (esqSupDer.getY() - esqInfDer.getY());
	}
	
	public boolean esVertical() {
		return (esqSupDer.getY() - esqInfDer.getY()) > (esqInfDer.getX() - esqInfIzq.getX());
	}
}
