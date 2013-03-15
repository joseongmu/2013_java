package stringbuffer;

import java.util.StringTokenizer;

public class StringBuilderExample {
	public static void main(String args[]) {
		StringBuilder sb1;
		sb1 = new StringBuilder("Hello"); // ���ڿ� �Է½� ���ڿ�+16 ũ���� ���ۻ���
		StringTokenizer stok = new StringTokenizer("c��� c++ �ڹ�¯");
		StringTokenizer stok2 = new StringTokenizer("�ڹ� , ��� | �Ľ�Į ", "|");
		StringTokenizer stok3 = new StringTokenizer("���=10 | ���ݸ�=3 | ������=1",
				"=|", true);
		
		System.out.println(sb1);
		System.out.println(sb1.append(", java"));
		System.out.println(sb1.insert(5, ", java2"));
		System.out.println(sb1.delete(5, 12));
		
		printStringBuilder(sb1);
		System.out.println(sb1.deleteCharAt(5));
		printStringBuilder(sb1);
		sb1.ensureCapacity(50); // ���ϴ� ����ũ����� �÷���
		printStringBuilder(sb1);
		sb1.trimToSize(); // ���� �ּ�ȭ
		printStringBuilder(sb1);

		while (stok.hasMoreTokens()) {
			String str = stok.nextToken();
			System.out.println(str);
		}

		String str2 = stok2.nextToken(); // ��ȹ�� �������ִ� �޼ҵ�
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
