package member.action;

import java.util.Scanner;

import member.domain.MemberVO;
import member.service.MemberUpdateService;
import member.ui.MemberConsoleUtil;

public class MemberUpdateAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		MemberConsoleUtil util = new MemberConsoleUtil();
		MemberVO updateMember = util.printUpdateMessage(sc);
		
		
		//사용자한테 수정할 정보 받기
		
		//입력받은 정보를 MemberVo
		
		//MemberUpdateService 객체 생성 후 메소드 호출
		MemberUpdateService service = new MemberUpdateService();
		//boolean update(MemberVO updateMember)
		service.update(updateMember);
		//boolean update(MemberVO updateMember)
		boolean updateFlag = service.update(updateMember);
		
		//수정 결과 출력하기
		util.printUpdateSuccessFail(updateFlag);
	}
	
}
