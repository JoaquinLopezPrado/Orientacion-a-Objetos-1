package ar.edu.unlp.objetos.uno.ejercicio6;

import java.util.LinkedList;
import java.util.List;

public class Usuario {
	
	private String nombre;
	private String domicilio;
	private List<Consumo> listaDeConsumos;
	
	public Usuario(String nombre,String dom) {
		this.nombre=nombre;
		this.domicilio=dom;
		listaDeConsumos=new LinkedList<Consumo>();
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	/*preguntar por todo el ej y el tema de tomar el ultimo consumo*/
}
