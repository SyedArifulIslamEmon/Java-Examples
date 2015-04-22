 class GiftBox {
	private double width;
	private double height;
	private double depth;

	public GiftBox(double width, double height, double depth) {
		//super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	public GiftBox(double width) {
		//super();
		this.width = width;
	}

	public double Volume() {

		return width * height * depth;

	}

}

class GiftBoxWeight extends GiftBox {

	private double weight;

	GiftBoxWeight(double width, double height, double depth, double weight) {
		super(width, height, depth);
		this.weight = weight;

	}

	public GiftBoxWeight(double width, double weight) {
		super(width);
		this.weight = weight;
	}

}