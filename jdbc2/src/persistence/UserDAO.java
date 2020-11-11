package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import static persistence.JDBCUtil.*;

import domain.UserVO;


public class UserDAO {
	Connection con;
	
	public UserDAO(Connection con) {
		super();
		this.con = con;
	}
	

	// ��ȸ �޼ҵ�
		public List<UserVO> getList() {
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			List<UserVO> list = new ArrayList<UserVO>();

			try {

				// select : ���� ���� ����� ���(ArrayList)�Ǵ� ������ �ƴϸ� �ϳ��� �ุ
				// ���(~VO)�Ǵ� �������� ���� ���� ��ü�� ����
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
		}// List<UserVO> getList() end

		// ���� �޼ҵ�
		public boolean deleteUser(int no) {
			PreparedStatement pstmt = null;
			boolean flag = false;
			try {
				// String sql = "delete from userTBL where no="+no;

				String sql = "delete from userTBL where no=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, no);
				int result = pstmt.executeUpdate();

				if (result > 0) { // ���������ϸ� Ʈ��, ���и� ���� ����
					flag = true;
				}

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				close(pstmt);
				close(con);
			}
			return flag;
		}

		// ���� �޼ҵ�
		public boolean updateUser(String addr, int no) {
			boolean flag = false;
			PreparedStatement pstmt = null;
			try {
				String sql = "update userTBL set addr=? where no=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, addr);
				pstmt.setInt(2, no);
				int result = pstmt.executeUpdate();
				if (result > 0) {
					flag = true;
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				close(pstmt);
				close(con);
			}

			return flag;
		}

		// ���� �޼ҵ�
		public boolean insertUser(UserVO vo) {
			PreparedStatement pstmt = null;
			boolean flag = false;

			try {
				String sql = "insert into userTBL values(userTBL_seq.nextval,?,?,?,?)";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, vo.getUserName());
				pstmt.setInt(2, vo.getBirthYear());
				pstmt.setString(3, vo.getAddr());
				pstmt.setString(4, vo.getMobile());
				
				int result = pstmt.executeUpdate();
				if (result > 0) {
					flag = true;
				}

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				close(pstmt);
				close(con);
			}
			return flag;
		}
}
