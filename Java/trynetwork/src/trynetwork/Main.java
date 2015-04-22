package trynetwork;

import java.net.URL;
import java.net.URLConnection;

public class Main {
   public static void main(String[] argv) 
   throws Exception {
      URL u = new URL("http://www.tutorialspoint.com/javaexamples/net_filetime.htm");
      URLConnection uc = u.openConnection();
      uc.setUseCaches(false);
      long timestamp = uc.getLastModified();
      System.out.println("The last modification time of java.bmp is :"+timestamp);
   }
}
