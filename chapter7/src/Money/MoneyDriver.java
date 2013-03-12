package Money;

import java.util.Scanner;

public class MoneyDriver {

	public static void main(String[] args) {
		String country;
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �̸��� �Է��ϼ���(�̱�, �Ϻ�, �߱�) : ");
		country = scan.next();

		if (country.equals("�̱�")) {
			Money money = new Money(country, Money.Currency.DOLLAR);
			money.printInfo(money);
		} else if (country.equals("�Ϻ�")) {
			Money money = new Money(country, Money.Currency.YEN);
			money.printInfo(money);
		} else if (country.equals("�߱�")) {
			Money money = new Money(country, Money.Currency.YUAN);
			money.printInfo(money);
		} else {
			System.out.println("�ٽ� �Է��ϼ���.");
		}
	}

}
