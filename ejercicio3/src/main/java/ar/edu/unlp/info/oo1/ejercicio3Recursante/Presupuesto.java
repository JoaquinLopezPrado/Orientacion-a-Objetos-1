package ar.edu.unlp.info.oo1.ejercicio3Recursante;

import java.time.LocalDate;
import java.util.LinkedList;

public class Presupuesto {

	private LocalDate fecha;
	private String cliente;
	private LinkedList<Item> listaItems;
	
	
	public Presupuesto(String cliente) {
		this.fecha=LocalDate.now();
		this.cliente=cliente;
		this.listaItems=new LinkedList<Item>();
		
	}
	public void agregarItem(Item item) {
		this.listaItems.add(item);
	}
	
	public double calcularTotal() {
		return this.listaItems.stream().mapToDouble(listaItems -> listaItems.costo()).sum();
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public String getCliente() {
		return cliente;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	
}
