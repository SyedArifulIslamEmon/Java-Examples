import java.util.Random;


 class Ques implements Shared {

	 
	 Random random= new Random();
	 int ask(){
		 int prob=(int)(100*random.nextDouble());
		 
		 
		 if(prob<30){
			 
			 return no;
		 }
		 else if(prob<60) {
			 
			 return yes;
			
		}
		 else if(prob<75){
			 
			 return later;
		 }
		 else if(prob<98){
			 
			 return soon;
		 }
		 else {
			return never;
		}
	 }
	

}
