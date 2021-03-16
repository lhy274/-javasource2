package member.ui;

import java.util.List;
import java.util.Scanner;

import member.domain.MemberVO;

public class MemberConsoleUtil {
	public MemberVO getAddrMember(Scanner sc) {
		
		System.out.println("등록할 회원 정보를 입력하세요");
		System.out.println("이름 : ");
		String name = sc.next();
		sc.nextLine();
		System.out.println("주소 : ");
		String addr = sc.nextLine();
		System.out.println("이메일 : ");
		String email = sc.next();
		System.out.println("국가 : ");
		String nation = sc.next();
		System.out.println("나이 : ");
		int age = sc.nextInt();
		return new MemberVO(name, addr, nation, email, age);
	}
	
	public void printAddSuccessMessage(String name) {
		System.out.println(name + "회원 정보 추가 성공");
	}// getAddrMember end
	
	//전체  member 출력하기
	public void printMemberList(List<MemberVO> list) {
		System.out.println("\n");
		System.out.println("******* 전체 조회 ********");
		System.out.println("아이디 \t이름 \t주소 \t국가 \t이메일 \t나이");
		for(MemberVO vo:list) {
			System.out.print(vo.getId()+"\t");
			System.out.print(vo.getName()+"\t");
			System.out.print(vo.getAddr()+"\t");
			System.out.print(vo.getNation()+"\t");
			System.out.print(vo.getEmail()+"\t");
			System.out.print(vo.getAge()+"\t");
			System.out.println();
		}
	}
	
	//삭제할 회원 아이디를 입력하세요 메시지를 보여주는 메소드 작성
	// 사용자로부터 아이들 입력받아 리턴
	public int printRemoveMessage(Scanner sc) {
		System.out.println("삭제할 회원 아이디를 입력하세요");
		int id = sc.nextInt();
		return id;
	}
	
	public void printRemoveSuccessMessage() {
		System.out.println("회원 정보 삭제 성공");
	}// getAddrMember end
	
	public void printRemoveFailMessage() {
		System.out.println("회원 정보 삭제 실패");
	}// getAddrMember end
	
	//수정할 정보를  입력받는 화면 메소드
	public MemberVO printUpdateMessage(Scanner sc) {
		//
		System.out.println("*** Member정보수정 ****");
		System.out.println("아이디 입력 : ");
		int id = sc.nextInt();
		System.out.println("주소입력 : ");
		String addr = sc.next();
		System.out.println("이메일 입력 : ");
		String email = sc.next();
		
		//
		MemberVO updateMember = new MemberVO();
		updateMember.setId(id);
		updateMember.setAddr(addr);
		updateMember.setEmail(email);
		
		return updateMember;
	}
	
	// 수정결과 출력하기
	public void printUpdateSuccessFail(boolean updateFlag) {
		System.out.println(updateFlag?"수정성공":"수정실해");
	}
}
















//	//삭제할 회원 아이디를 입력하세요 메시지를 보여주는 메소드 작성
//	// 사용자로부터 아이들 입력받아 리턴
//	public int printMemberRemove(Scanner sc) {
//		int no = sc.nextInt();
//		System.out.println("삭제할 회원 아이디를 입력하세요");
//		return no;
//	}