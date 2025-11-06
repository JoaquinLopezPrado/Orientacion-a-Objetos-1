package ar.edu.unlp.info.oo1.Parcial2;

public class Orco extends Personaje{
	
	
	
	
	public Orco(String nombre,Rol rolPJ,int fuerza,int inteligencia) {
		super(nombre,rolPJ,fuerza,inteligencia);
		super.setFuerza(2);
		super.setInteligencia(1);
	}

	public double determinarPoder(int horaDia) {
		if(horaDia >=20 && horaDia < 8) {
			return 0.60;
		}
		return 0;
		
	}

	@Override
	public void aumentarHabilidad() {
		if(this.getNivel() % 3 == 0) {
			this.getRolPersonaje().aumentar(this.getFuerza(),this.getInteligencia(),this.getNivel());
		}
		
	}
	

}
