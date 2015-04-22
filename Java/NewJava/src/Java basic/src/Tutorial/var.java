package Tutorial;

public class var {
    public static void main (String args[]){
    	short a;
    	int b;
    	a=10;
    	b=30;
    	System.out.println("a--->"+a);
    	System.out.println("b--->"+b);
    	double c;
    	c=1.95;
    	float  d=(float) 4.4656767;
    	System.out.println("c--->"+c);
    	System.out.println("d----->"+d);
    	char ch;
    	ch='a';
    	System.out.println("ch--->"+a);
    	boolean s=true;
    	System.out.println("s--->"+s);
    	int n1,n2,r;
    	n1=11;
    	n2=20;
    	 r=n1+n2;
    	System.out.println("r--->"+r);
    	 r=n1-n2;
    	System.out.println("r--->"+r);
    	r=n1/n2;
    	System.out.println("r--->"+r);
    	r=n1%n2;
    	System.out.println("r--->"+r);
    	n1=n1+10;
    	System.out.println("n1--->"+n1);
    	n2+=2;
    	System.out.println("n2--->"+n2);
    	int ar[]={1,2,3,4,5};
    	System.out.println("ar--->"+ar[2]);
    	char cc[]={'1','2','A','B'};
    	System.out.println("a--->"+cc[3]);
    	System.out.println("method--->"+v(10,20));
    
    }
 static boolean v(int a,int b){
    	boolean add;
    	add=a>b;
    	return add;
    }
    
}
