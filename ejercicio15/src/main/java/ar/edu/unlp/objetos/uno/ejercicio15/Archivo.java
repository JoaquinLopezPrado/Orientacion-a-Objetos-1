exppackage ar.edu.unlp.objetos.uno.ejercicio15;

public class Archivo {
	
	private String nombre;
	
	
	
	public int tamaño() {
		return this.nombre.length();
	}

	public String calcularTamaño() {
		if(this.tamaño()<=300) {
			return "Pequeño";
		}
		else if(this.tamaño() >=301 && this.tamaño() <=500) {
			return "Mediano";
		}
		return "Grande";
	}
}
