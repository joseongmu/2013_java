package BufferedReader;

import java.io.*;

public class BufferedReaderExam {
	public static void main(String[] args) {

		String arr1[] = new String[5];

		try {
			for (int i = 0; i < 5; i++) {
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(System.in));

				if (i == 0) {
					System.out.print("�а����� �Է��ϼ��� : ");
					String str = reader.readLine();
					arr1[i] = str;
				} else if (i == 1) {
					System.out.print("�й��� �Է��ϼ��� : ");
					String str = reader.readLine();
					arr1[i] = str;
				} else if (i == 2) {
					System.out.println("�̸��� �Է��ϼ��� : ");
					String str = reader.readLine();
					arr1[i] = str;
				} else {
					String str = "������ �����ϴ�.";
					arr1[i] = str;
				}
			}

			System.out.println("****************** �л� ���� ******************");
			for (int i = 0; i < arr1.length; i++) {
				System.out.println(arr1[i]);
			}

		} catch (IOException e) {
			System.out.println("Ű���� �Է� ����");
		}

	}

}
