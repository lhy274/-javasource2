package member.service;

import java.sql.Connection;

import member.domain.MemberVO;
import member.persistence.JDBCUtil;
import member.persistence.MemberDAO;

public class MemberUpdateService {
	//memberUpdate(MemberVO updateMember) 를 호출하여 작업 결과를
	// 돌려받기
	public boolean update(MemberVO updateMember) {
		//MemberDAO 객체 생성하기
		Connection con = JDBCUtil.getConnection();
		MemberDAO dao = new MemberDAO(con);
		
		
		//DAO의 memberUpdate 호출 => 1(성공), 0(실패)
		int result = dao.memberUpdate(updateMember);
		
		//DB작업괄과를 담은 변수 선언
		boolean updateFlag = false;
		
		if(result>0) {
			//커밋
			JDBCUtil.commit(con);
			//리턴 값 true 변경
			updateFlag = true;
		} else {
			//롤백
			JDBCUtil.rollback(con);
		}
		return updateFlag;
	}
}
