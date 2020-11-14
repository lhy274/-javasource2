package basic;

public class GoodsStock {
	//속성 - 상품코드(g1536), 재고수량(숫자)
	//기능 - 재고를 추가한다, 재고를 감소한다.
	
	private String goodsCode;
	private int stockNum;
	
	
	
	
	public GoodsStock(String goodsCode, int stockNum) {
		super();
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
	}

	//기능 - 재고를 추가한다, 재고를 감소한다.
	public void addStock(int amuount) {
		stockNum += amuount;
	}
	public int subtractStock(int amuount) {
		return stockNum-=amuount;
	}
	
	
}
