package ar.edu.unlp.objetos.uno.ejercicio14;

public class PrismaRectangular extends Pieza{
	
	private int ladoMayor;
	private int ladoMenor;
	private int altura;

	@Override
	public double Volumen() {
		return this.getLadoMayor() * this.getLadoMenor() * this.getAltura();
	}

	@Override
	public double Superficie() {
		return 2 * (this.getLadoMenor() * this.getLadoMayor() + this.getLadoMayor() * this.getAltura() + this.getLadoMenor() * this.getAltura());
	}

	public int getLadoMayor() {
		return ladoMayor;
	}

	public int getLadoMenor() {
		return ladoMenor;
	}

	public int getAltura() {
		return altura;
	}

	public void setLadoMayor(int ladoMayor) {
		this.ladoMayor = ladoMayor;
	}

	public void setLadoMenor(int ladoMenor) {
		this.ladoMenor = ladoMenor;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	
}
