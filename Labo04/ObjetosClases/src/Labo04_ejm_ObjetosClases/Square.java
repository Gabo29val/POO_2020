package Labo04_ObjetosClases;

public class Square {
	
	int width;
	int heigth;
	float area;
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeigth() {
		return heigth;
	}
	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	
	public Square(int width, int heigth, float area) {
		this.width = width;
		this.heigth = heigth;
		this.area = area;
	}
	
	

}
