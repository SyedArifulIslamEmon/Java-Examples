
class Box10 {
 double i,j,k;
void setv(double i,double j,double k ){
	this.i=i;
	this.j=j;
	this.k=k;
}
double v(){
	
	return i*j*k;
}
}
class BoxDemo10{
	public static void main (String args[]){
		Box10 n=new Box10();
		n.setv(10, 20,30 );
		System.out.println("vl------>"+n.v());
		
	}
	
}