package Strings;

public class SubStringCons {
	public static void main (String args[]){
		
		byte a[]={65,66,67,68,69,70 };
		String s=new String(a);
		System.out.println(s);
		try {
			String s1=new String(a,3,3);
			
			System.out.println(s1);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
