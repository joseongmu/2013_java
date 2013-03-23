package company;

public class Ceo extends Chairman {//같은 패키지에 상속을 받은 클래스

	public Ceo(String goodsCode, int stockNum, String branch) {
		super(goodsCode, stockNum, branch);
	}
	
	public static void main(String args[]){
		Ceo ceo = new Ceo("ABC123", 100, "Seoul");
		
		System.out.println(ceo.goodsCode);
		//System.out.println(ceo.totalStock); private 사용불가
		System.out.println(ceo.stockNum);
		System.out.println(ceo.branch);
		
		System.out.println(ceo.getGoodsCode());
		//ceo.addStock(50); private 사용불가
		ceo.subtractStock(30);
		System.out.println(ceo.getBranch());
	}
}
