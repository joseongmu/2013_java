package kr.ac.mju.dislab.java.company;

public class Ceo extends Employee {//같은 패키지에 상속을 받은 클래스

	public Ceo(String name, String privacy, int salary, String companyProject) {
		super(name, privacy, salary, companyProject);
	}
	
	public static void main(String args[]){
		Ceo ceo = new Ceo("scott", "Secret", 200, "make giant dog");
		
		System.out.println(ceo.name);
		//System.out.println(ceo.privacy); private 접근 불가
		System.out.println(ceo.salary);
		System.out.println(ceo.companyProject);
		
		System.out.println(ceo.getName());
		//System.out.println(ceo.getPrivacy()); private 접근 불가
		System.out.println(ceo.getSalary());
		System.out.println(ceo.getCompanyProject());
	}
}
