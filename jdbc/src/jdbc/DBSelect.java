package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBSelect {

	public static void main(String[] args) {
		Connection con=null;
		//sql 문 전송 
		PreparedStatement pstmt=null;
		//sql 문 결과
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
				//전송된 sql문 실행 후 결과 담기
				rs=pstmt.executeQuery();
				while(rs.next()) {
					System.out.print(rs.getInt(1)+"\t");
					System.out.print(rs.getString(2)+"\t");
					System.out.print(rs.getInt(3)+"\t");
					System.out.print(rs.getString(4)+"\t");
					System.out.print(rs.getString(5)+"\n");
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
