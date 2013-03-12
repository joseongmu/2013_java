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
					System.out.print("학과명을 입력하세요 : ");
					String str = reader.readLine();
					arr1[i] = str;
				} else if (i == 1) {
					System.out.print("학번을 입력하세요 : ");
					String str = reader.readLine();
					arr1[i] = str;
				} else if (i == 2) {
					System.out.println("이름을 입력하세요 : ");
					String str = reader.readLine();
					arr1[i] = str;
				} else {
					String str = "정보가 없습니다.";
					arr1[i] = str;
				}
			}

			System.out.println("****************** 학생 정보 ******************");
			for (int i = 0; i < arr1.length; i++) {
				System.out.println(arr1[i]);
			}

		} catch (IOException e) {
			System.out.println("키보드 입력 에러");
		}

	}

}
