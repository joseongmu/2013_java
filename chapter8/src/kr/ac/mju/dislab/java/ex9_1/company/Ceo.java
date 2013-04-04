package kr.ac.mju.dislab.java.ex9_1.company;

public class Ceo extends Employee {// 같은 패키지에 상속을 받은 클래스
	Employee secretary;

	public Ceo(String name, int salary, String telephone, String companyName, Employee secretary) {
		super(name, salary, telephone, companyName);
		this.secretary = secretary;
	}

	private void giveIncentive() {
		setSalary(10000);
	}

	private void contactCeo(String msg) {
		if (secretary.getTelephone() != null) {
			System.out.println("Call to secretary");
		} else {
			System.out.println("Call to CEO");
		}
	}

	public static void main(String args[]) {
		Employee secretary = new Employee("Scott", 100, "111-222-3333", "MJU");
		Ceo ceo = new Ceo("James", 200, "011-233-1111", "MJU", secretary);
		ceo.giveIncentive();

		System.out.println(ceo.name);
		// System.out.println(ceo.salary);
		System.out.println(ceo.companyName);

		System.out.println(ceo.getName());
		// System.out.println(ceo.getSalary());
		System.out.println(ceo.getCompanyName());
		ceo.contactCeo("HELP ME!");
	}
}
