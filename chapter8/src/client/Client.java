package client;

import company.Chairman;

public class Client {
	
	public static void main(String args[]){//다른 패키의 상속받지 않은 클래스
		Chairman client = new Chairman("ABC123", 100);
		
		System.out.println(client.goodsCode);
		//System.out.println(client.stockNum); protected로 선언된 것은 사용못합니다.
		
		System.out.println(client.getStockNum());
		//System.out.println(client.totalStock); private로 선언된 것은 사용못합니다.
		
		//client.addStock(50);  변경자가 없는 것을 사용못합니다.
		//client.subtractStock(30);
		//System.out.println(client.stockNum);
		
		//client.subtractStock(130);
		//System.out.println(client.stockNum);
	}
}
