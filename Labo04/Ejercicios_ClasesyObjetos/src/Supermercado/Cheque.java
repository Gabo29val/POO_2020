package Supermercado;

public class Cheque extends MedioDePago {
	private String codigo;

	
	public Cheque(float saldo, String codigo) {
		super(saldo);
		this.codigo = codigo;
	}
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	@Override
	public void pagar(float monto) {
		System.out.println("Ud ha pagado " + monto + "soles.");
	}
	
	@Override
	public String toString() {
		return "Cheque" + "\nCodigo: " + codigo;
	}
	

}
