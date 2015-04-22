package MidTerm;

public class Circle {

	private double radius = 1.0;
	private String color = "red";

	public Circle() {

		radius = 1.0;
		color = "read";

	}

	public Circle(double radius) {
		this.radius = radius;

	}

	public double getRadius() {

		return radius * radius;
	}

	public double getArea() {
		return radius * radius * Math.PI;

	}

	public String toString() {

		return "Circle[radius=" + radius + ", color=" + "]";
	}

}

class Cylinder extends Circle {
	private double height = 1.0;

	public Cylinder() {
		this.height = 1.0;

	}

	public Cylinder(double height) {
		this.height = height;

	}

	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;

	}

	public double getHeight() {
		return height;
	}

	public double getVolume() {

		return getArea() * height;
	}

}
