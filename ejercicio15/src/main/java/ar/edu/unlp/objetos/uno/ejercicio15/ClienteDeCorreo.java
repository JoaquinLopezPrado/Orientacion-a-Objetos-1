package ar.edu.unlp.objetos.uno.ejercicio15;

import java.util.LinkedList;

public class ClienteDeCorreo {
	
	private LinkedList<Carpeta> listaCarpetas;
	
	
	
	public void recibir(Email email) {
		listaCarpetas.getFirst().recibirMail(email);
	}
	
	public Email buscar(String texto) {
		return (Email) listaCarpetas.stream().map(c -> c.Existe(texto));
	}
	
	public double espacioOcupado() {
		return listaCarpetas.stream().mapToDouble(listaCarpetas -> listaCarpetas.tamañoMails()).sum();
	}

}
