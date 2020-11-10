package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBSelect {

	public static void main(String[] args) {
		Connection con=null;
		//sql �� ���� 
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url ="jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "javaDB";
			String password = "12345";
			
			con = DriverManager.getConnection(url, user, password);
			if(con!=null) {
				String sql = "select * from userTBL";
				
				pstmt = con.prepareStatement(sql);
				//���۵� sql�� ���� �� ��� ���
				rs=pstmt.executeQuery();
				while(rs.next()) {
					System.out.println(rs.getInt(1)+"\t");
					System.out.println(rs.getString(2)+"\t");
					System.out.println(rs.getInt(3)+"\t");
					System.out.println(rs.getString(4)+"\t");
					System.out.println(rs.getString(5)+"\t");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
