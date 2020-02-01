package Supermercado;

public class Tarjeta extends MedioDePago {
	private String codigo;
	private String clave;
	
	public Tarjeta(float saldo, String codigo, String clave) {
		super(saldo);
		this.codigo = codigo;
		this.clave = clave;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
	
	@Override
	public void pagar(float monto) {
		float saldoDisp = 0;
		if(super.saldo >= monto) {
			saldoDisp = super.saldo - monto;
		}else {
			System.out.println("Saldo insuficiente");
		}
		System.out.println("Su saldo actual es: " + saldoDisp);
	}
	
	@Override
	public String toString() {
		return "Tarjeta " + "\nCodigo: " + codigo;
	}

}
