package ar.edu.unlp.info.oo1.Parcial1;

import java.time.LocalDate;

public class Entrada {
	
	private boolean seguro;
	private Usuario us;
	private Evento ev;
	private LocalDate fechaCompra;
	
	
	
	public Entrada(boolean seg,Usuario us,Evento ev) {
		this.seguro=seg;
		this.us=us;
		this.ev=ev;
		this.fechaCompra=LocalDate.now();
	}
	
	public double recuperarMonto() {
		long diferenciaDias = ev.getFecha().toEpochDay() - this.fechaCompra.toEpochDay();
	    double monto = 0;

	    if (diferenciaDias >= 30) {
	        monto = ev.precioAsistencia() * 0.50;
	    }

	    if (this.seguro) {
	        monto += ev.precioAsistencia() * 0.15;
	    }
	    return monto;
	}

	public Evento getEv() {
		return ev;
	}

	public LocalDate getFechaCompra() {
		return fechaCompra;
	}

	
}
