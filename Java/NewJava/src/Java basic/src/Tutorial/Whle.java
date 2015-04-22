package Tutorial;

public class Whle {
	public static void main (String args[]){
		int a[]=new int[100];
		int i=100;
		while (i>0){
			a[--i]=i;
		//i--;
		//	System.out.println(i+"-------->"+a[i]);
			
		}
		//while (i<100) {
			//System.out.println(i+"----->"+a[i]);
			//i++;
		//}
		int j=2;
		do{
			System.out.println("do-while---->"+j);
			j--;
		}while(j<2&&j>0);
		j=1;
		while(j<2&&j>0){
			System.out.println("while------>"+j);
			j--;
		}
	}

}
