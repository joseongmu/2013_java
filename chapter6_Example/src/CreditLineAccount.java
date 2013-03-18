 class CreditLineAccount extends Account {
	 int creditLine;                        
	 int amount;   
	 CreditLineAccount(String accountNo, String ownerName, 
	                      int balance,int creditLine){
	        super(accountNo, ownerName, balance);
	        this.creditLine = creditLine;
	    }    
	    int withdraw(int amount) throws Exception { 
	        if ((balance + creditLine) < amount)    
	            throw new Exception("인출이 불가능합니다.");   
	        balance -= amount;
	        System.out.println(amount + "원이 인출되었습니다.");
	        System.out.println("현재 인출가능한 금액은 "+(balance+creditLine)+ " 입니다.");
	        return amount;
	    }
		@Override
		void printState() {
			System.out.println("*********신용카드 한도 계좌의 계좌입니다.***********");
			System.out.println("계좌번호 	 : "+ this.accountNo);
			System.out.println("계좌 주  	 : "+ this.ownerName);
			System.out.println("잔액     	 : "+ this.balance);
			System.out.println("카드 잔고     : " +this.creditLine);
		}
	}
	    
	
