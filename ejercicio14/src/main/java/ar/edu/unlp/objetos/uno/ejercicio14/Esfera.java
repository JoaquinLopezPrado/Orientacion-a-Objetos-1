package ar.edu.unlp.objetos.uno.ejercicio14;

public class Esfera extends Pieza{
	
	private double radio;

	@Override
	public double Volumen() {
		return 4/3 * Math.PI * Math.pow(getRadio(), 3);
	}

	@Override
	public double Superficie() {
		return 4 * Math.PI * Math.pow(getRadio(), 2);
	}
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

}
