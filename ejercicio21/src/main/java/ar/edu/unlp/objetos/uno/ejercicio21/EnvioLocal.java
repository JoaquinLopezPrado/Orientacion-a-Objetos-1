package ar.edu.unlp.objetos.uno.ejercicio21;

import java.time.LocalDate;

public class EnvioLocal extends Envio{
	
	private boolean entregaRapida;

	public EnvioLocal(LocalDate fechaDespacho, String dirOrigen, String dirDestino, double peso) {
		super(fechaDespacho, dirOrigen, dirDestino, peso);
	}

	@Override
	public double costoEnvio() {
		if(entregaRapida) {
			return 1500;
		}
		else return 1000;
	}
	

}
