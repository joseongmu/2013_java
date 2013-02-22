package Account;
import java.util.Scanner;



public class AccountDriver {

	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		String n;
		String accountNumber;
		String name;

		System.out.print("������ ���¹�ȣ�� �Է��ϼ��� : ");
		accountNumber = scan.next();
		System.out.print("����� �̸��� �Է��ϼ��� : ");
		name = scan.next();

		Account obj = new Account(accountNumber, name,  0);
		obj.printAccount();

		do {
			System.out.println("1. ����, 2. ����, 3. ����");
			System.out.print("��ȣ�� �Է��ϼ��� : ");
			n = scan.next();
			int money;
			if(n.equals("1")) {
				System.out.print("������ �ݾ��� �Է��ϼ��� : ");
				money = scan.nextInt();
				obj.deposit(money);
				obj.printAccount();
			}else if(n.equals("2")) {
				System.out.print("������ �ݾ��� �Է��ϼ��� : ");
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

