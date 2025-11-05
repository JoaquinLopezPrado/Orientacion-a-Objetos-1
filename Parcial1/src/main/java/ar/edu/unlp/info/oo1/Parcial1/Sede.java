package ar.edu.unlp.info.oo1.Parcial1;

public class Sede {
	
	private String nombreLugar;
	private double precioxDia;
	private int cantDias;
	
	
	
	
	public Sede(String nombreLugar, double precioxDia, int cantDias) {
		super();
		this.nombreLugar = nombreLugar;
		this.precioxDia = precioxDia;
		this.cantDias = cantDias;
	}

	public double precioTotal() {
		return this.precioxDia * this.cantDias;
	}

}
