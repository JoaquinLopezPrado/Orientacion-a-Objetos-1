package ar.edu.unlp.objetos.uno.ejercicio7;

public class Cuerpo3D {
	
	private double Altura;
	private Figuras CaraBasal;

	
	
	public Cuerpo3D() {
		
	}

	public double getAltura() {
		return Altura;
	}

	public void setAltura(double altura) {
		Altura = altura;
	}

	public void setCaraBasal(Figuras caraBasal) {
		CaraBasal = caraBasal;
	}
	
	public double getVolumen() {
		return this.CaraBasal.getArea() * this.getAltura();	
	}
	
	public double getSuperficieExterior() {
		return (2 * this.CaraBasal.getArea() + this.CaraBasal.getPerimetro() + this.getAltura());	
	}
	
}
