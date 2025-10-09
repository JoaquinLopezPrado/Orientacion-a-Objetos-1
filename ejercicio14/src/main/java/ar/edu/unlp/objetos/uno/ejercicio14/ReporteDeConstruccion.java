package ar.edu.unlp.objetos.uno.ejercicio14;

import java.util.LinkedList;

public class ReporteDeConstruccion {
	
	private LinkedList<Pieza> listaPiezas;
	
	
	public double volumenDeMaterial(String material) {
		return this.listaPiezas.stream().filter(p -> p.esIgualMaterial(material)).mapToDouble(listaPiezas -> listaPiezas.Volumen()).sum();
		
	}
	
	public double superficieDeColor(String color) {
		return this.listaPiezas.stream().filter(p -> p.esIgualColor(color)).mapToDouble(listaPiezas -> listaPiezas.Volumen()).sum();
	}

}
