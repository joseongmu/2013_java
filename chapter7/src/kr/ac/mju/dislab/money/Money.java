package kr.ac.mju.dislab.money;

public class Money {
	enum Currency {
		DOLLAR("108원"), YEN("11원"), YUAN("173원");
		final private String changeMoney;

		Currency(String changeMoney) {
			this.changeMoney = changeMoney;
		}

		String value() {
			return changeMoney;
		}
	}

	String country;
	Currency currency;

	Money(String country, Currency currency) {
		this.country = country;
		this.currency = currency;
	}

	void printInfo() {
		System.out.println("-----------------------------------------");
		System.out.println("나라 이름 : " + this.country);
		System.out.println("화폐 이름 : " + this.currency);
		System.out.println("환율 : " + currency.value());
		System.out.println("-----------------------------------------");
	}
}
