package member.service;

import java.sql.Connection;

import member.persistence.MemberDAO;

import static member.persistence.JDBCUtil.*;

public class MemberRemoveService {
	//DAO MemberRemove(int id)를 싱행한 후
	// 결과를 돌려받기
	//돌려받은 id를 Action에 넘기기
	public boolean member_Remove(int id) {
		Connection con = getConnection();
		MemberDAO dao = new MemberDAO(con);
		
		int result = dao.memberRemove(id);
		boolean isRemoveSuccess=false;
		if (result>0){
			commit(con);
			isRemoveSuccess=true;
		} else {
			rollback(con);
		}
		close(con);
		return isRemoveSuccess;
	}
	
	
	
}






//public boolean MemberRemoveService(int id) {
//	Connection con = getConnection();
//	MemberDAO dao = new MemberDAO(con);
//	
//	if(dao.memberRemove(id)) {
//		commit(con);
//		return true;
//	} else {
//		rollback(con);
//	}
//	
//}