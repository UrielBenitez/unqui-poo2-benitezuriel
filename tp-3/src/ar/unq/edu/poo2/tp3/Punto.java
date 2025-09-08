package ar.unq.edu.poo2.tp3;

public class Punto {
	private int x;
	private int y;
	// 1)
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	// 2)
	public Punto() {
		this.x = 0;
		this.y = 0;
	}
	// 3)
	public void desplazarseHorizontalmente(int x) {
		this.x = x;
	}
	
	public void desplazarseVerticalmente(int y) {
		this.y = y;
	}
	
	// 4)
	public Punto sumarseCon(Punto p) {
		return new Punto(this.x + p.getX(), this.y + p.getY());
	}
	public int getY() {
		return this.y;
	}
	public int getX() {
		return this.x;
	}
}
