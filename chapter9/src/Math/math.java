package Math;

import java.util.Scanner;

public class math {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("1~100 �� ���ڸ� �Է� �Ͻÿ� ");
		int game = (int)(Math.random()*100+1);
		int challenge = 0;
		
		while(true){
			
			int input = scan.nextInt();
			challenge ++;
			
			if(input<game)
			{
				System.out.println("�� ū���� �Է� �Ͻÿ�");
			}
			else if(input>game){
				System.out.println("���� ���� �Է� �Ͻÿ�");
			}
			else
			{
				System.out.println("������ "+input+"�Դϴ�. ����Ƚ����"+challenge+"�Դϴ�");
				break;
			}	
		}
	}
}
