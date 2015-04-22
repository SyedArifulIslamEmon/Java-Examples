
public class bruteforce {

	
	
	public void matches(String s, String toFind) {
		   for(int i=0; i<(s.length()-toFind.length()); i++)
		      if(s.substring(i,i+toFind.length()).equals(toFind))
		         System.out.println("Srting Match");
		   System.out.println("Srting not Match");
		}
	
	
	
	public static void main(String[] args) {
		bruteforce b=new bruteforce();
		
		b.matches("sdsdsdaffdgffghfjjgkjkgghfhfhgbvbcvbbgfgdsudipfhghghghghgh", "sudip");
		
		

	}

}
