package client;

import company.Chairman;

public class Client {//다른 패키의 상속받지 않은 클래스
	
	public static void main(String args[]){
		Chairman client = new Chairman("ABC123", 100, "Seoul");
		
		System.out.println(client.goodsCode);
		//System.out.println(client.totalStock); private 사용불가
		//System.out.println(client.stockNum); protected 사용불가
		//System.out.println(client.branch); 생략 사용불가
		
		System.out.println(client.getGoodsCode());
		//client.addStock(50); private 사용불가
		//client.subtractStock(30); protected 사용불가
		//System.out.println(client.getBranch()); 생략 사용불가
	}
}
