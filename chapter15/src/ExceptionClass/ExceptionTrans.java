package ExceptionClass;

import java.util.Scanner;

public class ExceptionTrans {
	public static int a;
	public static int b;
	
	public static void main(String args[])
	{
	try{
		System.out.println("�������� �� �ΰ��� ���� �Է� �Ͻÿ�.");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		
		System.out.println("�ΰ��� ������ �� : ");
		System.out.println("a = "+a +"b = "+b);
		System.out.println("*****************");
		System.out.println("a() �޼ҵ��� ȣ����");
		a();
		System.out.println("a() �޼ҵ��� ȣ����");
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException ���ܰ� �߻��Ͽ����ϴ�.");
			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException ������ ���ܰ� �߻��Ͽ����ϴ�. ");
			e.printStackTrace();
		}catch(ClassCastException e)
		{
			System.out.println("ClassCastException ���ܰ� �߻��Ͽ����ϴ�. ");
			System.out.println(e);
		}catch(Exception e)
		{
			System.out.println("���ܰ� �߻��Ͽ����ϴ�. ���� �� :");
			e.printStackTrace();
		}
		finally{
			System.out.println("������ ����Ǵ� finally �κ��Դϴ� .");
				}
	}
		public static void a() throws ClassCastException,
					ArrayIndexOutOfBoundsException,
								ArithmeticException 
		{
						System.out.println("b()�޼ҵ� ȣ����");
						b();
						System.out.println("b()�޼ҵ� ȣ����");
		}

		public static void b() throws ClassCastException,
							ArrayIndexOutOfBoundsException
		{
						System.out.println("c() �޼ҵ� ȣ����");
						c();
						System.out.println("c() �޼ҵ� ȣ����");
		}

		public static void c() throws ClassCastException 
		{
						System.out.println("���� �޼ҵ� ���� �߻� ���� ������");
						System.out.println("a �� b�� ���� �� ="+(a/b));
						System.out.println("���� �޼ҵ� ���� �߻� ���� ������");
		}

}
