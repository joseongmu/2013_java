package partner;

import company.Chairman;

public class Partner extends Chairman{//�ٸ� ��Ű���� ��ӹ��� Ŭ����
	
	public Partner(String goodsCode, int stockNum) {
		super(goodsCode, stockNum);
	}
	
	public static void main(String args[]){
		Partner partner = new Partner("ABC123", 100);
		
		System.out.println(partner.goodsCode);
		System.out.println(partner.stockNum);
		
		System.out.println(partner.getStockNum());
		//System.out.println(partner.totalStock); private�� ����� ���� �����մϴ�.
		
		//partner.addStock(50); ������ ������ �����մϴ�.
		//partner.subtractStock(30);
		System.out.println(partner.stockNum);
		
		//partner.subtractStock(130);
		System.out.println(partner.stockNum);
	}
}
