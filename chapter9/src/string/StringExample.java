package string;

public class StringExample {
	public static void main(String args[]) {
		String str1 = "�̹��б� �ڹٴ� A ";
		String str2 = str1.replace("A", "����ִ�.");
		String str3 = str2.concat("�׷��ϱ� ������ !");
		String str6 = "�̹��б� �ڹٴ� A ";
		String str7 = new String("�ڹ�");
		String str8 = new String("�ڹ�");
		int str4 = str3.length();
		// ex1
		System.out.println("*** Beginning sentence ***");
		System.out.println(str1);
		System.out.println("*** use replace method ***");
		System.out.println(str2);
		System.out.println("*** use concat method ***");
		System.out.println(str3);
		System.out.println("*** use length method ***");
		System.out.println(str4);
		System.out.println("*** use charAt method ***");
		// ex2 (charAt)
		for (int str5 = 0; str5 < str4; str5++) {
			char ch = str3.charAt(str5);
			System.out.println(ch);
		}

		// ex3 compare String
		System.out.println("*** compare just Sentence  ***");
		if (str1 == str6) {
			System.out.println("����");
		} else if (str1 != str6) {
			System.out.println("�ٸ�");
		}
		
		System.out.println("*** compare Object of String ***");
		if (str7 == str8) {
			System.out.println("����");
		} else if (str7 != str8) {
			System.out.println("�ٸ�");
		}
		
		System.out.println("*** compare sentence with equals method ***");
		if (str1.equals(str6))
			System.out.println("����");
		else
			System.out.println("�ٸ�");
		System.out.println("*** compare object with equals method ***");
		if (str7.equals(str8))
			System.out.println("����");
		else
			System.out.println("�ٸ�");
		// use substring
		System.out.println("*** use substring method ***");
		System.out.println(str1.substring(4));
		System.out.println(str1.substring(4, 7));

	}

}
