package ar.edu.unlp.info.oo1.ejercicio3Recursante;

public class Item {
	
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	
	public Item(String detalle,int cant,double costoU) {
		this.detalle=detalle;
		this.cantidad=cant;
		this.costoUnitario=costoU;
		
	}
	public double costo() {
		return this.getCostoUnitario() * this.getCantidad();
	}
	public String getDetalle() {
		return detalle;
	}
	public int getCantidad() {
		return cantidad;
	}
	
	public double getCostoUnitario() {
		return costoUnitario;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public void setConstoUnitario(double constoUnitario) {
		this.costoUnitario = constoUnitario;
	}
	
	
	

}
