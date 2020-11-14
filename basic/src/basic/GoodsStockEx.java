package basic;

public class GoodsStockEx {

	public static void main(String[] args) {
		// GoodsStock 5 개 생성하기
		GoodsStock goods1 = new GoodsStock("s1506", 10);
		GoodsStock goods2 = new GoodsStock("s1507", 20);
		GoodsStock goods3 = new GoodsStock("s1508", 30);
		GoodsStock goods4 = new GoodsStock("s1509", 40);
		GoodsStock goods5 = new GoodsStock("s1510", 50);
	
		
		// 재고수량 증가, 감소 실행시키기
		goods1.addStock(20);
		System.out.println("현재 재고 수량 : "+goods1.subtractStock(5));
		
		
		//
		goods2.addStock(10);
		System.out.println("현재 재고 수량 : "+goods2.subtractStock(10));
	}

}
