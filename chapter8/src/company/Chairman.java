package company;
/*
 * 클래스가 속한 패키지의 위치 
 * 접근제어 KeyWord에 따른 메소드와 변수의 접근 권한을 알아보기 위한 예제입니다.
 */
public class Chairman {
	
	public String goodsCode;
	private int totalStock;
	protected int stockNum;
	String branch;
	
	public Chairman(String goodsCode, int stockNum, String branch) {
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
		this.totalStock = stockNum;
		this.branch = branch;
	}
	
	public String getGoodsCode(){
		return this.goodsCode;
	}
	
	private void addStock(int amount) {
		this.stockNum += amount;
		this.totalStock += amount;
	}
	
	protected int subtractStock (int amount) {
		if (this.stockNum < amount) {
			System.out.println("재고가 부족합니다.");
		} else{
			this.stockNum -= amount;
		}
		
		return amount;
	}
	
	String getBranch() {
		return this.branch;
	}
	
	public static void main(String args[]){
		Chairman chairman = new Chairman("ABC123", 100, "Seoul");
		
		System.out.println(chairman.goodsCode);
		System.out.println(chairman.totalStock);
		System.out.println(chairman.stockNum);
		System.out.println(chairman.branch);
		
		System.out.println(chairman.getGoodsCode());
		chairman.addStock(50);
		chairman.subtractStock(30);
		System.out.println(chairman.getBranch());
	}
}
