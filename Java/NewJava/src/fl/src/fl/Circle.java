package fl;

class Circle extends Shape {
	protected double radius;

	public Circle() {
		super();
	}

	public Circle(String color) {
		super();
		this.radius = radius;
	}

	public Circle(double radius,String color, boolean filled ) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return radius * radius * Math.PI;

	}

	public double getPerimeter() {
		return 2 * Math.PI * radius;

	}

	public String toString() {

		return "Circle[radius=" + radius + ",color=" + ",filled=" + "]";
	}

}
