package File;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class Files {

	

	

	public static void main(String args[]) {
		//String s;
		// TODO Auto-generated method stub
     File file=new File("C:\\Users\\User\\Desktop\\T.txt");
  // try {
	
	
	Scanner n=new Scanner(file);
	while (n.hasNext()) {
		String string =  n.nextLine();
		System.out.println(string+"\n");
	//}
//} catch (Exception e) {
	// TODO: handle exception
	//System.out.println("file not found");
//}
	
	
	}

}
