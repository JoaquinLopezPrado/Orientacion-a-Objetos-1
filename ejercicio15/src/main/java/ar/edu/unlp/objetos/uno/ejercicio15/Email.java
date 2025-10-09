package ar.edu.unlp.objetos.uno.ejercicio15;

import java.util.LinkedList;

public class Email {
	
	private String titulo;
	private String cuerpo;
	private LinkedList<Archivo> adjuntos;
	
	
	public String getTitulo() {
		return titulo;
	}
	public String getCuerpo() {
		return cuerpo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}
	
	public double tamaño() {
		return adjuntos.stream().mapToDouble(adjuntos -> adjuntos.tamaño()).sum() + this.getCuerpo().length() + this.getTitulo().length();
	}

}
