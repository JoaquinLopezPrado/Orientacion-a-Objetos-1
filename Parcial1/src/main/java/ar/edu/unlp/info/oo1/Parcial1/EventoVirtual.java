package ar.edu.unlp.info.oo1.Parcial1;

import java.time.LocalDate;

public class EventoVirtual extends Evento{
	
	private double montoEnvioRemera;

	
	public EventoVirtual(String nombre, LocalDate fecha, String temaPrincipal, double precioInscripcion, double precioRemera,double precioEnvio) {
		super(nombre,fecha,temaPrincipal,precioInscripcion,precioRemera);
		this.montoEnvioRemera=precioEnvio;
	}
	
	@Override
	public double precioAsistencia() {
		return super.getPrecioInscripcion() + super.getPrecioRemera() + this.montoEnvioRemera;
	}

}
