package ar.edu.unlp.objetos.uno.ejercicio15;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.stream.Collectors;

public class Carpeta {
	
	private String nombreCarpeta;
	private LinkedList<Email> emails;
	private Map<String, Integer> mapa = new HashMap<>();
	
	
	
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
	
	public int cantidadEmails() {
		return (int) emails.stream().count();
	}
	
	public Map<String,Integer> cantCategoria()/*preg*/
		return emails.stream()
	}

}
