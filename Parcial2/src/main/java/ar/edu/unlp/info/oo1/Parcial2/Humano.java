package ar.edu.unlp.info.oo1.Parcial2;

public class Humano extends Personaje{
	
	
	public Humano(String nombre,Rol rolPJ,int fuerza,int inteligencia) {
		super(nombre,rolPJ,fuerza,inteligencia);
		super.setFuerza(1);
		super.setInteligencia(2);
	}

	@Override
	public double determinarPoder(int horaDia) {
		if(horaDia >=8 && horaDia <20) {
			return 0.40;
		}
		return 0;
		
	}

	@Override
	public void aumentarHabilidad() {
		if(this.getNivel()>7) {
			this.getRolPersonaje().aumentar(this.getFuerza(),this.getInteligencia(),this.getNivel());
		}
		
	}
	
}
