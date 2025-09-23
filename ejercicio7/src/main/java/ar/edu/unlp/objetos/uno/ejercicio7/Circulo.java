package ar.edu.unlp.objetos.uno.ejercicio7;

public class Circulo implements Figuras{
	
	private double Diametro;
	private double Radio;
	
	
	public Circulo() {
		
	}

	public double getPerimetro() {
		return Math.PI * this.getDiametro();
	}

	public double getArea() {
		return this.getRadio() * this.getRadio() * Math.PI;
	}

	public double getDiametro() {
		return this.getRadio() * 2;
	}

	public double getRadio() {
		return Radio;
	}

	public void setDiametro(double diametro) {
		Diametro = diametro;
	}

	public void setRadio(double radio) {
		Radio = radio;
	}


}
