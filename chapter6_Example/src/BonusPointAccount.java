final class BonusPointAccount extends Account {
	int bonusPoint; // 누적 포인트
	int amount;
	BonusPointAccount(String accountNo, String ownerName, int balance,
			int bonusPoint) {
		super(accountNo, ownerName, balance);
		this.bonusPoint = bonusPoint;
	}

	void deposit(int amount) { // 예금한다
		super.deposit(amount);
		bonusPoint += (int) (amount * 0.001);
	}

	@Override
	void printState() {
		System.out.println("*********보너스 포인트의 계좌의 현황입니다.***********");
		System.out.println("계좌번호 	 : "+ this.accountNo);
		System.out.println("계좌 주  	 : "+ this.ownerName);
		System.out.println("잔액     	 : "+ this.balance);
		System.out.println("보너스 포인트 : " +this.bonusPoint);
	}
}
