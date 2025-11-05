package ar.edu.unlp.info.oo1.Parcial1;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Usuario {
	
	private String nombre;
	private List<Entrada> listaEntradas;
	private Evento ev;
	
	public Usuario(String nombre) {
		super();
		this.nombre = nombre;
		this.listaEntradas = new LinkedList<Entrada>();
	}

	public String getNombre() {
		return nombre;
	}

	public List<Entrada> getListaEntradas() {
		return listaEntradas;
	}

	public double Consulta() {/*estaria bien?*/
		return ev.consultarPrecio(LocalDate.now());
	}
	
	public double montoTotalEntreFechas(LocalDate fechaInicial,LocalDate fechaFinal) {
		return listaEntradas.stream().filter(e -> !e.getFechaCompra().isBefore(fechaInicial) && !e.getFechaCompra().isAfter(fechaFinal))
		        .mapToDouble(e -> e.getEv().precioAsistencia())
		        .sum();
		}
	
	public Entrada proximaEntrada() {
		return listaEntradas.stream().filter(e -> !e.getEv().getFecha().isBefore(LocalDate.now())).min(Comparator.comparing(c -> c.getEv().getFecha())).orElse(null);
		}
	}


