package ar.edu.unlp.info.oo1.ejercicio23;

import java.time.LocalDate;
import java.util.LinkedList;

public class Viaje {
	
	private double costoTotal;
	private String origen;
	private String destino;
	private LocalDate fechaSalida;
	private Conductor chofer;
	private Vehiculo auto;
	private LinkedList<Usuario> listapasajero;
	
	
	public Viaje(double costoTotal, String origen, String destino, LocalDate fechaSalida, Conductor chofer,Vehiculo auto) {
		super();
		this.costoTotal = costoTotal;
		this.origen = origen;
		this.destino = destino;
		this.fechaSalida = fechaSalida;
		this.chofer = chofer;
		this.auto=auto;
		listapasajero=new LinkedList<Usuario>();
		listapasajero.add(chofer);
	}
	
	public void registrarPasajero(Pasajero pas) {
		if(listapasajero.size()<auto.getCapacidad()) {
			listapasajero.add(pas);
		}
	}	
	
	public void cobrarViaje() {
		double costoPorPersona = costoTotal / listapasajero.size();
		listapasajero.stream().forEach(c->c.descontarViaje(this, costoPorPersona));
	}
	public double getcostoTotal() {
		return costoTotal;
	}
}
