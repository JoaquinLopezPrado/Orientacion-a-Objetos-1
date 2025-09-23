package ar.edu.unlp.info.oo1.ejercicio2Recursante;

import java.time.LocalDate;

public class Ticket {

	private LocalDate fecha;
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;
	
	
	public Ticket(int cant,double peso,double precio) {
		this.fecha=LocalDate.now();
		this.cantidadDeProductos=cant;
		this.pesoTotal=peso;
		this.precioTotal=precio;
	}
	
	public double impuesto() {
		return this.precioTotal * 0.21;
	}

	
	
	
	
	
	public LocalDate getFecha() {
		return fecha;
	}

	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}

	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}



}
