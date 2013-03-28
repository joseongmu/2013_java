package kr.ac.mju.dislab.java.company;

public class PartTimeJob {//같은 패키지의 상속을 받지 않은 클래스
	
	public static void main(String args[]){
		Employee partTimeJob = new Employee("scott", "Secret", 200, "make giant dog");
		
		System.out.println(partTimeJob.name);
		//System.out.println(partTimeJob.privacy); private 접근 불가
		System.out.println(partTimeJob.salary);
		System.out.println(partTimeJob.companyProject);
		
		System.out.println(partTimeJob.getName());
		//System.out.println(partTimeJob.getPrivacy()); private 접근 불가
		System.out.println(partTimeJob.getSalary());
		System.out.println(partTimeJob.getCompanyProject());
	}
}
