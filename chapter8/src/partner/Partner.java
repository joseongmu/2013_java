package partner;

import company.Chairman;

public class Partner extends Chairman{//다른 패키지의 상속받은 클래스
	
	public Partner(String goodsCode, int stockNum) {
		super(goodsCode, stockNum);
	}
	
	public static void main(String args[]){
		Partner partner = new Partner("ABC123", 100);
		
		System.out.println(partner.goodsCode);
		System.out.println(partner.stockNum);
		
		System.out.println(partner.getStockNum());
		//System.out.println(partner.totalStock); private로 선언된 것은 사용못합니다.
		
		//partner.addStock(50); 변경자 생략시 사용못합니다.
		//partner.subtractStock(30);
		System.out.println(partner.stockNum);
		
		//partner.subtractStock(130);
		System.out.println(partner.stockNum);
	}
}
