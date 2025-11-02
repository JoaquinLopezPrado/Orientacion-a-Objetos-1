package ar.edu.unlp.objetos.uno.ejercicio22;

import java.util.LinkedList;

public class PedidoSupermercado extends Pedido{
	
	private boolean cupon;

	public PedidoSupermercado(String email, LinkedList<Producto> pro, Envio en,boolean cupon) {
		super(email,pro, en);
		this.cupon=cupon;
	}
	
	
	public double calcularPeso(PedidoSupermercado ped) {/*preg*/
		return ped.getListaProductos().stream().filter(p -> p instanceof Articulo).mapToDouble(c -> c.devolverPeso()).sum();
	}
	
	public double calcularCosto() {
        double total = super.calcularCosto();
        if (cupon) {
            total *= 0.9; 
        }
        return total;
    }
	
	

}
