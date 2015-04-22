
public  class MammalInt implements Animal {

	
	public void eat() {
		
		System.out.println("Mammal Eat");
		
	}

	
	public void travel() {
		
	System.out.println("Mammal Travel");
		
	}
	int  v(){
		
		return 50;
	}
	
	public static void main(String args[]){
	MammalInt m =new  MammalInt();	
	m.eat();
	m.travel();
	
	System.out.println(m.v());
		
	}
	
	

}
