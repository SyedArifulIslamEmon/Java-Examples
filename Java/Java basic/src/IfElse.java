
public class IfElse {
	public static void main (String args[]){
		int m=4;
		String s;
		if(m==12||m==1||m==2){
			s="Winter";
			
		}
		else if(m==3||m==4||m==5){
			s="SPRING";
			
		}
		else if(m==6||m==7||m==8){
			
			s="SUMMER";
			
		}
		else if (m==9||m==10||m==11){
			s="AUTUM";
		}
		else{
			
			s="BOgus mounth";
		}
		System.out.println("April is in the "+s);
		
	}

}
