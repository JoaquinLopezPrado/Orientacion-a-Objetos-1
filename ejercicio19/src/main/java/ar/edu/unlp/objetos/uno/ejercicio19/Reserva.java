package ar.edu.unlp.objetos.uno.ejercicio19;

import ar.edu.unlp.objetos.uno.ejercicio17.DataL;

public class Reserva {
	
	private DataL periodo;
	private Propiedad propiedad;
	private Usuario us;
	
	public Reserva(DataL p,Propiedad pr,Usuario us) {
		this.periodo=p;
		this.propiedad=pr;
		this.us=us;
	}

	public double CalcularPrecio() {
		return this.periodo.sizeInDays() * this.propiedad.getPrecioxnoche();
	}

	public DataL getPeriodo() {
		return periodo;
	}

	public boolean isOcupado(DataL periodo) {
		return this.periodo.overlapse(periodo);
	}

	public void setPeriodo(DataL periodo) {
		this.periodo = periodo;
	}
	
	public int dias() {
		return this.periodo.sizeInDays();
	}
	
	
}
