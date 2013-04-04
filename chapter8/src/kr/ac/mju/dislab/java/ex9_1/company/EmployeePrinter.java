package kr.ac.mju.dislab.java.ex9_1.company;

//같은 패키지의 상속을 받지 않은 클래스
public class EmployeePrinter {

	public static void main(String args[]) {
		Employee employee = new Employee("Scott", 100, "111-222-3333", "MJU");

		System.out.println(employee.name);
		// System.out.println(employee.salary); private는 접근 불가
		System.out.println(employee.telephone);
		System.out.println(employee.companyName);

		System.out.println(employee.getName());
		// System.out.println(employee.getSalary()); private는 접근 불가
		System.out.println(employee.getTelephone());
		System.out.println(employee.getCompanyName());
	}
}
