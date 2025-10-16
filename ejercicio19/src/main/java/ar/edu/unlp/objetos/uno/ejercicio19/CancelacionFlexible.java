package ar.edu.unlp.objetos.uno.ejercicio19;


public class CancelacionFlexible implements Politica{

	@Override
	public double reembolso(Reserva r) {
		return r.CalcularPrecio();
	}
	
	

}
