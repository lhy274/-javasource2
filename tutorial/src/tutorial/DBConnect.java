package tutorial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBC��onnect {

	public static void main(String[] args) {
		
		Connection con=null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "javaDB";
			String password = "12345";
			con = DriverManager.getConnection(url, user, password);
			if(con!=null) {
				System.out.println("����Ǿ����ϴ�.");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
