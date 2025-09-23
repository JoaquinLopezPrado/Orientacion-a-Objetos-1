package ar.edu.unlp.objetos.uno.ejercicio6;

import java.time.LocalDate;

public class Factura {
	
	private Usuario us;
	private Consumo consumo;
	private LocalDate emision;
	private boolean bonificacion;
	private double montoFinal;
	private CuadroTarifario cuadro;
	
	
	public Factura(Usuario us, Consumo consumo, CuadroTarifario cuadro) {
	    this.us = us;
	    this.consumo = consumo;
	    this.cuadro = cuadro;
	    this.emision = LocalDate.now();
		this.bonificacion=this.isBonificacion();/*esta mal asi implementado?*/
		this.montoFinal=this.CalculoMontoFinal();
	}
	
	
	public boolean isBonificacion() {
		if(this.consumo.getFactorPotencia() > 0.8) {
			return true;
		}
		else return false;
	}
 

	public double CalculoMontoFinal() {
	    double precio = this.consumo.getConsumoActiva() * this.cuadro.getPrecioKwh();
	    if(bonificacion) {
	        return precio * 0.90; 
	    }
	    return precio;
	}

}
