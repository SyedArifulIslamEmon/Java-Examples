import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class aa {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = null;
		conn = DriverManager.getConnection("jdbc:mysql://hostname:port/dbname","username", "password");
		conn.close();
		
		
		
	}

}
