package ar.edu.unlp.info.oo1.ejercicio2Recursante;

public class Producto {

	private double peso;
	private double precioPorKilo;
	private String descripcion;
	
	
	
	public Producto(double peso, double precioPorKilo,String desc) {
		this.peso=peso;
		this.precioPorKilo=precioPorKilo;
		this.descripcion=desc;
	}
	public double getPrecio() {
		return this.peso * this.precioPorKilo;
	}

	
	public double getPeso() {
		return peso;
	}

	public double getPrecioPorKilo() {
		return precioPorKilo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setPrecioPorKilo(double precioPorKilo) {
		this.precioPorKilo = precioPorKilo;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
