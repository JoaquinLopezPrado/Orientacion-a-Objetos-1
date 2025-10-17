package ar.edu.unlp.objetos.uno.ejercicio21;

import java.time.LocalDate;
import java.util.LinkedList;

import ar.edu.unlp.objetos.uno.ejercicio17.DataL;

public abstract class Envio {
	
	private LocalDate fechaDespacho;
	private String dirOrigen;
	private String dirDestino;
	private double peso;
	
	
	public Envio(LocalDate fechaDespacho, String dirOrigen, String dirDestino, double peso) {
		this.fechaDespacho = fechaDespacho;
		this.dirOrigen = dirOrigen;
		this.dirDestino = dirDestino;
		this.peso = peso;
	}
	
	
	public abstract double costoEnvio();
	

	public LocalDate getFechaDespacho() {
		return fechaDespacho;
	}

	public String getDirOrigen() {
		return dirOrigen;
	}

	public String getDirDestino() {
		return dirDestino;
	}

	public double getPeso() {
		return peso;
	}


}
