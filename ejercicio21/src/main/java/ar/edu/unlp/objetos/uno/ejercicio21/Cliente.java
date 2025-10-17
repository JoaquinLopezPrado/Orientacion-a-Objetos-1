package ar.edu.unlp.objetos.uno.ejercicio21;

import java.time.LocalDate;


public interface Cliente {
	
	
	public void agregarEnvio(Envio en);
	
	public double calcularMonto(LocalDate fechaInicio,LocalDate fechaFinal);
	
	/*preguntar porque yo pense que envio tenia una lista de cliente pero al parecer no, que me expliquen bien porque no*/

}
