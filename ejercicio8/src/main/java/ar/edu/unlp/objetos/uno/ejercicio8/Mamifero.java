package ar.edu.unlp.objetos.uno.ejercicio8;

import java.time.LocalDate;

public class Mamifero {
	
	private String Identificador;
	private String Especie;
	private LocalDate FechaNacimiento;
	private Mamifero padre;
	private Mamifero madre;
	
	
	public Mamifero(String nombre) {
		this.Identificador =nombre;
	}
	public Mamifero() {
		
	}
	
	public String getIdentificador() {
		return Identificador;
	}
	public String getEspecie() {
		return Especie;
	}
	public LocalDate getFechaNacimiento() {
		return FechaNacimiento;
	}
	public void setIdentificador(String identificador) {
		Identificador = identificador;
	}
	public void setEspecie(String especie) {
		Especie = especie;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}
	
	public Mamifero getPadre() {
		return this.padre;
	}
	public void setPadre(Mamifero padre) {
		this.padre=padre;
	}
	public Mamifero getMadre() {
		return this.madre;
	}
	public void setMadre(Mamifero madre) {
		this.madre=madre;
	}
	public Mamifero getAbueloMaterno() {
		if(this.getPadre() == null) {
			return null;
		}
		return this.getMadre().getPadre();
	}
	public Mamifero getAbueloPaterno() {
		if(this.getPadre() == null) {
			return null;
		}
		return this.getPadre().getPadre();
	}
	public Mamifero getAbuelaMaterna() {
		if(this.getMadre() == null ) {
			return null;
		}
		return this.getMadre().getMadre();
	}
	public Mamifero getAbuelaPaterna() {
		if(this.getMadre() == null ) {
			return null;
		}
		return this.getPadre().getMadre();
	}
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		
		if (unMamifero != null) {
	        return tieneComoAncestroA(unMamifero, this.getPadre()) || tieneComoAncestroA(unMamifero, this.getMadre());
	    }
	    return false;
	}
	
	private boolean tieneComoAncestroA(Mamifero unMamifero, Mamifero actual) {
		
		 if (actual == null) {
		        return false;
		 }
		 if (actual == unMamifero) {
		        return true;
		 }
		    return tieneComoAncestroA(unMamifero, actual.getPadre()) || tieneComoAncestroA(unMamifero, actual.getMadre());
	}

}
