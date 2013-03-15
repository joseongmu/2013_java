package stringbuffer;

import java.util.StringTokenizer;

public class StringBuilderExample {
	public static void main(String args[]) {
		StringBuilder sb1;
		sb1 = new StringBuilder("Hello"); // 문자열 입력시 문자열+16 크기의 버퍼생성
		StringTokenizer stok = new StringTokenizer("c언어 c++ 자바짱");
		StringTokenizer stok2 = new StringTokenizer("자바 , 루비 | 파스칼 ", "|");
		StringTokenizer stok3 = new StringTokenizer("사과=10 | 초콜릿=3 | 샴페인=1",
				"=|", true);
		
		System.out.println(sb1);
		System.out.println(sb1.append(", java"));
		System.out.println(sb1.insert(5, ", java2"));
		System.out.println(sb1.delete(5, 12));
		
		printStringBuilder(sb1);
		System.out.println(sb1.deleteCharAt(5));
		printStringBuilder(sb1);
		sb1.ensureCapacity(50); // 원하는 버퍼크기까지 늘려줌
		printStringBuilder(sb1);
		sb1.trimToSize(); // 버퍼 최소화
		printStringBuilder(sb1);

		while (stok.hasMoreTokens()) {
			String str = stok.nextToken();
			System.out.println(str);
		}

		String str2 = stok2.nextToken(); // 구획을 나누어주는 메소드
		System.out.println(str2);

		while (stok3.hasMoreTokens()) {

			String token = stok3.nextToken();
			if (token.equals("=")) {
				System.out.print("\t");
			} else if (token.equals("|")) {
				System.out.print("\n");
			} else {
				System.out.print(token);
			}

		}
	}

	public static void printStringBuilder(StringBuilder sb) {
		String str = sb.toString();
		int len = sb.length();
		int bufSize = sb.capacity();

		System.out.printf("%s (%d) : %d %n ", str, len, bufSize);
	}

}
