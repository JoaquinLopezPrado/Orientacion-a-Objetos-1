package ar.edu.unlp.objetos.uno.ejercicio21;

import java.time.LocalDate;

public class EnvioInternacional extends Envio{
	
	private boolean entregaRapida;
	
	
	public EnvioInternacional(LocalDate fechaDespacho, String dirOrigen, String dirDestino, double peso) {
		super(fechaDespacho, dirOrigen, dirDestino, peso);
	}


	@Override
	public double costoEnvio() {
		if(super.getPeso() <= 1 && entregaRapida) {
			return costoBase() * 10 + 800;
		}
		else if(super.getPeso() <= 1 && !entregaRapida) {
			return costoBase() * 10;
		}
		else if(super.getPeso() > 1 && entregaRapida) {
			return costoBase() * 12 + 800;
		
		}
		else return costoBase() * 12;
	}
	
	private double costoBase() {
		return 5000 + super.getPeso();
	}
}
