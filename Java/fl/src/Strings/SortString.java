package Strings;

public class SortString {
	public static void main (String args[]){
		
		String s[]={"E","F","G","C","D","B","A"};
		for(int j=0;j<s.length;j++){
			for(int i=j+1;i<s.length;i++){
				
				if(s[i].compareTo(s[j])<0){
					
					String t=s[j];
					s[j]=s[i];
					s[i]=t;
					
					
					
					
					
				}
				
			}
			System.out.println(s[j]);
			
		}
		
	}

}
