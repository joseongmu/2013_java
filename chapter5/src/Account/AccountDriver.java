package Account;
import java.util.Scanner;



public class AccountDriver {

	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		String n;
		String accountNumber;
		String name;

		System.out.print("생성할 계좌번호를 입력하세요 : ");
		accountNumber = scan.next();
		System.out.print("당신의 이름을 입력하세요 : ");
		name = scan.next();

		Account obj = new Account(accountNumber, name,  0);
		obj.printAccount();

		do {
			System.out.println("1. 예금, 2. 인출, 3. 종료");
			System.out.print("번호를 입력하세요 : ");
			n = scan.next();
			int money;
			if(n.equals("1")) {
				System.out.print("예금할 금액을 입력하세요 : ");
				money = scan.nextInt();
				obj.deposit(money);
				obj.printAccount();
			}else if(n.equals("2")) {
				System.out.print("인출할 금액을 입력하세요 : ");
				money = scan.nextInt();
				try {
					obj.withdraw(money);
				} catch (Exception e) {
					String msg = e.getMessage();
					System.out.println(msg);
				}
				obj.printAccount();
			}
		}while(!n.equals("3"));
	}
}

