
class BoxDemos3{
	double ai,bi,ci;
	double v(){
		return ai*bi*ci;
	}
	public void setdemo(int a,int b,int c){
		ai=a;
		bi=b;
		ci=c;
		
		
	}

}
class BoxDemo5{
	public static void main (String args[]){
		BoxDemos3 in=new BoxDemos3();
		in.setdemo(10,20,30);
		System.out.println("volum is ----> "+in.v());
		
	}
	
}