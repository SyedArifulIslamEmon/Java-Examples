

import java.util.*;
 class Te2 {
void v(){
	System.out.println(" No peremeter");
	
}
void v(double d){
	System.out.println("new value is ---->"+d);
	
}
void v(int a,int b){
	System.out.println("a is ----->"+a+"   b is ----->"+b);
	
}
}
class Test2{
public static void main(String args[]){	
int a;
 Scanner in=new Scanner (System.in); 
 a=in.nextInt();
 Te2 n=new Te2();
 n.v(a);
 n.v(10,12);
 n.v();
 
}
}