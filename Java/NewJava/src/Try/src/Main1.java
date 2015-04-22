

import java.net.InetAddress;

public class Main1 {
  public static void main(String[] argv) throws Exception {

    InetAddress addr = InetAddress.getByName("31.13.79.49");
    System.out.println("Host name is: "+addr.getHostName());
    System.out.println("Ip address is: "+ addr.getHostAddress());
  }
}
