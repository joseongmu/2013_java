package Account;

class Account {
	String accountNumber; // ���¹�ȣ
	String name; // �̸�
	int balance; // �ܾ�

	Account(String accountNumber, String name, int balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	void deposit(int money) { // ����
		balance += money;
	}

	void withdraw(int money) throws Exception { // ����
		if (balance < money) {
			throw new Exception("\n**********�ܾ��� �����մϴ�.**********\n");
		}
		balance -= money;
	}

	void printAccount() {
		System.out.println("-----------���� ����-----------");
		System.out.println("���¹�ȣ : " + this.accountNumber);
		System.out.println("�̸� : " + this.name);
		System.out.println("�ܾ� : " + this.balance);
		System.out.println("----------------------------------");
	}
}
