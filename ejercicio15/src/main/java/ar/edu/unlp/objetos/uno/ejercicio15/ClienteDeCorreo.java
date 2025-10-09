package ar.edu.unlp.objetos.uno.ejercicio15;

import java.util.LinkedList;

public class ClienteDeCorreo {
	
	private LinkedList<Carpeta> listaCarpetas;
	
	
	
	public void recibir(Email email) {
		listaCarpetas.getFirst().recibirMail(email);
	}
	
	public Email buscar(String texto) {
		/*cambiar*/
		return null;
	}
	
	public double espacioOcupado() {
		return listaCarpetas.stream().mapToDouble(listaCarpetas -> listaCarpetas.tamañoMails()).sum();
	}

}
