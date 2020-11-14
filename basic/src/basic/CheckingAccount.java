package basic;

public class CheckingAccount extends Account {
	// CheckingAccount
	// 속성 : 계좌번호, 예금주, 잔액, 직불카드 번호
	private String cardNo;
	
	// 기능 : 예금, 출금, 직불카드 사용액 지불
	
	public CheckingAccount(String accountNo, String owner, int balance, String cardNo) {
		super(accountNo, owner, balance);
		this.cardNo = cardNo;
	}
	
//	int pay(String cardNo, int amount) throws Exception {
//		//카드번호와 잔액을 확인한 후 사용액을 지불
//		
//		if(accountNo = cardNo && balance > amount)  {
//			
//			return balance -= amount;
//		} else {
//			throw new Exception("잔액이 부족합니다");
//		}
//		
////	}
//	int pay(String cardNo, int amount) throws Exception {
//		//카드번호와 잔액을 확인한 후 사용액을 지불
//		
//		if(this.balance() > cardNo)  {
//			
//			return balance();
//		} else {
//			throw new Exception("잔액이 부족합니다");
//		}
//		
//	}
	
	int pay(String cardNo, int amount) throws Exception  {
		//카드번호와 잔액을 확인한 후 사용액을 지불
		if(!this.cardNo.equals(cardNo) || getBalance() < amount) {
			throw new Exception("카드 번호 또는 잔액을 화인해 주세요.");
		}
		// 잔액 = 사용액 = 잔액리턴
		return withdraw(amount);
	}
	
	
	
	
	
}
