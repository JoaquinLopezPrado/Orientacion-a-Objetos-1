package ar.edu.unlp.info.oo1.ejercicio23;

import java.time.LocalDate;

public class Vehiculo {
	
	private String descripcion;
	private int capacidad;
	private LocalDate anioFabricacion;
	private double valorMercado;
	private Conductor chofer;
	
	public Vehiculo(String descripcion, int capacidad, LocalDate anioFabricacion, double valorMercado,Conductor chofer) {
		super();
		this.descripcion = descripcion;
		this.capacidad = capacidad;
		this.anioFabricacion = anioFabricacion;
		this.valorMercado = valorMercado;
		this.chofer = chofer;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public LocalDate getAnioFabricacion() {
		return anioFabricacion;
	}

	public double getValorMercado() {
		return valorMercado;
	}

	public Conductor getChofer() {
		return chofer;
	}

}
