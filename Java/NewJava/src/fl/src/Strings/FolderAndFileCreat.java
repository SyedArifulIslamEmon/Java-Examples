package Strings;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FolderAndFileCreat {
	public static void main (String args[]) throws FileNotFoundException{
		
		File file = new File("E:/da/file.txt");
		file.getParentFile().mkdirs();

		PrintWriter printWriter = new PrintWriter(file);
		
		
	}

}
