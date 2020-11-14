package member.service;

import java.sql.Connection;
import java.util.List;

import member.domain.MemberVO;
import member.persistence.MemberDAO;
import static member.persistence.JDBCUtil.*;


public class MemberListService {
	//DAO 의 memberList() 호출해서 ListAction으로 넘기기
	// return dao.memberList(); 이렇게 하면됨.
	public List<MemberVO> getList() {
		Connection con = getConnection();
		MemberDAO dao = new MemberDAO(con);
		List<MemberVO> list = dao.memberList();
		
		close(con);
		
		return list;
	
	}
	
}

//	public List<MemberVO> getList() {
//		
//		Connection con = getConnection;
//		MemberDAO dao = MemberDAO(con);
//		
//		List<MemberVO> list = new List<MemberVO>();
//		
//		return list;