package math;

import java.util.Scanner;

public class math {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int game = (int)(Math.random()*100+1);
		int challenge = 0;
		
		System.out.println("1~100 의 숫자를 입력 하시오 ");
		while(true){
			
			int input = scan.nextInt();
			challenge ++;
			if(input<game){
				System.out.println("더 큰수를 입력 하시오");
			}else if(input>game){
				System.out.println("작은 수를 입력 하시오");
			}else{
				System.out.println("정답은 "+input+"입니다. 도전횟수는"+challenge+"입니다");
				break;
			}	
		}
		scan.close();
	}
}
