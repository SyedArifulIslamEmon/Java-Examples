package InputFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Test {
	
	
	/// ================== CREAT FILE ======================

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			PrintWriter file =new PrintWriter(new File("C:/Users/User/Desktop/EncryptedMessage.txt"));
			
			PrintWriter file1 =new PrintWriter(new File("C:/Users/User/Desktop/","fuck.txt"));
			
			file.write("sdsfdf");
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
