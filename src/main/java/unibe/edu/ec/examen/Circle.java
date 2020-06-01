package unibe.edu.ec.examen;

public class Circle {
	
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double calculateArea() {
		double area= Math.PI*radius*radius;
		return area;
	}
	
	public double calculatePerimeter(double pi) {
		double perimeter= pi*2*radius;
		return perimeter;
	}
	
	public double calculateVolum(double pi, double radius) {
		double volum=(4.0/3.0)*pi*radius*this.radius*this.radius;
		return volum;
	}


}
