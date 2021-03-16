package ui;

import java.util.Scanner;

import action.Action;
import action.UserAddAction;

public class UserMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Action action = new Action();
		
		System.out.println("원하는 걸 누르세요");
		System.out.println("1.조회");
		System.out.println("1.조회");
		System.out.println("1.조회");
		String sc = .nextInt();
		
		switch (sc!=null) {
		case 1:
			
			break;
		case 2:
			action = new UserAddAction();
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			
			break;

		default:
			break;
		}
		action.controll(action, sc);
		
		
		
	}

}
