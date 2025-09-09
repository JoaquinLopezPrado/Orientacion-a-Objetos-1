package ar.edu.unlp.info.oo1.ejercicio2Recursante;
import java.util.LinkedList;

public class Balanza {
	
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	private LinkedList<Producto> listaProductos;
	private Ticket ticket;
	
	
	public Balanza() {
		this.cantidadDeProductos=0;
		this.precioTotal=0;
		this.pesoTotal=0;
		this.listaProductos=new LinkedList<Producto>();
	}
	
	public void ponerEnCero() {
		this.listaProductos.clear();
		this.precioTotal=0;
		this.cantidadDeProductos=0;
	}
	
	public void agregarProducto(Producto producto) {
		this.listaProductos.add(producto);
	}
	
	public Ticket emitirTicket() {
		return this.ticket=new Ticket(this.listaProductos.size(),this.getPesoTotal(),this.getPrecioTotal());
	}

	public long getCantidadDeProductos() {
		return this.listaProductos.stream().count(); /*preguntar si esta bien que devuleva long*/
	}

	public double getPrecioTotal() {
		return this.listaProductos.stream().mapToDouble(listaProductos -> listaProductos.getPeso() * listaProductos.getPrecioPorKilo()).sum();
	}

	public double getPesoTotal() {
		return this.listaProductos.stream().mapToDouble(listaProductos -> listaProductos.getPeso()).sum();
	}
     /*esta era la idea o habia que implementar un metodo privado?*/
	
	public LinkedList<Producto> getListaProductos() {
		return listaProductos;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}

	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}

	public void setListaProductos(LinkedList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

}
