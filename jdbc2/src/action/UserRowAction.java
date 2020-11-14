package action;

import java.util.Scanner;

import domain.UserVO;
import service.UserRowService;
import ui.ConsoleUtil;

public class UserRowAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		// 조회할 사용자의 번호를 입력받아 Service 객체에게 
		//넘겨주기
		ConsoleUtil console = new ConsoleUtil();
		int no = console.printUserRow(sc);
		
		UserRowService service = new UserRowService();
		UserVO user = service.getUserRow(no);
		
		// 조회 결과를 Console에 넘겨 화면 출력
		console.printUserDetail(user);
		
		
		

	}

}
