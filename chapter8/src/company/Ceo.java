package company;

public class Ceo extends Chairman {//같은 패키지에 상속을 받은 클래스

	public Ceo(String goodsCode, int stockNum) {
		super(goodsCode, stockNum);
	}
	
	public static void main(String args[]){
		Ceo ceo = new Ceo("ABC123", 100);
		
		System.out.println(ceo.goodsCode);
		
		System.out.println(ceo.stockNum);
		System.out.println(ceo.getStockNum());
		//System.out.println(ceo.totalStock); private로 선언된 것은 사용못합니다.
		
		ceo.addStock(50);
		ceo.subtractStock(30);
		System.out.println(ceo.stockNum);
		
		ceo.subtractStock(130);
		System.out.println(ceo.stockNum);
	}
}
