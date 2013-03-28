package kr.ac.mju.dislab.java.company;
/*
 * 클래스가 속한 패키지의 위치 
 * 접근제어 KeyWord에 따른 메소드와 변수의 접근 권한을 알아보기 위한 예제입니다.
 */
public class Employee {
	
	public String name;//이름
	private String privacy;//사생활
	protected int salary;//월급
	String companyProject; //직원이 일하고 있는 회사 내부 프로젝트
	
	public Employee (String name, String privacy, int salary, String companyProject) {
		this.name = name;
		this.privacy = privacy;
		this.salary = salary;
		this.companyProject = companyProject;
	}
	
	public String getName() {
		return this.name;
	}
	
	private String getPrivacy() {
		return this.privacy;
	}
	
	protected int getSalary() {
		return this.salary;
	}
	
	String getCompanyProject() {
		return this.companyProject;
	}
	
	public static void main(String args[]){
		Employee employee = new Employee("scott", "Secret", 200, "make giant dog");
		
		System.out.println(employee.name);
		System.out.println(employee.privacy);
		System.out.println(employee.salary);
		System.out.println(employee.companyProject);
		
		System.out.println(employee.getName());
		System.out.println(employee.getPrivacy());
		System.out.println(employee.getSalary());
		System.out.println(employee.getCompanyProject());
	}
}
