package kr.ac.mju.dislab.java.ex9_1.TaxModule;

import kr.ac.mju.dislab.java.ex9_1.company.Employee;

//다른 패키지의 상속받은 클래스
public class TaxableEmployee extends Employee {
	double taxRatio;

	public TaxableEmployee(String name, int salary, String contact, double taxRatio) {
		super(name, salary, contact, "NONE");
		this.taxRatio = taxRatio;
	}

	public void contact() {
		System.out.println("Contact to " + getTelephone());
	}

	public static void main(String args[]) {
		TaxableEmployee partner = new TaxableEmployee("Tom", 1000, "11-333", 0.1);

		System.out.println(partner.name);
		// System.out.println(partner.salary); private 접근 불가
		// System.out.println(partner.companyName); default 접근 불가

		System.out.println(partner.getName());
		// System.out.println(partner.getSalary()); private 접근 불가
		// System.out.println(partner.getCompanyName()); 생략 접근 불가

		partner.contact();
	}
}
