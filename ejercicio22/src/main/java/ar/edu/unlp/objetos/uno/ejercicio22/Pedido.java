package ar.edu.unlp.objetos.uno.ejercicio22;

import java.util.LinkedList;

public class Pedido {
	
	private String email;
	private LinkedList<Producto> listaProductos;
	private Envio en;
	
	
	public Pedido(String email,LinkedList<Producto> pro,Envio en) {
		this.email=email;
		listaProductos=pro;
		this.en=en;
	}
	
	public double calcularCosto() {
		return this.listaProductos.stream().mapToDouble(c -> c.calcularCostoTotal()).sum();
	}

	public String getEmail() {
		return email;
	}

	public LinkedList<Producto> getListaProductos() {
		return listaProductos;
	}

	public Envio getEn() {
		return en;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setListaProductos(LinkedList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	public void setEn(Envio en) {
		this.en = en;
	}
	
	public void agregarArticulo(Articulo ar) {
		if(ar.devolverPeso() <35) {
			this.listaProductos.add(ar);
		}
		
	}
	
	public void agregarVianda(Vianda vi) {
		if(vi.isCeliaco() && en.tiempoEntrega() < 40) {
			this.listaProductos.add(vi);
		}
	}
	
}
