package member.action;

import java.util.Scanner;

import member.service.MemberRemoveService;
import member.ui.MemberConsoleUtil;

public class MemberRemoveAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		// 삭제할 회원 아이디를 입력하세요 이런 메시지를 보여주는
		// 메소드를 호출 => ConsoleUtil 작성
		MemberConsoleUtil util = new MemberConsoleUtil();
		int id = util.printRemoveMessage(sc);
		
		// 리턴받은 아이디를 service에게 넘겨서 삭제한 결과 전송받기
		MemberRemoveService service = new MemberRemoveService();
		
		// 삭제결과에 따라 메시지(ConnsoleUtil) 출력하기
		if(service.member_Remove(id)) {
			util.printRemoveSuccessMessage();
		}else {
			util.printRemoveFailMessage();
		}
		
		
		
	}

}


//// 삭제할 회원 아이디를 입력하세요 이런 메시지를 보여주는
//// 메소드를 호출 => ConsoleUtil 작성
//MemberConsoleUtil service = new MemberConsoleUtil();
//int rm = service.printMemberRemove(sc);
//// 리턴받은 아이디를 service에게 넘겨서 삭제한 결과 전송받기
//= new 
//// 삭제결과에 따라 메시지(ConnsoleUtil) 출력하기