package ar.edu.unlp.objetos.uno.ejercicio19;

import java.util.LinkedList;

import ar.edu.unlp.objetos.uno.ejercicio17.DataL;

public class Propiedad {
	
	private String direccion;
	private String nombreDesc;
	private double precioxnoche;
	private LinkedList<Reserva> listareservas;
	private Politica pol;
	private Usuario us;
	
	
	public Propiedad(String direccion, String nombre, double precio, Politica pol,Usuario us) {
		this.direccion = direccion;
		this.nombreDesc = nombre;
		this.precioxnoche = precio;
		this.listareservas = new LinkedList<Reserva>();
		this.pol = pol;
		this.us=us;
	}
	public boolean IsDisponible(DataL periodo) {
		return listareservas.stream().noneMatch(c -> c.isOcupado(periodo));
	}
	
	public String getDireccion() {
		return direccion;
	}
	public String getNombreDesc() {
		return nombreDesc;
	}
	public double getPrecioxnoche() {
		return precioxnoche;
	}
	
	public void CrearReserva(DataL periodo) {
		if(this.IsDisponible(periodo)) {
			Reserva r = new Reserva(periodo,this,us);
		}
	}
	
	public double cancelarReserva() {
		/*preg*/
	}
	
	public double CalculoReservas(DataL periodo) {
		return listareservas.stream().filter(p -> p.isOcupado(periodo)).mapToDouble(p -> p.CalcularPrecio()).sum();
	}
}
