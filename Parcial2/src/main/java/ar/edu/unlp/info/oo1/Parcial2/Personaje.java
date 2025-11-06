package ar.edu.unlp.info.oo1.Parcial2;


public abstract class Personaje {
	
	private String nombre;
	private int nivel;
	private int fuerza;
	private int inteligencia;
	private Rol rolPersonaje;
	
	
	public Personaje(String nombre,Rol rolPJ,int fuerza,int inteligencia) {
		this.nivel=1;
		this.nombre=nombre;
		this.rolPersonaje=rolPJ;
		this.fuerza=fuerza;
		this.inteligencia=inteligencia;
	}
	
	public abstract double determinarPoder(int horaDia);
	public abstract void aumentarHabilidad();
	
	public double fuerzaTotal(int horaActual) {
		double valorBase=rolPersonaje.valorBase(this);
		return valorBase + valorBase * determinarPoder(horaActual);
	}
	
	public void subirNivel() {
		this.setNivel(this.nivel+1);
		aumentarHabilidad();
		
	}

	public String getNombre() {
		return nombre;
	}

	public int getNivel() {
		return nivel;
	}

	public Rol getRolPersonaje() {
		return rolPersonaje;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}


	public void setRolPersonaje(Rol rolPersonaje) {
		this.rolPersonaje = rolPersonaje;
	}

	public int getFuerza() {
		return fuerza;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}
	
	
	
}
