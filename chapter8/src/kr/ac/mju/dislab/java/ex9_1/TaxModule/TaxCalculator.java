package kr.ac.mju.dislab.java.ex9_1.TaxModule;

import kr.ac.mju.dislab.java.ex9_1.company.Employee;

// 다른 패키지의 상속받지 않은 클래스
public class TaxCalculator {

	public static void main(String args[]) {
		Employee client = new Employee("Tom", 1000, "11-333", "LG");

		System.out.println(client.name);
		// System.out.println(client.salary); private 접근 불가
		// System.out.println(client.project); default 접근 불가
		// System.out.println(client.telephone); protected 접근 불가

		System.out.println(client.getName());
		// System.out.println(client.getSalary()); private 접근 불가
		// System.out.println(client.getCompanyProject()); default 접근 불가
		// System.out.println(client.getTelephone()); protected 접근 불가
	}
}
