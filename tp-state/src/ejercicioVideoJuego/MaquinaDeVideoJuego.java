package ejercicioVideoJuego;

import org.junit.jupiter.api.function.Executable;

public class MaquinaDeVideoJuego {
	
	private int fichas;
	private String cartel;
	private EstadoDeMaquina estado;
	
	public MaquinaDeVideoJuego() {
		fichas = 0;
		estado = new MaquinaNoPreparada();
	}

	public int getCantidadDeFichas() {
		return fichas;
	}

	public String cartel() {
		return cartel;
	}

	public void iniciarJuego() {
		estado.jugar(this);
	}

	public void ingresarFicha() {
		fichas++;
		estado = estado.contarFicha();
	}

	public void setCartel(String string) {
		cartel = string;		
	}

	public void finalizarJuego() {
		fichas = 0;
		estado = new MaquinaNoPreparada();
		cartel = "Ingrese fichas para jugar";
	}
	
	
}
