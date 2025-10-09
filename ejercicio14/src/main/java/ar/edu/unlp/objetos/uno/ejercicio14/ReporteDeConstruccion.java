package ar.edu.unlp.objetos.uno.ejercicio14;

import java.util.LinkedList;

public class ReporteDeConstruccion {
	
	private LinkedList<Pieza> listaPiezas;
	
	
	public double volumenDeMaterial(String material) {
		return this.listaPiezas.stream().filter(p -> p.getMaterial().equals(material)).mapToDouble(listaPiezas -> listaPiezas.Volumen()).sum();
		
	}
	
	public double superficieDeColor(String color) {
		return this.listaPiezas.stream().filter(p -> p.getColor().equals(color)).mapToDouble(listaPiezas -> listaPiezas.Volumen()).sum();
	}

}
