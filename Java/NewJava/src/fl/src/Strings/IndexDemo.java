package Strings;

public class IndexDemo {
	public static void main (String args[]){
		
		String s="i like this java .this is best";
		System.out.println(s.indexOf('t'));
		System.out.println("--------------->"+s.length());
		//System.out.println(i-1);
		
		
		System.out.println(s.lastIndexOf('t'));
		System.out.println(s.indexOf("this"));
		System.out.println(s.indexOf('t',10));
		System.out.println(s.indexOf('t',20));
		
		
	}

}
