
class Test {

	public static void main(String[] args) {
		Bruteforces bfs = new Bruteforces();
		String text = "c";
		String pattern = "c";
		
		bfs.setString(text, pattern);
		int first_occur_position = bfs.search();
		System.out.println("The text '" + pattern + "' is first found after the " + first_occur_position + " position.");
	}

}