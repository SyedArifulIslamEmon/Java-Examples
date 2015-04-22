package InputFiles;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;

public class PrintWritters {

  public static void main(String[] args) throws FileNotFoundException {

    File file = new File ("D:/file.txt");
    PrintWriter printWriter = new PrintWriter (file);
    printWriter.println ("hello");
    printWriter.close ();       
  }
}
