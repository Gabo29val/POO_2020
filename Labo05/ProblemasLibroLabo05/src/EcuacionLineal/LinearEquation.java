package EcuacionLineal;

public class LinearEquation {

	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	
	public LinearEquation(double a, double b, double c, double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}

	public double getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(float c) {
		this.c = c;
	}

	public double getD() {
		return d;
	}

	public void setD(float d) {
		this.d = d;
	}

	public double getE() {
		return e;
	}

	public void setE(float e) {
		this.e = e;
	}

	public double getF() {
		return f;
	}

	public void setF(float f) {
		this.f = f;
	}
	
	public boolean isSolvable() {
		boolean flag = false;
		double aux;
		aux = getA()*getD() - getB()*getC(); 
		if(aux != 0) {
			flag = true;
		}
		return flag;
	}
	
	public double getX() {
		double x;
		x = (getE()*getD()-getB()*getF())/(getA()*getD()-getB()*getC());
		return x;
	}
	
	public double getY() {
		double y;
		y = (getA()*getF()-getE()*getC())/(getA()*getD()-getB()*getC());
		return y;
	}

}