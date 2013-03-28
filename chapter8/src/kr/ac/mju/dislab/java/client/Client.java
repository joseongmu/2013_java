package kr.ac.mju.dislab.java.client;

import kr.ac.mju.dislab.java.company.Employee;

public class Client {//다른 패키의 상속받지 않은 클래스
	
	public static void main(String args[]){
		Employee client = new Employee("Seoul", "passion", 200, "hurry up");
		
		System.out.println(client.name);
//		System.out.println(client.privacy); private 접근 불가
//		System.out.println(client.salary); protected 접근 불가
//		System.out.println(client.project); 생략 접근 불가
		
		System.out.println(client.getName());
//		System.out.println(client.getPrivacy()); private 접근 불가
//		System.out.println(client.getSalary()); protected 접근 불가
//		System.out.println(client.getCompanyProject()); 생략 접근 불가
	}
}
