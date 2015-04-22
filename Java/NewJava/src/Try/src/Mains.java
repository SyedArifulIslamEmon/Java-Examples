
import java.net.InetAddress;
import java.net.URL;

public class Mains {
   public static void main(String[] args) 
   throws Exception {
      URL url = new URL("http://www.server.com");
      System.out.println("URL is " + url.toString());
      System.out.println("protocol is " 
      + url.getProtocol());
      System.out.println("file name is " + url.getFile());
      System.out.println("host is " + url.getHost());
     InetAddress add=InetAddress.getByName(url.getHost());
		System.out.println(add.getHostName()+"="+add.getHostAddress());
      
      System.out.println("path is " + url.getPath());
      System.out.println("port is " + url.getPort());
      System.out.println("default port is " 
      + url.getDefaultPort());
   }
}
