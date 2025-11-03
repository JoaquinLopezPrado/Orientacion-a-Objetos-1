package ar.edu.unlp.info.oo1.ejercicio23;

import java.util.LinkedList;

public abstract class Usuario {
	
	private String nombre;
	private String direccion;
	private double saldo;
	
	
	
	public void cargarSaldo(double monto) {
		saldo+=monto;	
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo=saldo;
	}
	
	public abstract void descontarViaje(Viaje vi,double costo);
	
	public abstract LinkedList<Viaje> devolverViajes();

}
