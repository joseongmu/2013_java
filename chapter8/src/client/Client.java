package client;

import company.Chairman;

public class Client {
	
	public static void main(String args[]){//�ٸ� ��Ű�� ��ӹ��� ���� Ŭ����
		Chairman client = new Chairman("ABC123", 100);
		
		System.out.println(client.goodsCode);
		//System.out.println(client.stockNum); protected�� ����� ���� �����մϴ�.
		
		System.out.println(client.getStockNum());
		//System.out.println(client.totalStock); private�� ����� ���� �����մϴ�.
		
		//client.addStock(50);  �����ڰ� ���� ���� �����մϴ�.
		//client.subtractStock(30);
		//System.out.println(client.stockNum);
		
		//client.subtractStock(130);
		//System.out.println(client.stockNum);
	}
}
