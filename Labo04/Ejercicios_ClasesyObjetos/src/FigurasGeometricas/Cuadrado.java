package FigurasGeometricas;

public class Cuadrado extends FiguraGeometrica{
	private double lado;
	
	public Cuadrado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public double calcularArea() {
		return lado*lado;
	}
	
	@Override
	public String toString() {
		System.out.println("Cuadrado");
		return "Lado: " + lado;
	}

}
