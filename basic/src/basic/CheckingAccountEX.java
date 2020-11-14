package basic;

public class CheckingAccountEX {

	public static void main(String[] args) {
		// CheckingAccountEX 객체 생성 후 메소드 테스트

		
		//됨
//		CheckingAccount ca = new CheckingAccount("100-10-100", "abc", 1000000, "123-456");
//		
//		try {
//			System.out.println(ca.pay("123-456", 10000));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		// CheckingAccountEX 객체 생성 후 메소드 테스트
		CheckingAccount check = new CheckingAccount("110-10-0111","홍길동", 1000000, "222-222-22");
		
		//예금한다
		check.deposit(150000);
		//출금한다
		try {
			System.out.println("현재잔액 : "+check.withdraw(400000));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 직불카드 사용액을 지불한다.
		try {
			System.out.println("직불카드 사용 후 잔액 : "+check.pay("222-222-22", 500000));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
