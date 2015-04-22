package fl;

public class Square extends Rectangle {
	public double side;

	public Square() {
		super();
	}

	public Square(double side) {
		super();
		this.side = side;
	}

	public Square(double side, String color, boolean filled) {
		super(color, filled);

	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public void setWidth(double side) {
		this.side = side;
	}

	public void setLength(double side) {
		this.side = side;
	}

	public String toString() {

		return " Square[side=" + side + ",width=" + ",length=" + ",color="
				+ ",filled=" + "]";
	}

}
