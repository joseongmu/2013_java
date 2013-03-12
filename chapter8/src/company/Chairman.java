package company;

public class Chairman { //��ǰ ��� Ŭ����
	public String goodsCode; //��ǰ�ڵ� �ʵ�
	private int totalStock; //���� ���
	protected int stockNum; //������ �ʵ�
	
	public Chairman(String goodsCode, int stockNum) { //������
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
		this.totalStock = stockNum;
	}
	
	void addStock(int amount) { //��� ���ϴ� �޼ҵ�
		this.stockNum += amount;
		this.totalStock += amount;
	}
	
	int subtractStock (int amount) { //��� ���� �޼ҵ�
		if (this.stockNum < amount) {
			System.out.println("��� �����մϴ�.");
		} else{
			this.stockNum -= amount;
		}
		
		return amount;
	}
	
	public int getStockNum() { //��� �����ϴ� �޼ҵ�
		return this.stockNum;
	}
	
	public static void main(String args[]){//�ڽ��� ������ �����ڿ� ������� ���� �����մϴ�.
		Chairman chairman = new Chairman("ABC123", 100);
		
		System.out.println(chairman.goodsCode);
		System.out.println(chairman.stockNum);
		
		System.out.println(chairman.getStockNum());
		System.out.println(chairman.totalStock);
		
		chairman.addStock(50);
		chairman.subtractStock(30);
		System.out.println(chairman.stockNum);
		
		chairman.subtractStock(130);
		System.out.println(chairman.stockNum);
	}
}
