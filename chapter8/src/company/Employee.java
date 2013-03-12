package company;

public class Employee {
	
	public static void main(String args[]){//같은 패키지의 상속을 받지 않은 클래스
		Chairman employee = new Chairman("ABC123", 100);
		
		System.out.println(employee.goodsCode);
		System.out.println(employee.stockNum);
		
		System.out.println(employee.getStockNum());
		//System.out.println(employee.totalStock); private로 선언된 것은 사용못합니다.
		
		employee.addStock(50);
		employee.subtractStock(30);
		System.out.println(employee.stockNum);
		employee.subtractStock(130);
		
		System.out.println(employee.stockNum);
	}
}
