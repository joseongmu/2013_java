package company;

public class Ceo extends Chairman {//���� ��Ű���� ����� ���� Ŭ����

	public Ceo(String goodsCode, int stockNum) {
		super(goodsCode, stockNum);
	}
	
	public static void main(String args[]){
		Ceo ceo = new Ceo("ABC123", 100);
		
		System.out.println(ceo.goodsCode);
		
		System.out.println(ceo.stockNum);
		System.out.println(ceo.getStockNum());
		//System.out.println(ceo.totalStock); private�� ����� ���� �����մϴ�.
		
		ceo.addStock(50);
		ceo.subtractStock(30);
		System.out.println(ceo.stockNum);
		
		ceo.subtractStock(130);
		System.out.println(ceo.stockNum);
	}
}
