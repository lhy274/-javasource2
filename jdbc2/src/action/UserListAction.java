package action;

import java.util.List;
import java.util.Scanner;

import domain.UserVO;
import service.UserListService;
import ui.ConsoleUtil;


public class UserListAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		// userListService 의 getUserList() 호출해서 결과 전송 받기
		UserListService service = new UserListService();
		List<UserVO> userList = service.getUserList();
		
		//받은 결과를 Con
		ConsoleUtil console = new ConsoleUtil();
		console.printUserList(userList);
		
		
	}

}
