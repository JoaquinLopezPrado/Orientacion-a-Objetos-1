package ar.edu.unlp.info.oo1.Parcial2;

public class Mago implements Rol{
	


	@Override
	public double valorBase(Personaje per) {
		return (per.getInteligencia() + per.getNivel()) * 2;
	}

	@Override
	public double aumentar(int fuerza,int inteligencia, int nivel) {
		return inteligencia + 3/2 * nivel;
	}

}
