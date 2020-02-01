package Supermercado;

public abstract class MedioDePago {
	
	protected float saldo;

	public MedioDePago(float saldo) {
		
		this.saldo = saldo;
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	public abstract void pagar(float monto);
	
	@Override
	public String toString() {
		return "Saldo: " + saldo;
	}
	
	

}
