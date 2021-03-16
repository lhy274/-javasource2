package ui;

import java.util.List;
import java.util.Scanner;

import action.Action;
import action.UserAddAction;
import action.UserRemoveAction;
import action.UserRowAction;
import action.UserUpdateAction;
import action.UserListAction;
import controller.UserController;

public class UserMain {
	public static void main(String[] args) {
		boolean isStop = false;
		Scanner sc = new Scanner(System.in);
		UserController UserController = new UserController();
		do {

			System.out.println("==== 사용자 메뉴 ====");
			System.out.println("1. 전체 조회");
			System.out.println("2. 삽입");
			System.out.println("3. 삭제");
			System.out.println("4. 수정");
			System.out.println("5. 개별 조회");
			System.out.println("6. 프로그램 종료");
			System.out.println("===================");

			System.out.println("번호 입력 : ");
			int menu = sc.nextInt();

			Action action = null;

			switch (menu) {
			case 1:
				action = new UserListAction();

				break;
			case 2:
				action = new UserAddAction();
				break;
			case 3:
				action = new UserRemoveAction();
				break;
			case 4:
				action = new UserUpdateAction();
				break;
			case 5:
				action = new UserRowAction();
				break;
			case 6:
				System.out.println("프로그램 종료");
				isStop = false; // 반복문 종료 // isStop = true에서서 false로 바꿈.
				break;
			default:
				break;
			}
			if (action != null) {
				UserController.processRequest(action, sc);
			}

		} while (isStop);

	}
}
