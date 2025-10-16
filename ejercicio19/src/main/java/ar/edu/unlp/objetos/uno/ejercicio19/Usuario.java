package ar.edu.unlp.objetos.uno.ejercicio19;

import java.util.LinkedList;

import ar.edu.unlp.objetos.uno.ejercicio17.DataL;

public class Usuario {
	
	private String nombre;
	private String direccion;
	private int dni;
	private LinkedList<Propiedad> listaPropiedades;
	
	
	public Usuario(String nombre,String dir,int dni) {
		this.nombre=nombre;
		this.direccion=dir;
		this.dni=dni;
		listaPropiedades = new LinkedList<Propiedad>();
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public int getDni() {
		return dni;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}

	public LinkedList<Propiedad> getPropiedades(){
		return this.listaPropiedades;
	}
	
	public double IngresosTotales(DataL periodo) {
		return listaPropiedades.stream().mapToDouble(c -> c.CalculoReservas(periodo)).sum() * 0.75;
	}
}
