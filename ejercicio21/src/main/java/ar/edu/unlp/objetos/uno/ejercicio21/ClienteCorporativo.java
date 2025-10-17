package ar.edu.unlp.objetos.uno.ejercicio21;

import java.time.LocalDate;
import java.util.LinkedList;


public class ClienteCorporativo implements Cliente{
	
	private String nombreEmpresa;
	private String direccion;
	private int CUIT;
	private LinkedList<Envio> envios;
	
	
	public ClienteCorporativo(String nombreEmpresa, String direccion, int cUIT) {
		super();
		this.nombreEmpresa = nombreEmpresa;
		this.direccion = direccion;
		this.CUIT = cUIT;
		envios = new LinkedList<Envio>();
	}


	@Override
	public void agregarEnvio(Envio en) {
		envios.add(en);
		
	}


	@Override
	public double calcularMonto(LocalDate fechaInicio,LocalDate fechaFinal) {
		return envios.stream().filter(c -> !c.getFechaDespacho().isAfter(fechaInicio) && !c.getFechaDespacho().isBefore(fechaFinal)).mapToDouble(d -> d.costoEnvio()).sum();
	}
	
	
}
