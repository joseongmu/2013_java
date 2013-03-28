package kr.ac.mju.dislab.java.partner;

import kr.ac.mju.dislab.java.company.Employee;

public class Partner extends Employee{//다른 패키지의 상속받은 클래스

	public Partner(String name, String privacy, int salary, String companyProject) {
		super(name, privacy, salary, companyProject);
	}
	
	public static void main(String args[]){
		Partner partner = new Partner("Seoul", "passion", 200, "hurry up");
		
		System.out.println(partner.name);
		//System.out.println(partner.privacy); private 접근 불가
		System.out.println(partner.salary);
		//System.out.println(partner.companyProject); 생략 접근 불가
		
		System.out.println(partner.getName());
		//System.out.println(partner.getPrivacy()); private 접근 불가
		System.out.println(partner.getSalary());
		//System.out.println(partner.getCompanyProject()); 생략 접근 불가
	}
}
