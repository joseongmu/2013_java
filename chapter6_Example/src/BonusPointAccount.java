final class BonusPointAccount extends Account {
	int bonusPoint; // ���� ����Ʈ
	int amount;
	BonusPointAccount(String accountNo, String ownerName, int balance,
			int bonusPoint) {
		super(accountNo, ownerName, balance);
		this.bonusPoint = bonusPoint;
	}

	void deposit(int amount) { // �����Ѵ�
		super.deposit(amount);
		bonusPoint += (int) (amount * 0.001);
	}

	@Override
	void printState() {
		System.out.println("*********���ʽ� ����Ʈ�� ������ ��Ȳ�Դϴ�.***********");
		System.out.println("���¹�ȣ 	 : "+ this.accountNo);
		System.out.println("���� ��  	 : "+ this.ownerName);
		System.out.println("�ܾ�     	 : "+ this.balance);
		System.out.println("���ʽ� ����Ʈ : " +this.bonusPoint);
	}
}
