
 class CheckingAccount extends Account {
	 String cardNo;                                       
	    CheckingAccount(String accountNo, String ownerName, 
	                    int balance, String cardNo) {
	        super(accountNo, ownerName, balance);   
	        this.cardNo = cardNo;
	    }                                   
	    int pay(String cardNo, int amount) throws Exception {
	        if (!cardNo.equals(this.cardNo) || (balance < amount))
	            throw new Exception("������ �Ұ����մϴ�.");
	        return withdraw(amount);
	    }
		@Override
		void printState() {
				System.out.println("*********Checking Account �� ���� ��Ȳ�Դϴ�.***********");
				System.out.println("���¹�ȣ  : "+ this.accountNo);
				System.out.println("���� ��   : "+ this.ownerName);
				System.out.println("�ܾ�      : "+ this.balance);
				System.out.println("ī�� ��ȣ : " +this.cardNo);
			}			
		}
	

