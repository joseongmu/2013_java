public class AccountDriver {
	public static void main(String args[]) {
		
		
		try {
			CreditLineAccount account1 = new CreditLineAccount("000-11-111111", "±è¼±´Þ",
					10000, 20000000);
			account1.withdraw(500000);
			account1.printState();


		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		BonusPointAccount account2 = new BonusPointAccount("333-33-333333",
				"±è¹Ì¿µ", 0, 0);
		account2.deposit(1000000);
		account2.printState();
		CheckingAccount account3 = new CheckingAccount("111-11-111111", "¹Ú¼¼Áø", 
	                    3800000, "123456");
		account3.printState();
		account3.deposit(300000);
		account3.printState();
		
	}


}
