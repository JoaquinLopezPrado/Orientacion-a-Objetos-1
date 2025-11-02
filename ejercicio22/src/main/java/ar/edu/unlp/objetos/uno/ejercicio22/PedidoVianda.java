package ar.edu.unlp.objetos.uno.ejercicio22;

import java.util.LinkedList;

public class PedidoVianda extends Pedido{
	
	private boolean esCeliaco;

	public PedidoVianda(String email, LinkedList<Producto> pro, Envio en,boolean celi) {
		super(email,pro, en);
		this.esCeliaco=celi;
	}
	
	 public boolean isEsCeliaco() {
	        return esCeliaco;
	    }

}
