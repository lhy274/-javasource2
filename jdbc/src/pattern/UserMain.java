package pattern;

import java.util.List;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		System.out.println("==== UserTBL ====");
		System.out.println("1. ��ȸ");
		System.out.println("2. ����");
		System.out.println("3. ����");
		System.out.println("4. ����");
		System.out.println("===================");
		
		System.out.println("��ȣ �Է� : ");
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		
		UserDAO dao = new UserDAO();
		
		switch(menu) {
		case 1:
			System.out.println("userTBL ��ü ���");
			List<UserVO> list=dao.getList();
			for(UserVO vo:list) {
				System.out.println(vo);
			}
			break;
		case 2:
			UserVO vo = new UserVO();
			System.out.println("�߰��� ȸ������ �Է� ");
			System.out.print("�Է��� ȸ�� �̸� �Է� : ");
			vo.setUserName(sc.next());
			System.out.println("�Է��� ȸ�� ���� �Է� : ");
			vo.setBirthYear(sc.nextInt());
			System.out.println("�Է��� ȸ�� �ּ� �Է� : ");
			vo.setAddr(sc.next());
			System.out.println("�Է��� ȸ�� ��ȭ��ȣ �Է� : ");
			vo.setMobile(sc.next());
			System.out.println(dao.insertUser(vo)?"�Է¼���":"�Է½���");
			break;
		case 3:
			System.out.println("������ ȸ����ȣ �Է� : ");
			int no = sc.nextInt();//3�� �Է���
			boolean flag =dao.deleteUser(no);
			System.out.println(flag?"��������":"��������");
			break;
		case 4:
			System.out.println("������ ȸ�� ���� �Է�");
			System.out.print("������ ȸ����ȣ �Է� : ");
			no = sc.nextInt();
			System.out.println("������ �ּ� �Է� : ");
			String addr = sc.next();
			flag = dao.updateUser(addr, no);
			System.out.println(flag?"��������":"��������");
			break;
		}
	}

}
