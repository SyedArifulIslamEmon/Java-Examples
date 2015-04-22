
import java.io.File;
import java.io.IOException;
 
public class FileHidden
{
 
    public static void main(String[] args) throws IOException
    {	
    	File file = new File("C:/Users/User/Desktop/Cradle Of Filth - Nymphetamine [OFFICIAL VIDEO] - YouTube.mp4");
 
    	if(file.isHidden()){
    		System.out.println("This file is hidden");
    	}else{
    		System.out.println("This file is not hidden");
    	}
    }
}
