package ar.edu.unlp.objetos.uno.ejercicio22;

import java.time.LocalDateTime;

public abstract class Envio {
	
	private LocalDateTime fechaEntrega;
	
	
	public Envio(LocalDateTime entrega) {
		this.fechaEntrega=entrega;
	}
	
	
	public LocalDateTime getFechaEntrega() {
		return fechaEntrega;
	}


	public void setFechaEntrega(LocalDateTime fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public abstract int tiempoEntrega();

}
