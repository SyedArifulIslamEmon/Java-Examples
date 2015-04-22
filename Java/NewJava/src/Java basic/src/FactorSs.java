
 class Fact {
int  f(int a){
	int r;
	if(a==1) return 1 ;
	//else{
	
		r =f(a-1)*a;
		
		System.out.println("fact is"+r);
	return r;
	
 //}
}
}
class FactorSs{
	public static void main (String args[]){
		Fact n=new Fact();
		//System.out.println("fact is --->"+n.f(5));
		n.f(5);
		
	}
	
}