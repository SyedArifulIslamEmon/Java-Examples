
class D6 {
	int a,b;
	D6(int i,int j ){
		a=i;
		b=j;
		
	}
	void show(){
		
		System.out.println ("i and j : " + a +  " " + b);
		
	}

}
class B6 extends D6{
	int c;
	B6(int i,int j,int k){
		
		super (i,j);
		c=k;
		
	}
	void show(String m){
		System.out.println(m+c);
		
	}
	
}
class Overlod{
	public static void main (String args[]){
		
		B6 n =new B6(10,20,30);
		
		n.show("This is k: ");
		n.show();
	}
	
}