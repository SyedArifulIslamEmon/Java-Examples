
import java.io.File;
 
public class CreateDirectoryExample
{
    public static void main(String[] args)
    {	
	File file = new File("D:\\Directory1\\");
	if (!file.exists()) {
		if (file.mkdir()) {
			System.out.println("Directory is created!");
		} else {
			System.out.println("Failed to create directory!");
		}
	}
 
	File files = new File("D:\\Directory2\\sub1\\sudb2\\");
	if (!files.exists()) {
		if (files.mkdirs()) {
			System.out.println("Multiple directories are created!");
		} else {
			System.out.println("Failed to create multiple directories!");
		}
	}
 
    }
}
