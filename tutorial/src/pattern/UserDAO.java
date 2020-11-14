package pattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import sun.security.mscapi.CKeyPairGenerator.RSA;

public class UserDAO {
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		Connection con = null;
		
		try {
			
			String url = "";
			String user = "";
			String password = "";
			DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;		
	}// 연결
	
	public static void close(Connection con) {
		try {
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void close(PreparedStatement pstmt) {
		try {
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}// 동적연결
	
	public static void close(ResultSet rs) {
		try {
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//받는
	
	
	// -----------static------------------------ 
	
	public List getList() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List list = new ArrayList();
		
		try {
		con = getConnection();
		String sql = "select * from userTBL";
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
		while (rs.next()) {
		UserVO user = new UserVO();
		user.setNo(rs.getInt(1));
		user.setUserName(rs.getString(2));
		user.setBirthYear(rs.getInt("birthYear"));
		user.setAddr(rs.getString("addr"));
		user.setMobile(rs.getString("mobile"));
		list.add(user);
		}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
			close(con);
		}
		return list;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
