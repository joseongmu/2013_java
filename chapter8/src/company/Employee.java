package company;

public class Employee {//같은 패키지의 상속을 받지 않은 클래스
	
	public static void main(String args[]){
		Chairman employee = new Chairman("ABC123", 100, "Seoul");
		
		System.out.println(employee.goodsCode);
		//System.out.println(employee.totalStock); private 사용 불가
		System.out.println(employee.stockNum);
		System.out.println(employee.branch);
		
		System.out.println(employee.getGoodsCode());
		//employee.addStock(50); private 사용 불가
		employee.subtractStock(30);
		System.out.println(employee.getBranch());
	}
}
