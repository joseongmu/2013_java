
 class CheckingAccount extends Account {
	 String cardNo;                                       
	    CheckingAccount(String accountNo, String ownerName, 
	                    int balance, String cardNo) {
	        super(accountNo, ownerName, balance);   
	        this.cardNo = cardNo;
	    }                                   
	    int pay(String cardNo, int amount) throws Exception {
	        if (!cardNo.equals(this.cardNo) || (balance < amount))
	            throw new Exception("지불이 불가능합니다.");
	        return withdraw(amount);
	    }
		@Override
		void printState() {
				System.out.println("*********Checking Account 의 계좌 현황입니다.***********");
				System.out.println("계좌번호  : "+ this.accountNo);
				System.out.println("계좌 주   : "+ this.ownerName);
				System.out.println("잔액      : "+ this.balance);
				System.out.println("카드 번호 : " +this.cardNo);
			}			
		}
	


