package ar.edu.unlp.info.oo1.ejercicio23;

import java.util.LinkedList;

public class Conductor extends Usuario{
	
	private Vehiculo auto;
	private LinkedList<Viaje> listaviajes;

	
	public Conductor(Vehiculo auto) {
		super();
		this.auto = auto;
		listaviajes=new LinkedList<Viaje>();
	}
	
	public void descontarViaje(Viaje vi, double costo) {
	    double descuentoVehiculo = auto.getValorMercado() * 0.001; // 0,1%
	    this.setSaldo(getSaldo() - costo - descuentoVehiculo);
	    listaviajes.add(vi);
	}

	@Override
	public LinkedList<Viaje> devolverViajes() {
		return listaviajes;
	}
	
	
}
	
