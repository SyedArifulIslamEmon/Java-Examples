
class A10 {
private	int a,b,c;
   A10(A10 o){
	a=o.a;
	b=o.b;
	c=o.c;
	
	
   }
    
   A10(int i,int j,int k){
	   a=i;
	   b=j;
	   c=k;
	   
   }
   A10(){
	  a=5;
	  b=5;
	  c=-5;
	   
   }
   int v(){
	  return a*b*c; 
	   
   }
}
class B10 extends A10{
	int d;
	B10(B10 o){
		super(o);
		d=o.d;
		
	}
	B10(int i,int j,int k,int l ){
		super(i,j,k);
		d=l;
	}
	B10(){
		
	}
	
}

class C10 extends B10{
int e;
C10(C10 o){
	super(o);
e=o.e;	
	
}
C10(int i,int j,int k,int l,int m){
	super (i,j,k,l);
	
	
}
	
}
class Multi{
	public static void main (String args[]){
		C10 n=new C10(10,10,10,10,10);
		C10 m=new C10(20,5,5,6,7);
		System.out.println(n.v());
		C10 p=new C10(m);
		System.out.println(p.v());
		
		
	}
	
}