package FigurasGeometricas;

public class Circulo extends FiguraGeometrica{
	
	private double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	@Override
	public double calcularArea() {
		return Math.PI*Math.pow(radio, 2);
	}
	
	@Override
	public String toString() {
		System.out.println("Circulo");
		return "Radio: " + radio;
	}

}
