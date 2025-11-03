package ar.edu.unlp.info.oo1.ejercicio23;

import java.util.LinkedList;

public class Pasajero extends Usuario{
	
	private LinkedList<Viaje> listaviajes;
	
	public Pasajero() {
		listaviajes=new LinkedList<Viaje>();
	}
	

	public void descontarViaje(Viaje vi, double costo) {
	    double monto = costo;
	    if (!listaviajes.isEmpty()) {
	        monto += 5000; // recargo si ya viajó antes
	    }
	    this.setSaldo(getSaldo() - monto);
	    listaviajes.add(vi);
	}

	@Override
	public LinkedList<Viaje> devolverViajes() {
		return listaviajes;
	}
	

}
