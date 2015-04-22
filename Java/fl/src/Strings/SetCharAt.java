package Strings;

public class SetCharAt {
	public static void main (String args[]){
		
		StringBuffer s=new StringBuffer("hello");
		System.out.println(s);
		System.out.println(s.charAt(1));
		s.setCharAt(1,'i');
		System.out.println(s);
		s.setLength(2);
		
		System.out.println(s);
		System.out.println(s.charAt(1));
		
	}

}
