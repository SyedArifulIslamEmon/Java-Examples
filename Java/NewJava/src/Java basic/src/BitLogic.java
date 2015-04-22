
public class BitLogic {
    public static void main (String args[]){
    	String bi[]={"0000","0001","0010","0011","0100","0101","0110","0111",
    			"1000","1001","1010","1011","1100","1101","1110","1111"
    	};
    	int a=3;
    	int b=6;
    	int c=a|b;
    	int d=a&b;
    	int e=a^b;
    	int f=(~a&b)|(a&~b);
    	int g=~a&0x0f;
    	System.out.println("a="+bi[a]);
    	System.out.println("b="+bi[b]);
    	System.out.println("a|b="+bi[c]);
    	System.out.println("a&b="+bi[d]);
    	System.out.println("a^b="+bi[e]);
    	System.out.println("~a&b|a&~b="+bi[f]);
    	System.out.println("~a&0x0f="+bi[g]);
    	
    	
    }
}
