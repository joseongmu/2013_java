package kr.ac.mju.tahiti;

public class TestDriver {
	private final static int MAX = 1000;
	public static String string =" ";
	public static StringBuilder stringBuilder;
	public static StringBuffer stringBuffer;

	public static void main(String args[]) {

		StringBufferTimer();
		StringBuilderTimer();
		StringTimer();
	}

	public static void StringBufferTest() {
		stringBuffer = new StringBuffer();
		for (int init = 1; init < MAX; init++) {
			stringBuffer.append(init + "+");

		}
		stringBuffer.append(MAX);
		System.out.println(stringBuffer);
	}

	public static void StringBuilderTest() {
		stringBuilder = new StringBuilder();
		for (int init = 1; init < MAX; init++) {
			stringBuilder.append(init + "+");
		}
		stringBuilder.append(MAX);
		System.out.println(stringBuilder);
	}

	public static void StringTest() {

		for (int init = 1; init < 1000; init++) {
			string += init + "+";
		}
			string += MAX;
		System.out.println(string);
	}

	public static void StringBufferTimer() {
		long start = System.currentTimeMillis();
		System.out.println(start);
		StringBufferTest();
		long end = System.currentTimeMillis();
		System.out.println(end);
		System.out.println("StringBuffer 문자열 추가 연산의 걸리는시간 : " + (end-start));

	}

	public static void StringBuilderTimer() {
		long start = System.currentTimeMillis();
		System.out.println(start);
		StringBuilderTest();
		long end = System.currentTimeMillis();
		System.out.println(end);
		System.out.println("StringBuilder 문자열 추가 연산의 걸리는시간 : " + (end-start));

	}

	public static void StringTimer() {
		long start = System.currentTimeMillis();
		System.out.println(start);
		StringTest();
		long end = System.currentTimeMillis();
		System.out.println(end);
		System.out.println("String 문자열 추가 연산의 걸리는시간 : " + (end-start));
	}

}
