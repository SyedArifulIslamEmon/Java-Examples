package Strings;

public class Stringconcat {
	
	public static void main (String args[]){
		
		String s1 = "java";

		String s2 = "ja"+"va";

		String s3 = "ja";
		String s4 = "va";

		String s5 = s3 + s4;
		String s6 = s3 + "va";
		String s7 = "ja" + s4;

		String s8 = "ja".concat("va");
		String s9 = "ja".concat(s4);
		String s10 = s3.concat("va");

		System.out.println(s1 == s2); // true
		System.out.println(s1 == s5); // false
		System.out.println(s1 == s6); // false
		System.out.println(s1 == s7); // false
		System.out.println(s1 == s8); // false
		System.out.println(s1 == s9); // false
		System.out.println(s1 == s10); // false
		
		
	}

}
