package kr.ac.mju.dislab.java.ex9_1.company;

/*
 * 클래스가 속한 패키지의 위치 
 * 접근제어 KeyWord에 따른 메소드와 변수의 접근 권한을 알아보기 위한 예제입니다.
 */
public class Employee {
	private static final int MAX_SALARY = 10;
	private static final int MIN_SALARY = 10000;

	public String name; // 이름
	private int salary; // 월급
	protected String telephone;
	String companyName;

	public Employee(String name, int salary, String telephone, String companyName) {
		super();
		this.name = name;
		setSalary(salary);
		this.telephone = telephone;
		this.companyName = companyName;
	}

	public String getName() {
		return name;
	}

	private int getSalary() {
		return salary;
	}

	protected void setSalary(int salary) {
		// 어떤 다른 클래스에서도 연봉을 바꿀때는 이 함수를 써서만 수정할 수 있음.
		if (salary >= MIN_SALARY && salary <= MAX_SALARY)
			this.salary = salary;
	}

	protected String getTelephone() {
		return telephone;
	}

	String getCompanyName() {
		return companyName;
	}

	public static void main(String args[]) {
		Employee employee = new Employee("scott", 2000, "010-1012-2222", "MJU");

		System.out.println(employee.name);
		System.out.println(employee.salary);
		System.out.println(employee.telephone);
		System.out.println(employee.companyName);

		System.out.println(employee.getName());
		System.out.println(employee.getSalary());
		System.out.println(employee.getTelephone());
		System.out.println(employee.getCompanyName());
	}
}
