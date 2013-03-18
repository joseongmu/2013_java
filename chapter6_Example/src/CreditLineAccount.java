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
	            throw new Exception("������ �Ұ����մϴ�.");   
	        balance -= amount;
	        System.out.println(amount + "���� ����Ǿ����ϴ�.");
	        System.out.println("���� ���Ⱑ���� �ݾ��� "+(balance+creditLine)+ " �Դϴ�.");
	        return amount;
	    }
		@Override
		void printState() {
			System.out.println("*********�ſ�ī�� �ѵ� ������ �����Դϴ�.***********");
			System.out.println("���¹�ȣ 	 : "+ this.accountNo);
			System.out.println("���� ��  	 : "+ this.ownerName);
			System.out.println("�ܾ�     	 : "+ this.balance);
			System.out.println("ī�� �ܰ�     : " +this.creditLine);
		}
	}
	    
	
