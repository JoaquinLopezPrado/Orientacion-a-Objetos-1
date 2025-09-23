package ar.edu.unlp.objetos.uno.ejercicio5;

import java.util.LinkedList;
import java.util.List;

public class Inversor {

	private List<Inversion> listaInversiones;

	
	public Inversor() {
		this.listaInversiones=new LinkedList<Inversion>();
	}
	public List<Inversion> getListaInversiones() {
		return listaInversiones;
	}

	public void setListaInversiones(List<Inversion> listaInversiones) {
		this.listaInversiones = listaInversiones;
	}
	
	public void AgregarInversion(Inversion inv) {
		this.listaInversiones.add(inv);
	}
	public void QuitarInversion(Inversion inv) {
		this.listaInversiones.remove(inv);
	}
	
	public double ValorInversionActual() {
		return this.listaInversiones.stream().mapToDouble(listaInversiones -> listaInversiones.ValorActual()).sum();
	}

}
