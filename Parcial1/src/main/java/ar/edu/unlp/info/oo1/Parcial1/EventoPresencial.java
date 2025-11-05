package ar.edu.unlp.info.oo1.Parcial1;

import java.time.LocalDate;
import java.util.List;

public class EventoPresencial extends Evento{
	
	private List<Sede> listaSedes;
	
	
	public EventoPresencial(String nombre, LocalDate fecha, String temaPrincipal, double precioInscripcion,double precioRemera) {
		super(nombre, fecha, temaPrincipal, precioInscripcion, precioRemera);
	}

	public double precioAsistencia() {
		return super.getPrecioInscripcion()+ super.getPrecioRemera() + totalSedes();
	}
	
	public double totalSedes() {
		return listaSedes.stream().mapToDouble(c -> c.precioTotal()).sum();
	}

}
