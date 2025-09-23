package ar.edu.unlp.objetos.uno.ejercicio7;

public class Cuadrado implements Figuras{
	
	private double Lado;
	
	
	public Cuadrado() {
		
	}

	public double getPerimetro() {
		return this.getLado() * 4;
	}

	public double getArea() {
		return this.getLado() * this.getLado();
	}

	public double getLado() {
		return Lado;
	}

	public void setLado(double lado) {
		Lado = lado;
	}
	
}
