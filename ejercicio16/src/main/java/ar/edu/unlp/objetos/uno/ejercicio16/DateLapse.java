package ar.edu.unlp.objetos.uno.ejercicio16;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse {
	
	private LocalDate from;
	private LocalDate to;
	
	
	
	public LocalDate getFrom() {
		return this.from;
	}

	public LocalDate getTo() {
		return this.to;
	}
	
	public int sizeInDays() {
		long dias=this.from.until(to, ChronoUnit.DAYS);
		return (int)dias;
		
	}
	
	public boolean includesDate(LocalDate other) {
		return other.isAfter(from) && other.isBefore(to);
	}
	
}
