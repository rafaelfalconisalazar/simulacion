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

}
