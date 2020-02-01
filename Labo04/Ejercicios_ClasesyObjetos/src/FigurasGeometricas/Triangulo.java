package FigurasGeometricas;

public class Triangulo extends FiguraGeometrica{
	
	private double lado1;
	private double lado2;
	private double lado3;
	
	public Triangulo(double lado1, double lado2, double lado3) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	
	@Override
	public double calcularArea() {
		double p = (lado1+lado2+lado3)/2;
		return Math.sqrt((p)*(p-lado1)*(p-lado2)*(p-lado3));
	}
	
	@Override
	public String toString() {
		System.out.println("Triangulo");
		return "Lado1: " + lado1 + "\nLado2: " + lado2 + "\nLado3: " + lado3;
	}

}
