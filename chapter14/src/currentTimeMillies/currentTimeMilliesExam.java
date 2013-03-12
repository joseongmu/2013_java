package currentTimeMillies;

public class currentTimeMilliesExam {
	public static void main(String[] args) {

		long time1 = System.currentTimeMillis();
		double total = 0.0;
		for (int cnt = 1; cnt < 1000000000; cnt += 2) {
			if (cnt / 2 % 2 == 0) {
				total += 1.0 / cnt;
			} else {
				total -= 1.0 / cnt;
			}
		}

		double pi = total * 4;
		long time2 = System.currentTimeMillis();
		System.out.println("result = " + pi);
		System.out.printf("��꿡 %d ms�� �ҿ�Ǿ����ϴ�.", time2 - time1);

	}
}
