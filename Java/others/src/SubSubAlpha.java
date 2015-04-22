class Alpha {
	static String s = " ";

	Alpha() {
		s += "alpha";
	}
}

class SubAlpha extends Alpha {
	SubAlpha() {
		s += "aaa ";
	}
}

public class SubSubAlpha extends Alpha {
	SubSubAlpha() {
		s += "subsub ";
	}

	public static void main(String[] args) {
		new SubSubAlpha();
		System.out.println(s);
	}
}
