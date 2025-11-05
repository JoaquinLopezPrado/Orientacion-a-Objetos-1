package ar.edu.unlp.info.oo1.Parcial1;

import java.time.LocalDate;

public abstract class Evento {
	
	private String nombre;
	private LocalDate fecha;
	private String temaPrincipal;
	private double precioInscripcion;
	private double precioRemera;
	
	
	public Evento(String nombre, LocalDate fecha, String temaPrincipal, double precioInscripcion, double precioRemera) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
		this.temaPrincipal = temaPrincipal;
		this.precioInscripcion = precioInscripcion;
		this.precioRemera = precioRemera;
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public String getTemaPrincipal() {
		return temaPrincipal;
	}

	public double getPrecioInscripcion() {
		return precioInscripcion;
	}

	public double getPrecioRemera() {
		return precioRemera;
	}

	public abstract double precioAsistencia();
	
	public double consultarPrecio(LocalDate fechaConsulta) {
		double aumento = this.precioInscripcion * 0.20;
		if(fechaConsulta.equals(this.getFecha())) {
			return this.precioAsistencia() + this.precioInscripcion + aumento;
		}
		return this.precioAsistencia();
		
	}

}
