package member.service;

import member.domain.MemberVO;
import member.persistence.MemberDAO;

import static member.persistence.JDBCUtil.*;

import java.sql.Connection;

public class MemberAddServicer {
	public boolean addMember(MemberVO vo) {
		boolean isAddSuccess = false;
		
		//member를 입력하는 DAO를 호출하여 DB작업하기
		//작업 완료 후 결과를 Action 에 리턴 
		Connection con = getConnection();
		MemberDAO dao = new MemberDAO(con);
		
		int addResult = dao.memberInsert(vo);
		
		if(addResult>0) {
			isAddSuccess=true;
			commit(con);
		}else {
			rollback(con);
		}
			
		close(con);
		
		return isAddSuccess;
	}
}
