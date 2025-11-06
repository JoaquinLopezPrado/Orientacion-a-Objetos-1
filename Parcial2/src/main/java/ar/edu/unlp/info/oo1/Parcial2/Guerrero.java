package ar.edu.unlp.info.oo1.Parcial2;

public class Guerrero implements Rol{

	
	@Override
	public double valorBase(Personaje per) {
		return (per.getFuerza() * 2) + per.getNivel() + per.getInteligencia();
	}

	@Override
	public double aumentar(int fuerza,int inteligencia,int nivel) {
		return fuerza+nivel/6;
	}
	
	
}
