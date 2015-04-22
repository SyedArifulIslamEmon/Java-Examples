package fl;
import java.io.*;
class FileAppending 
{
    public static void main(String args[]) {

        try{
        
            OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("C:/Users/User/Desktop/S.txt", true), "UTF-8");
            BufferedWriter fbw = new BufferedWriter(writer);
            fbw.write("C:/Users/User/Desktop/S.txt");
            fbw.newLine();
            fbw.close();
        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
