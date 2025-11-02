package ar.edu.unlp.objetos.uno.ejercicio22;

public class Articulo extends Producto{			
	
	private String nombre;
	private String categoria;
	private double precio;
	private double pesoKg;
	private int stockActual;
	
	
	public Articulo(String nombre, String categoria, double precio, double pesoKg, int stockActual) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.pesoKg = pesoKg;
        this.stockActual = stockActual;
    }
	
	@Override
	public double calcularCostoTotal() {
		return this.pesoKg * this.precio;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public double getPrecio() {
		return precio;
	}

	public int getStockActual() {
		return stockActual;
	}

	@Override
	public double devolverPeso() {
		return pesoKg;
	}
	
	
	

}
