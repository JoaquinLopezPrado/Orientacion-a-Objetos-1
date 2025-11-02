package ar.edu.unlp.objetos.uno.ejercicio22;

import java.time.LocalDateTime;

public class EnvioDelivery extends Envio{

	public EnvioDelivery(LocalDateTime entrega) {
		super(entrega);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int tiempoEntrega() {
		return 20;
	}
	

}
