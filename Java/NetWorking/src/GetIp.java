import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIp {
	public static void main(String args[]) {

		InetAddress net = null;

		try {
			net = InetAddress.getByName("www.facebook.com");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(2);
		}
		System.out.println(net.getHostName() + "===" + net.getHostAddress());

		System.exit(0);

	}
}
