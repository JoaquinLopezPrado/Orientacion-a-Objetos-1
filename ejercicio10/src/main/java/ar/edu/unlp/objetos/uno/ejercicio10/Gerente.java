package ar.edu.unlp.objetos.uno.ejercicio10;

public class Gerente extends EmpleadoJerarquico{
	
	
	public Gerente(String nombre) {
		super(nombre);
	}

	public double aportes() {
		return this.montoBasico() * 0.05;
		
	}
	
	public double montoBasico() {
		return 57000;
	}

}
