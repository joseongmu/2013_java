package kr.ac.mju.dislab.money;

import java.util.Scanner;

public class MoneyDriver {

	public static void main(String[] args) {
		String country;
		Scanner scan = new Scanner(System.in);
		System.out.print("나라 이름을 입력하세요(미국, 일본, 중국) : ");
		country = scan.next();

		if (country.equals("미국")) {
			Money money = new Money(country, Money.Currency.DOLLAR);
			money.printInfo();
		} else if (country.equals("일본")) {
			Money money = new Money(country, Money.Currency.YEN);
			money.printInfo();
		} else if (country.equals("중국")) {
			Money money = new Money(country, Money.Currency.YUAN);
			money.printInfo();
		} else {
			System.out.println("다시 입력하세요.");
		}
	}

}

