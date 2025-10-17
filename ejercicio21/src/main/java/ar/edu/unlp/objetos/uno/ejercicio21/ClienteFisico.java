package ar.edu.unlp.objetos.uno.ejercicio21;

import java.time.LocalDate;
import java.util.LinkedList;


public class ClienteFisico implements Cliente{
	
	private String nombre;
	private String direccion;
	private int dni;
	private LinkedList<Envio> envios;
	
	
	public ClienteFisico(String nombre, String direccion, int dni) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.dni = dni;
		envios = new LinkedList<Envio>();
	}


	@Override
	public void agregarEnvio(Envio en) {
		envios.add(en);
		
	}


	@Override
	public double calcularMonto(LocalDate fechaInicio,LocalDate fechaFinal) {
		double costos= envios.stream().filter(c -> !c.getFechaDespacho().isAfter(fechaInicio) && !c.getFechaDespacho().isBefore(fechaFinal)).mapToDouble(d -> d.costoEnvio()).sum();
		return costos * 0.9;
	}
	
	

}
