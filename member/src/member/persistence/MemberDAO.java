package member.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import member.domain.MemberVO;

import static member.persistence.JDBCUtil.*;

public class MemberDAO {
	Connection con;

	public MemberDAO(Connection con) {
		this.con = con;
	}

	// CRUD 작업 메소드 구현
	// 삽입
	public int memberInsert(MemberVO insertMember) {
		// insert into member values(member_seq.nextval,'홍길동',
		// '서울시 강남구','미국','hong132@naver.com',20);
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			String sql = "insert into member values(member_seq.nextval,?,?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, insertMember.getName());
			pstmt.setString(2, insertMember.getAddr());
			pstmt.setString(3, insertMember.getNation());
			pstmt.setString(4, insertMember.getEmail());
			pstmt.setInt(5, insertMember.getAge());

			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;

	}

	// 조회
	public List<MemberVO> memberList() {

		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<MemberVO> list = new ArrayList<MemberVO>();
		try {

			String sql = "select * from member";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String addr = rs.getString("addr");
				String nation = rs.getString("nation");
				String email = rs.getString("email");
				int age = rs.getInt("age");
				list.add(new MemberVO(id, name, addr, nation, email, age));

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}
		return list;
	}

	// 수정
	public int memberUpdate(MemberVO updateMember) {
		// update member set addr='경기도 성남시', email = '~' where id=1
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			String sql = "update member set addr=?, email=?, where id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, updateMember.getAddr());
			pstmt.setString(2, updateMember.getEmail());
			pstmt.setInt(3, updateMember.getId());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}

	// 삭제
	public int memberRemove(int id) {

		PreparedStatement pstmt = null;

		boolean flag = false;
		int result = 0;
		try {
			String sql = "delete from member where id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		} // finally 종료
		return result;
	}

}
