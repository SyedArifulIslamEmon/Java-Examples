package ClassTest;

public class Testmain {
     public static void main (String args[]){
	
	Author anAuthor=new Author("parvez","parvez@gmail.com",'m');
	Book aBook=new Book("java for dummy",anAuthor,19.95,1000);
	Book anotherBook=new Book("more java for dummy",new Author("parvez","parvez@gmail.com",'m'),29.95,888);
	
	System.out.println(aBook.getAuthor().getName());
     }
}
