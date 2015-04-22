package Strings;

public class DeletStrings {
	public static void main (String args[]){
		
		StringBuffer s=new StringBuffer("i like java");
		s.delete(2,7);
		System.out.println(s);
		s.deleteCharAt(0);
		System.out.println(s);
		
		
	}

}
