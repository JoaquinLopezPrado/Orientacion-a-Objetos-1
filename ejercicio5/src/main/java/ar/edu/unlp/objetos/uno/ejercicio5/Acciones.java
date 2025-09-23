package ar.edu.unlp.objetos.uno.ejercicio5;

public class Acciones implements Inversion{
	
 	private String nombre;
 	private double valorUnitario;
    private int cantidad;
	
	
    
    public Acciones(String nombre, double valorUnitario, int cantidad) {
        this.nombre = nombre;
        this.valorUnitario = valorUnitario;
        this.cantidad = cantidad;
    }
    
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getValorUnitario() {
		return this.valorUnitario;
	}
	public int getCantidad() {
		return this.cantidad;
	}
	public double ValorActual() {
		return this.getCantidad() * this.getValorUnitario();
	}
	
}
