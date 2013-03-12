package Wapper;

public class WapperClass {
	public static void main(String args[])
	{
		
		Double num1 = new Double(12.34);
		Double num2 = new Double(12.34);
		
		compairtype1(num1,num2);
		compairtype2(num1,num2);
								//자동 boxing 의 예
		compairtype1(num1,12.34);
		compairtype2(num1,12.34);
	}

	public static void compairtype1(Double double1, Double double2) {
		System.out.println("'equals' 으로의 비교");
		if (double1.equals(double2)) {

			System.out.println("같습니다");
		} else {
			System.out.println("다릅니다");
		}
		System.out.println("'==' 으로의 비교");
		if (double1 == double2) {
			System.out.println("같습니다");
		} else {
			System.out.println("다릅니다");
		}
		System.out.println("******************");
	}

	public static void compairtype2(double num1, double num2) {
		System.out.println("'==' 으로의 비교");
		if (num1 == num2) {
			System.out.println("같습니다");
		} else {
			System.out.println("다릅니다");
		}
		System.out.println("******************");

	}

}
