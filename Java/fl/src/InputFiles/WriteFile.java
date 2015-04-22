package InputFiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        File file= new File("C:/Users/User/Desktop/S.txt");
        FileWriter fw=new FileWriter(file,true);
        try {
            
            fw.write("This is first line");
            fw.write("This is second line");
            fw.write("This is third line");
            fw.write("This is fourth line");
            fw.write("This is fifth line");

            fw.write("hello");

        } catch (Exception e) {

        } finally {
            fw.flush();
            fw.close();
        }
    }
}