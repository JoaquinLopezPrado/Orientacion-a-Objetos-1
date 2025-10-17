package ar.edu.unlp.objetos.uno.ejercicio15;

import java.util.LinkedList;

public class Carpeta {
	
	private String nombreCarpeta;
	private LinkedList<Email> emails;
	
	
	
	public String getNombre() {
		return this.nombreCarpeta;
	}
	
	public void mover(Email email,Carpeta destino) {
		destino.recibirMail(email);
		emails.remove(email);
	}
	
	public void recibirMail(Email email) {
		this.emails.add(email);
	}

	public LinkedList<Email> getEmails() {
		return emails;
	}
	
	public double tamañoMails() {
		return emails.stream().mapToDouble(emails -> emails.tamaño()).sum();
	}
	
	public Email Existe(String texto) {
		return emails.stream().filter(c -> c.BuscarEnTexto(texto)).findFirst().orElse(null);
	}

}
