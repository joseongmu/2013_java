package Wapper;

public class WapperClass {
	public static void main(String args[])
	{
		
		Double num1 = new Double(12.34);
		Double num2 = new Double(12.34);
		
		compairtype1(num1,num2);
		compairtype2(num1,num2);
								//�ڵ� boxing �� ��
		compairtype1(num1,12.34);
		compairtype2(num1,12.34);
	}

	public static void compairtype1(Double double1, Double double2) {
		System.out.println("'equals' ������ ��");
		if (double1.equals(double2)) {

			System.out.println("�����ϴ�");
		} else {
			System.out.println("�ٸ��ϴ�");
		}
		System.out.println("'==' ������ ��");
		if (double1 == double2) {
			System.out.println("�����ϴ�");
		} else {
			System.out.println("�ٸ��ϴ�");
		}
		System.out.println("******************");
	}

	public static void compairtype2(double num1, double num2) {
		System.out.println("'==' ������ ��");
		if (num1 == num2) {
			System.out.println("�����ϴ�");
		} else {
			System.out.println("�ٸ��ϴ�");
		}
		System.out.println("******************");

	}

}
