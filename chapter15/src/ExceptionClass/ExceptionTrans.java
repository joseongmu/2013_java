package ExceptionClass;

import java.util.Scanner;

public class ExceptionTrans {
	public static int a;
	public static int b;
	
	public static void main(String args[])
	{
	try{
		System.out.println("나눗셈을 할 두개의 값을 입력 하시오.");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		
		System.out.println("두개의 변수의 값 : ");
		System.out.println("a = "+a +"b = "+b);
		System.out.println("*****************");
		System.out.println("a() 메소드의 호출전");
		a();
		System.out.println("a() 메소드의 호출후");
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException 예외가 발생하였습니다.");
			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException 에서의 예외가 발생하였습니다. ");
			e.printStackTrace();
		}catch(ClassCastException e)
		{
			System.out.println("ClassCastException 예외가 발생하였습니다. ");
			System.out.println(e);
		}catch(Exception e)
		{
			System.out.println("예외가 발생하였습니다. 예외 명 :");
			e.printStackTrace();
		}
		finally{
			System.out.println("무조건 실행되는 finally 부분입니다 .");
				}
	}
		public static void a() throws ClassCastException,
					ArrayIndexOutOfBoundsException,
								ArithmeticException 
		{
						System.out.println("b()메소드 호출전");
						b();
						System.out.println("b()메소드 호출후");
		}

		public static void b() throws ClassCastException,
							ArrayIndexOutOfBoundsException
		{
						System.out.println("c() 메소드 호출전");
						c();
						System.out.println("c() 메소드 호출후");
		}

		public static void c() throws ClassCastException 
		{
						System.out.println("최종 메소드 예외 발생 문장 수행전");
						System.out.println("a 를 b로 나눈 몫 ="+(a/b));
						System.out.println("최종 메소드 예외 발생 문장 수행후");
		}

}
