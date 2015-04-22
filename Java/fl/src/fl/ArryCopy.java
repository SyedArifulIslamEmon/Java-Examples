package fl;

public class ArryCopy {
	public static void main (String args[]){
		
		int a1[]={5,10,15,20,25};
		int a2[]={2,4,6,8,10,12,14};
		System.arraycopy(a1,2,a2,4,2);
		System.out.println("\t"+a2[0]+"\n\t"+a2[1]+"\n\t"+a2[2]+"\n\t"+a2[3]+"\n\t"+a2[4]+"\n\t"+a2[5]+"\n\t"+a2[6]);
	}

}
