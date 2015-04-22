package File;

public class TestAuthor {
	public static void main(String args[]) {

		Author anAuthor = new Author("parvez", "parvez@gmail.com", 'm');
		System.out.println(anAuthor);
		anAuthor.setEmail("parvez@yahoo.com");
		System.out.println(anAuthor);

		// System.out.println("so parvez has tow Email adderss");

	}

}
