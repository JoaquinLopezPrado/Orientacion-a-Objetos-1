package ar.edu.unlp.objetos.uno.ejercicio22;

public class Vianda extends Producto{
	
	private String nombre;
	private double precio;
	private boolean celiaco;
	private boolean disponibilidad;
	
	
	
	public Vianda(String nombre, double precio, boolean celiaco, boolean disponibilidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.celiaco = celiaco;
        this.disponibilidad = disponibilidad;
    }
	
	public String getNombre() {
		return nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public boolean isCeliaco() {
		return celiaco;
	}
	public boolean isDisponibilidad() {
		return disponibilidad;
	}
	
	@Override
	public double calcularCostoTotal() {
		return this.precio;
	}
	@Override
	public double devolverPeso() {
		return 0;
	}
	
}
