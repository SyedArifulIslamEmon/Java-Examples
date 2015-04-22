
class D3 {
	int i,j,k;
	D3(D3 ob){
	i=ob.i;
	j=ob.j;
	k=ob.k;
		
	}
	D3(){
		i=-1;
		j=-1;
		k=-1;
		
	}
	D3(int a,int b,int c){
		i=a;
		j=b;
		k=c;
	}
	D3(int a){
		i=j=k=a;
		
	}
	void  v(){
		System.out.println("Vol-->"+(i*j*k));
	}

}
class B3 extends D3{
	int l;
	B3(int a,int b,int c,int d){
		i=a;
		j=b;
		k=c;
		l=d;
		
	}
	
}
class Ins2{
	public static void main(String args[]){
		
		B3 n=new B3(10,10,10,10);
		B3 m=new B3(5,5,5,5);
		n.v();
		m.v();
	}
	
}