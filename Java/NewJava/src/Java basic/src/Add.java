
 class Add {
	 private int a,b,c,d;
	 public void seta(int a){
		 c=a;
		 
	 }
	 public void setb(int b){
		 
		 d=b;
	 }
	 public int geta(){
		 
		 return c;
	 }
	 public int getb(){
		 
		 return d;
	 }
	 public int getadd(){
		 return c+d;
	 }
	 public static void main(String args[]){
		 Add p=new Add();
		 p.seta(300);
		 p.setb(200);
		 System.out .println("a="+p.geta()+" b="+p.getb()+" a+b=="+p.getadd());
		 
		 
	 }

}
