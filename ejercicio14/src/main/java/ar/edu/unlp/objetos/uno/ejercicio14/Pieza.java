package ar.edu.unlp.objetos.uno.ejercicio14;

public abstract class Pieza {
	
	private String material;
	private String color;
	
	
	
	public abstract double Volumen();
	public abstract double Superficie();
	
	public String getMaterial() {
		return material;
	}
	public String getColor() {
		return color;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public void setColor(String color) {
		this.color = color;
	}
	

}
