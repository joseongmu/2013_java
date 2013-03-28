package kr.ac.mju.dislab.java.account;

public class Account {
	private String accountNumber; // 계좌번호
	private String name; // 이름
	private int balance; // 잔액
	
	public String getAccountNumber() {return accountNumber;}
	public void setAccountNumber(String accountNumber) {this.accountNumber = accountNumber;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getBalance() {return balance;}
	public void setBalance(int balance) {this.balance = balance;}

	public Account(String accountNumber, String name, int balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	public boolean deposit(int money){ // 예금
		if (0 > money){
			return false;
		} 
		balance += money;
		return true;
	}

	public boolean withdraw(int money){ // 인출
		if (balance < money) {
			return false;
		} else if(money < 0){
			return false;
		}
		balance -= money;
		return true;
	}

	public void printAccount() {
		System.out.println("-----------계좌 정보-----------");
		System.out.println("계좌번호 : " + this.accountNumber);
		System.out.println("이름 : " + this.name);
		System.out.println("잔액 : " + this.balance);
		System.out.println("----------------------------------");
	}
}
