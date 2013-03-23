package partner;

import company.Chairman;

public class Partner extends Chairman{//다른 패키지의 상속받은 클래스
	
	public Partner(String goodsCode, int stockNum, String branch) {
		super(goodsCode, stockNum, branch);
	}
	
	public static void main(String args[]){
		Partner partner = new Partner("ABC123", 100, "Seoul");
		
		System.out.println(partner.goodsCode);
		//System.out.println(partner.totalStock); private 사용불가
		System.out.println(partner.stockNum);
		//System.out.println(partner.branch); 생략 사용불가
		
		System.out.println(partner.getGoodsCode());
		//partner.addStock(50); private 사용불가
		partner.subtractStock(30);
		//System.out.println(partner.getBranch()); 생략 사용불가
	}
}
