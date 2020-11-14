package member.action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import member.domain.MemberVO;
import member.service.MemberAddServicer;
import member.ui.MemberConsoleUtil;

public class MemberAddAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		// 사용자로부터 입력받기 - MemberConsoleUtil 의 getAddMember()
		MemberConsoleUtil console = new MemberConsoleUtil();
		MemberVO vo = console.getAddrMember(sc);

		// 입력받은 객체를 Service로 넘겨서 DB처리를 한 후 결과를 전송받아
		MemberAddServicer service = new MemberAddServicer();
		if (service.addMember(vo)) {
			// 성공한 경우 메시지 출력 - MemberConsoleUtil 의 printAddSuccessMessage()
			console.printAddSuccessMessage(vo.getName());
		}

	}

}
