package InputFiles;

import java.io.*;


class FileAppending 
{
    public static void main(String args[]) {

        try{

            FileWriter fstream = new FileWriter("C:/Users/User/Desktop/S.txt",true);
            BufferedWriter fbw = new BufferedWriter(fstream);
            fbw.write("C:/Users/User/Desktop/S.txt");
            fbw.newLine();
            fbw.close();
        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
