package action;

import java.util.Scanner;

import service.UserRemoveService;
import ui.ConsoleUtil;

public class UserRemoveAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		// 삭제할 사용자의 번호를 입력받기
		ConsoleUtil console = new ConsoleUtil();
		int no = console.printUserRow(sc);
		// 입력받은 번호를 Service 넘기기
		UserRemoveService service = new UserRemoveService();
		// db 처리 결과에 따라 메서지 출력
		if(service.userRemove(no)) {
			console.printRemoveSuccessMessage();
		}else {
			console.printRemoveFailMessage();
		}
	}

}
