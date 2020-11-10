package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBInsert {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pstmt=null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url ="jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "javaDB";
			String password = "12345";

			con = DriverManager.getConnection(url, user, password);
			if(con!=null)  {
				String sql = "insert into userTBL values " + "(userTBL_seq.nextval, '��¿�',1996,'����',"+"'010-1569-4869')";
				
				pstmt = con.prepareStatement(sql);
				//insert,update,delete ������ executeUpdate() ���� �ؾ���
				int result = pstmt.executeUpdate();
				
				if(result>0) {
					System.out.println("�Է� ����");
				} else {
					System.out.println("�Է� ����");
				}
			
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
