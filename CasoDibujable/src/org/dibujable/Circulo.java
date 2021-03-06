package org.dibujable;
//Circulo.java
public class Circulo implements Geometria {
	static int numCirculos = 0;
	public static final double PI = 3.14159265358979323846;
	 double x;
	 double y;
	 double r;

	public Circulo(Circulo c) {
		this(c.x, c.y, c.r);
	}

	public Circulo() {
		this(0.0, 0.0, 1.0);
	}

	public Circulo(double x, double y, double r) {
		this.x = x;
		this.y = y;
		this.r = r;
		numCirculos++;
	}

	public Circulo(double r) {
		this(0.0, 0.0, r);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	@Override
	public double perimetro() {
		return 2.0 * PI * r;
	}
	
	@Override
	public double area() {
		return PI * r * r;
	}

	// m�todo de objeto para comparar c�rculos
	public Circulo elMayor(Circulo c) {
		if (this.r >= c.r)
			return this;
		else
			return c;
	}

	// m�todo de clase para comparar c�rculos
	public static Circulo elMayor(Circulo c, Circulo d) {
		if (c.r >= d.r)
			return c;
		else
			return d;
	}
} // fin de la clase Circulo