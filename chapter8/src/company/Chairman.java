package company;

public class Chairman { //상품 재고 클래스
	public String goodsCode; //상품코드 필드
	private int totalStock; //누적 재고량
	protected int stockNum; //재고수량 필드
	
	public Chairman(String goodsCode, int stockNum) { //생성자
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
		this.totalStock = stockNum;
	}
	
	void addStock(int amount) { //재고를 더하는 메소드
		this.stockNum += amount;
		this.totalStock += amount;
	}
	
	int subtractStock (int amount) { //재고를 빼는 메소드
		if (this.stockNum < amount) {
			System.out.println("재고가 부족합니다.");
		} else{
			this.stockNum -= amount;
		}
		
		return amount;
	}
	
	public int getStockNum() { //재고를 리턴하는 메소드
		return this.stockNum;
	}
	
	public static void main(String args[]){//자신의 정보는 변경자에 상관없이 접근 가능합니다.
		Chairman chairman = new Chairman("ABC123", 100);
		
		System.out.println(chairman.goodsCode);
		System.out.println(chairman.stockNum);
		
		System.out.println(chairman.getStockNum());
		System.out.println(chairman.totalStock);
		
		chairman.addStock(50);
		chairman.subtractStock(30);
		System.out.println(chairman.stockNum);
		
		chairman.subtractStock(130);
		System.out.println(chairman.stockNum);
	}
}
