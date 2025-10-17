package ar.edu.unlp.objetos.uno.ejercicio21;

import java.time.LocalDate;

public class EnvioInterurbano extends Envio{
	
	private int distanciakm;
	
	
	public EnvioInterurbano(LocalDate fechaDespacho, String dirOrigen, String dirDestino, double peso) {
		super(fechaDespacho, dirOrigen, dirDestino, peso);
		// TODO Auto-generated constructor stub
	}


	@Override
	public double costoEnvio() {
		if(distanciakm < 100) {
			return 20 * super.getPeso();
		}
		else if(distanciakm >= 100 && distanciakm <= 500) {
			return 25 * super.getPeso();
		}
		else return 30 * super.getPeso();	
	}
}
