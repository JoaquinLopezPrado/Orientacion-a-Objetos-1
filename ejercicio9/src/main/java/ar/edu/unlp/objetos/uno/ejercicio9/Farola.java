package ar.edu.unlp.objetos.uno.ejercicio9;

import java.util.LinkedList;
import java.util.List;

public class Farola {
	
	private boolean estado;
	private LinkedList<Farola> listaFarolas;

	public Farola () {
		this.estado=false;
		this.listaFarolas = new LinkedList<Farola>();
	}

	public void pairWithNeighbor( Farola otraFarola ) {
		if(otraFarola != null && !this.listaFarolas.contains(otraFarola)) {
			this.listaFarolas.add(otraFarola);
			otraFarola.listaFarolas.add(this);
		}
	}

	public List<Farola> getNeighbors (){
		return this.listaFarolas;
	}
	
	public void turnOn() {
		if(!this.estado) {
			this.estado=true;
			for(Farola vecina : this.listaFarolas) {
				vecina.turnOn();
			}
		}
	}
	public void turnOff() {
		if(this.estado) {
			this.estado=false;
			for(Farola vecina : this.listaFarolas) {
				vecina.turnOff();
			}
		}
	}
	
	public boolean isOn() {
		return this.estado;
		
    }
	public boolean isOff() {
		return !this.estado;
		
    }
}
