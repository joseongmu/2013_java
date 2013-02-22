package Money;

public class Money {
	enum Currency {
		DOLLAR("108��"), YEN("11��"), YUAN("173��");
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
	
	void printInfo(Money money) {
		System.out.println("-------------------------------------------------------------");
		System.out.println("���� �̸� : " + money.country);
		System.out.println("ȭ�� �̸� : " + money.currency);
		System.out.println("ȯ�� : " + currency.value());
		System.out.println("-------------------------------------------------------------");
	}
}
