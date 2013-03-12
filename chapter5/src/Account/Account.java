package Account;

class Account {
	String accountNumber; // 계좌번호
	String name; // 이름
	int balance; // 잔액

	Account(String accountNumber, String name, int balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	void deposit(int money) { // 예금
		balance += money;
	}

	void withdraw(int money) throws Exception { // 인출
		if (balance < money) {
			throw new Exception("\n**********잔액이 부족합니다.**********\n");
		}
		balance -= money;
	}

	void printAccount() {
		System.out.println("-----------계좌 정보-----------");
		System.out.println("계좌번호 : " + this.accountNumber);
		System.out.println("이름 : " + this.name);
		System.out.println("잔액 : " + this.balance);
		System.out.println("----------------------------------");
	}
}
