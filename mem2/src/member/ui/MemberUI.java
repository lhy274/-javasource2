package member.ui;

import java.util.Scanner;

import member.action.Action;
import member.action.MemberAddAction;
import member.action.MemberListAction;
import member.action.MemberRemoveAction;
import member.controller.MemberController;

public class MemberUI {
	public static void main(String[] args) {
		boolean isStop = false;
		Scanner sc = new Scanner(System.in);
		MemberController controller = new MemberController();

		do {
			System.out.println("***** 회원 관리 프로그램 *******");
			System.out.println("1. 회원등록");
			System.out.println("2. 회원목록 보기");
			System.out.println("3. 회원정보 수정");
			System.out.println("4. 회원정보 삭제");
			System.out.println("5. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();

			Action action = null;

			switch (menu) {
			case 1:
				action = new MemberAddAction();
				break;
			case 2:
				action = new MemberListAction();
				break;
			case 3:

				break;
			case 4:
				action = new MemberRemoveAction();
				break;
			case 5:

				break;

			default:
				break;
			}
			if (action != null) {
				controller.processRequest(action, sc);
			}
		} while (!isStop);

	}
}
