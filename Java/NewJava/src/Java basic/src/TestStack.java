
class Stack {
	int s[]=new int [30],t;
	Stack(){
	t=-1;	
		
	}
	void push(int item){
		if(t==9){
			System.out.println("Stack is full ");
			
		}
		else{
			s[++t]=item;
			
		}
		
	}
	int pop(){
		if(t<0){
			System.out.println("Stsck is empaty");
			return 0;
		}
		else{
			return s[t--];
			
		}
		
	}

}
class TestStack{
	public static void main (String args[]){
		
		Stack n=new Stack();
		for(int i=0;i<10;i++){
			n.push(i);
			
		}
		for(int i=0;i<10;i++){
			System.out.println(n.pop());
			
		}
	}
}