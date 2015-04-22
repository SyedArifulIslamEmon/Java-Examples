
 class Pass1 {
	 int a,b;
	 Pass1(int a,int b){
		 this.a=a;
		 this.b=b;
		 
	 }
	 boolean eq(Pass1 o){
		 if(o.a==a&&o.b==b){
			 
			 return true;
		 }
		 else return false;
		 
	 }

}
 class PassOb{
	 public static void main (String args[]){
		 Pass1 n=new Pass1(100,200);
		 Pass1 m=new Pass1(100,200);
		 Pass1 l=new Pass1(10,30);
		 System.out.println("1-2------>"+n.eq(m));
		 System.out.println("1-3------>"+n.eq(l));
		 System.out.println("2-3------>"+m.eq(l));
		 
	 }
	 
 }
