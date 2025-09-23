package ar.edu.unlp.objetos.uno.ejercicio5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Plazofijo implements Inversion{
	
	private double montoDepositado;
	private double porcentajeInteres;
	private LocalDate fecha;

	
	public Plazofijo(double monto) {
		this.fecha=LocalDate.now();
		this.montoDepositado=monto;
		this.porcentajeInteres=20;
	}
	public double ValorActual() {
		long dias = ChronoUnit.DAYS.between(fecha, LocalDate.now());
        double interesDiario = (porcentajeInteres / 100.0) / 365.0;
        return montoDepositado + (montoDepositado * interesDiario * dias);
	}

	public double getMontoDepositado() {
		return montoDepositado;
	}

	public double getPorcentajeInteres() {
		return porcentajeInteres;
	}

	public void setMontoDepositado(double montoDepositado) {
		this.montoDepositado = montoDepositado;
	}

	public void setPorcentajeInteres(double porcentajeInteres) {
		this.porcentajeInteres = porcentajeInteres;
	}
	
}
