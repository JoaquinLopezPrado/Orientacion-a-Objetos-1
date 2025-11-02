package ar.edu.unlp.objetos.uno.ejercicio22;


import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class EnvioRetiro extends Envio{
	
	private int Dni;
	private LocalDateTime estimada;
	
	public EnvioRetiro(LocalDateTime entrega,int dni,LocalDateTime est) {
		super(entrega);
		this.Dni=dni;
		this.estimada=est;
	}

	@Override
	public int tiempoEntrega() {
		 return (int) ChronoUnit.MINUTES.between(super.getFechaEntrega(), this.estimada);
	}
	

}
