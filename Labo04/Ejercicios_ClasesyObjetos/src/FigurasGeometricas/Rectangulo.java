package FigurasGeometricas;

public class Rectangulo extends FiguraGeometrica{
	
	private double largo;
	private double ancho;
	
	public Rectangulo(double largo, double ancho) {
		this.ancho = ancho;
		this.largo = largo;
	}
	
	@Override
	public double calcularArea() {
		return ancho*largo;
	}
	
	@Override
	public String toString() {
		System.out.println("Rectangulo");
		return "Largo: " + largo + "\nAncho: " + ancho;
	}

}
