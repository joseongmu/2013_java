package company;

public class Employee {
	
	public static void main(String args[]){//���� ��Ű���� ����� ���� ���� Ŭ����
		Chairman employee = new Chairman("ABC123", 100);
		
		System.out.println(employee.goodsCode);
		System.out.println(employee.stockNum);
		
		System.out.println(employee.getStockNum());
		//System.out.println(employee.totalStock); private�� ����� ���� �����մϴ�.
		
		employee.addStock(50);
		employee.subtractStock(30);
		System.out.println(employee.stockNum);
		employee.subtractStock(130);
		
		System.out.println(employee.stockNum);
	}
}
