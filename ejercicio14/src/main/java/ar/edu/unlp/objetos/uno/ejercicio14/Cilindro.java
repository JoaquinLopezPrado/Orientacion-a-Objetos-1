package ar.edu.unlp.objetos.uno.ejercicio14;

public class Cilindro extends Pieza{
	
	private double radio;
	private double altura;

	@Override
	public double Volumen() {
		return Math.PI * Math.pow(getRadio(), 2) * this.getAltura();
	}

	@Override
	public double Superficie() {
		return 2 * Math.PI * this.getRadio() + 2 * Math.PI * Math.pow(getRadio(), 2);
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	

}
