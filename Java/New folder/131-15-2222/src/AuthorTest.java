
public class AuthorTest {
	public static void main (String args[]){
		
		Author ob=new Author("Herbert Schildt", "MC-Hill@gmail.com", "Male");
		
		System.out.println(ob);
		
		ob.setEmail("MC-Hill@yahoo.com");
		
		System.out.println(ob);
		
		
	}

}
