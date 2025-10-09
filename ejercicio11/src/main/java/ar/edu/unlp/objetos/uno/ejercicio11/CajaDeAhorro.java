package ar.edu.unlp.objetos.uno.ejercicio11;

public class CajaDeAhorro extends Cuenta{
	
	

	@Override
	protected boolean puedeExtraer(double monto) {
		if(this.getSaldo()>=monto + monto *0.02) {
			return true;
		}
		return false;
	}
	
	@Override
	public boolean extraer(double monto) {
		double costo=monto + monto *0.02;
		if(this.puedeExtraer(monto)) {
			this.extraerSinControlar(costo);
			return true;
		}
		return false;
	}
	
	
	public boolean transferirACuenta(double monto, Cuenta cuentaDestino) {
		double costo=monto + monto *0.02;
		if(this.puedeExtraer(monto)) {
			this.extraerSinControlar(costo);
			cuentaDestino.depositar(monto);
			return true;
		}
		return false;
		}
	}

	
	

