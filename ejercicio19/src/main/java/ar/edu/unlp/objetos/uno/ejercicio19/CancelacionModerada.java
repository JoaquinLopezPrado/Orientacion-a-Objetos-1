package ar.edu.unlp.objetos.uno.ejercicio19;


public class CancelacionModerada implements Politica{


	@Override
	public double reembolso(Reserva r) {
		if(r.dias() >= 7) {
			return r.CalcularPrecio();
		}
		if (r.dias() > 2) {
			return r.CalcularPrecio() * 0.5;
		}
		return 0;
	 }
	}


